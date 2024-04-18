import java.lang.Math;

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] arr) {
        this.elements = arr;
    }
   
    public void computeDifference() {
        int comparMaxDiff = 0;
        maximumDifference = 0;
      
        for (int i = 0; i < elements.length-2; i++) {
            for (int j = 1; j < elements.length-i; j++) {
                comparMaxDiff = Math.abs(elements[i]-elements[j]);
                if (comparMaxDiff > maximumDifference) {
                    maximumDifference = comparMaxDiff;
                }
            }   
        }
    }
}
