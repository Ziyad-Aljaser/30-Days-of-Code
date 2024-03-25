import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        Scanner scan = new Scanner(System.in);
        int ii = i + scan.nextInt();
        double dd = d + scan.nextDouble();
        String ignore = scan.nextLine();
        String str = s + scan.nextLine();
        System.out.printf("%d %n%.1f %n%s", ii, dd, str);
    }
}
