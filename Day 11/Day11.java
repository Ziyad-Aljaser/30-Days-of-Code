import java.util.Scanner;

public class Day11 {

    public static int MaximumSumCalculator (int[][] arr) {
        int iAdd = 0;
        int jAdd = 0;
        int track = 0;
        int newCount = 0;
        int lastCount = 0;
      
        while (track < 16) {
            if (jAdd == 4) {
                jAdd = 0;
                iAdd++;
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i != 1) {
                    newCount = newCount + arr[i+iAdd][j+jAdd];
                }   else {
                    if (i == j) {
                        newCount = newCount + arr[i+iAdd][j+jAdd];
                        break;
                    }
                }
                }
            }
            if (track == 0) {
                lastCount = newCount;
            }
            if (newCount >= lastCount) {
                lastCount = newCount;
            }
            newCount = 0;
            track++;
            jAdd++;
        }
        return lastCount;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int [6][6]; 
      
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scan.nextInt(); 
            }
        }

        int maximumSum = MaximumSumCalculator(arr);
      
        System.out.printf("%d", maximumSum);
    }
}