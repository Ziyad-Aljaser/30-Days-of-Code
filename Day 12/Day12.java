import java.util.Scanner;

class Day12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstN = scan.next();
        String lastN = scan.next();
      
        int idNum = scan.nextInt();
        int numOfScores = scan.nextInt();
      
        int[] testScores = new int[numOfScores];
      
        for (int i = 0; i < numOfScores; i++) {
            testScores[i] = scan.nextInt();
        }
      
        Student student = new Student(firstN, lastN, idNum, numOfScores, testScores);
      
        student.CalculateAvg();
        student.CalculateGrade();
        student.printPerson();
        student.printStudentGrade();
    }
}
