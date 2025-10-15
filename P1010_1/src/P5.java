import java.util.*;
public class P5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x >= y) {
            System.out.println(0);
        }
        
       
        
        for (int i = 1 ; x<1000 ; i++) {
            
            x += 10;

            if (x >= y) {
                System.out.println(i);
                break;
            }

        }
        if(x>=1000){
            System.out.println(0);
        }

        scanner.close();
        
    }
}
