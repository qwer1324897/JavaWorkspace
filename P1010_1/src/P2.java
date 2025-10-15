import java.util.*;
public class P2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in) ;

        String s = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < s.length(); i ++) {
            int num = s.charAt(i) - '0';

            sum += num;
        } 

        int result = 45 - sum;

        System.out.println(result);



        scanner.close();


    }
}
