import java.util.Scanner;

// Convert reader to scanner
public class Day9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        Result r = new Result();
        int result = r.factorial(n);

        System.out.print(result);
    }
}
