// Day 20

import java.util.Scanner;

public class Day20 {
   
    public static void swap (int[] a, int x, int y, int j) {
        a[j] = y;
        a[j+1] = x;
    }
   
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
      
        int[] a = new int[n];
      
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
      
        // Track number of elements swapped during a single array traversal
        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    swap(a, a[j], a[j + 1], j);
                    numberOfSwaps++;
                }
            }
          
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]); 
    }
}
