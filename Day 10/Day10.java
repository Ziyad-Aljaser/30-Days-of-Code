import java.util.Scanner;

public class Day10 {
   
    static int lastMax = 0;
    static int newMax = 0;
   
    public static void MaxOnes (int r) {
        if (r == 1) {
            newMax++;
            if (newMax >= lastMax) {
                lastMax = newMax;
            }
        }   else {
            newMax = 0;
        }
    }
   
    public static int BinaryConverter (int n) {
        if (n <= 0) {
            return 0;
        }   else {
            int d = n/2;
            int r = n%2;
            n = d;
            MaxOnes(r);
            return BinaryConverter(n);
        }
    }
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
      
        BinaryConverter(n);
      
        System.out.println(lastMax);
    }
}
