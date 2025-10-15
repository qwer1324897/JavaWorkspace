import java.util.*;
public class P3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int a = s.charAt(0) - '0';
        int b = s.charAt(2) - '0';

        int result = a*b;

        System.out.println(result);

        scanner.close();




    }
}
