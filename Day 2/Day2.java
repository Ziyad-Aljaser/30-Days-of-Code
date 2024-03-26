import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Result {
    
    static double meal;
    static double tip; 
    static double tax;
    static int total;
    
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        meal = meal_cost;
        tip = tip_percent;
        tax = tax_percent;
        
        tax = (tax/100) * meal;
        tip = (tip/100) * meal;
        
        total = (int)Math.round(meal + tip + tax);
        
        System.out.println(total);
    }
}

public class Day2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
