import java.util.Scanner;

public class Prac_4 {
    public static void main(String[] args) {
        
        Scanner scanNum = new Scanner(System.in);
        System.out.println("\n\n\n--------- 소수 판독 프로그램---------\n\n\n");
        System.out.print("\n\n소수임을 판독할 자연수 N을 입력해 주세요\n\n입력 > ");
            
        while (true) {

            if (!scanNum.hasNextInt()) {
                System.out.println("\n*** 유효하지 않은 값입니다. 다시 입력해 주세요. ***\n");
                scanNum.next();
                continue;
            }

            int n = scanNum.nextInt() ;

            
            // if (scanNum.equals)

            // for(int scanNum = 2 ; n > 1 ; n++ ) {
            
            //     for (int i = 1 ; i > 1 ; i++) {

            //         if (n % i == 0 || n == i) {
                    
            //             if ( )
            //             System.out.println("입력하신" + n + "은 소수 입니다");
            //         }
            //     }
            }
        }




    }

