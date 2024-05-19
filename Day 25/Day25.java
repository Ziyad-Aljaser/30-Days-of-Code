import java.util.Scanner;

public class Day25 {
    
    public static String isPrime(int check) {
        
        for (int i = 2; i <= 1000; i++) {
            if (check == 1 || (check % i == 0 && check != i)) {
                return "Not prime";
            }
        }
        return "Prime";
    }

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        int n = scan.nextInt();
        int[] data = new int[n];
      
        for (int i = 0; i < n; i++) {
            data[i] = scan.nextInt();
        }
      
        for (int i = 0; i < n; i++) {
            System.out.println(isPrime(data[i]));
        }
    }
}
