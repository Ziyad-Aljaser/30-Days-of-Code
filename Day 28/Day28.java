import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Day28 {

    public static boolean checkEmail(String email) {
   
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                String check = email.substring(i, email.length());
                if (check.equals("@gmail.com")) {
                    return true;
                }   else {
                    return false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();   
      
        int n = scan.nextInt();
      
        for (int i = 0; i < n; i++) {
            String userName = scan.next();
            String email = scan.next();
            if (checkEmail(email)) {
                list.add(userName);
            }
        }

        Collections.sort(list);

        //using for-each loop    
        for (String str : list) {               
            System.out.println(str);         
        }

    }
}
