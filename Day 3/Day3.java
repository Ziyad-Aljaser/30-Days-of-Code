import java.util.Scanner;

public class Day3 {

   public static String Check (int n) {
        if (n % 2 == 1) {
            return "Weird";
        }
        else if (n >= 2 && n <= 5) {
            return "Not Weird";
        }
        else if (n >= 6 && n <= 20) {
            return "Weird";
        }   else {
            return "Not Weird";
        }
    }
   
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
      
        String result = Check(n);
        System.out.println(result);
   }
    
}
