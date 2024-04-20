import java.util.Scanner;
import java.util.InputMismatchException;

public class Day16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f = "";
      
        try {
            int i = sc.nextInt();
            f = Integer.toString(i);
        }   catch (InputMismatchException e) {
            f = "Bad String";
        }   finally {
            System.out.print(f);
        }
    }
}
