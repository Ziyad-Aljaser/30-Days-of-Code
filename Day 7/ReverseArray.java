import java.util.Scanner;

public class ReverseArray {
   
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] A = new int[n];
   
    public ReverseArray () {
        for (int i = n-1; i >= 0; i--) {
            A[i] = scan.nextInt();
        }
    }
   
    public void PrintArray() {
        for (int p : A) {
            System.out.printf("%d ", p);
        }
    }
}
