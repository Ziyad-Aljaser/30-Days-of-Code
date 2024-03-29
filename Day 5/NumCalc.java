import java.util.Scanner;

public class NumCalc {
   
    int max;
    int theNUMBER;
    Scanner scan = new Scanner(System.in);
    int total;
   
    public NumCalc() {
        max = 10;
        theNUMBER = scan.nextInt();
    }
   
    public void play() {
        for (int i = 1; i <= max; i++) {
            total = theNUMBER * i;
            System.out.printf("%d x %d = %d %n", theNUMBER, i, total);
        }
    }
}