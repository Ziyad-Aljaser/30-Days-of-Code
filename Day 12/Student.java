class Student extends Person {
    private int[] testScores;
    private int numOfScores;
    private char grade;
    private double avg;
   
    public Student(String firstName, String lastName, int idNumber, int numOfScores, int[] testScores) {
        super(firstName, lastName, idNumber);
        this.numOfScores = numOfScores;
        this.testScores = testScores;
    }

   
    public void CalculateAvg() {
        for (int i = 0; i < numOfScores; i++) {
            avg = avg + testScores[i];
        }
        avg = (avg/numOfScores);
    }
   
    public void CalculateGrade() {
        if (avg >= 90 && avg <= 100) {
            grade = 'O';
        }   else if (avg >= 80 && avg < 90) {
            grade = 'E';
        }   else if (avg >= 70 && avg < 80) {
            grade = 'A';
        }   else if (avg >= 55 && avg < 70) {
            grade = 'P';
        }   else if (avg >= 40 && avg < 55) {
            grade = 'D';
        }   else {
            grade = 'T';
        }
    }
   
    public char getGrade() {
        return grade;
    }
   
    public void printStudentGrade() {
        System.out.println("Grade: " + getGrade());
    }
}