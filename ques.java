import java.util.Scanner;
class OutOfBoundException extends Exception {
    OutOfBoundException(String mess){
        super(mess);
    }
    public static String message =  "The string is too long.";
    public static void generate(String s) throws OutOfBoundException {
        if(s.length()>5){
            throw new OutOfBoundException(OutOfBoundException.message);
        }
    }
}
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        try{
            OutOfBoundException.generate(s);
        } catch ( OutOfBoundException e) {
            System.err.print(e);
        }
    }
}
