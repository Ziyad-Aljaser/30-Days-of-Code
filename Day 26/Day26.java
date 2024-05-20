import java.util.Scanner;

public class Day26 {

    public static int Fee(int[] r, int[] d) {
        int fee = 0;
      
        if (r[0] > d[0]) {
            fee = (r[0] - d[0]) * 15;
        }
      
        if (r[1] > d[1]) {
            fee =+ (r[1] - d[1]) * 500;
        }
      
        if (r[2] > d[2]) {
            fee = 10000;
        }   else if (r[2] < d[2]) {
            fee = 0;
        }
      
        return fee;
    }

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
      
        int[] dateReturned = new int[3];
        int[] dateDue = new int[3];
      
        for (int i = 0; i < dateReturned.length; i++) {
            dateReturned[i] = scan.nextInt();
        }
      
        for (int i = 0; i < dateDue.length; i++) {
            dateDue[i] = scan.nextInt();
        }
      
        System.out.println(Fee(dateReturned, dateDue));
    }
}
