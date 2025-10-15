import java.util.*;
public class P6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double s = Double.parseDouble(scanner.nextLine());
        double t = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());

        double switchOn = s;
        double switchOff = t;
        double currentTime = x + 0.5 ;

        if (switchOn <= currentTime && currentTime <= switchOff) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        scanner.close();

    }
}
