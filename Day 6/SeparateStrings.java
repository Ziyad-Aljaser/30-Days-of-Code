import java.util.Scanner;

public class SeparateStrings {
   
    Scanner scan = new Scanner(System.in);
    int numOfWords = scan.nextInt();
    String word;
   
    public SeparateStrings () {
        for (int i = 0; i < numOfWords; i++) {
            word = scan.next();
            count(word);
        }
    }
   
    public void count(String w) {
        String firstHalfWord = "";
        String secondHalfWord = "";
      
        for (int i = 0; i < w.length(); i++) {
            if (i % 2 == 0) {
                firstHalfWord = firstHalfWord + w.charAt(i);
            }   else {
                secondHalfWord = secondHalfWord + w.charAt(i);
            }
        }
        System.out.printf("%s %s%n", firstHalfWord, secondHalfWord);
    }
}   
