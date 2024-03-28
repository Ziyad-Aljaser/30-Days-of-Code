import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int initialAge = scan.nextInt();
            Person personAge = new Person(initialAge);
            personAge.amIOld();
            personAge.yearPasses();
            personAge.amIOld();
            System.out.println();
        }
    }
}
