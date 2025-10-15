import java.util.*;
public class P4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        int counterAA = 0;
        int counterAa = 0;
        
        for (int i = 0; i < s.length(); i ++) {
            int a = s.charAt(i);
            
            if (a <= 90);{
                counterAA += 1;
                if (counterAA >= 2){
                    System.out.println("No");
                    System.exit(0);
                }
            }

            if (a >= 95);{
                counterAa += 1;
                if (counterAa )
            }

        }


    }
}
