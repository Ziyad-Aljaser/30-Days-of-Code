import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Day8 {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> phoneNumbersDictionary = new HashMap<String, Integer>();
      
        int n = scan.nextInt();
      
        String name;
        int phoneNumber;
        for (int i = 0; i < n; i++) {
            name = scan.next();
            phoneNumber = scan.nextInt();
            phoneNumbersDictionary.put(name, phoneNumber);
        }
      
        String check;
        while (scan.hasNext()) {
            check = scan.next();
            if (phoneNumbersDictionary.containsKey(check)) {
                System.out.println(check + "=" + phoneNumbersDictionary.get(check));
            }   else {
                System.out.println("Not found");
            }
        } 
    }
}
