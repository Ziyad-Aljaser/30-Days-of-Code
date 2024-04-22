import java.lang.Math;
import java.util.Scanner;

public class Day17 {
   
    public static void myCalculator (double n, double p) throws NegativeNumberException {
        if (n < 0 || p < 0) {
            throw new NegativeNumberException();
        }
    }
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        int num = scan.nextInt();
      
        while (num-- > 0) {
            int n = scan.nextInt();
            int p = scan.nextInt();
         
            try {
                myCalculator(n, p);
                System.out.println((int)Math.pow(n, p));
            }   catch (NegativeNumberException e1) {
                System.out.println("n and p should be non-negative");
            }
         
        }
    }   
}
