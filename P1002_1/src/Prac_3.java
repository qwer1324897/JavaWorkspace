import java.util.Scanner;

public class Prac_3 {
    public static void main(String[] args) {
        // 소수 판정법
        // 자연수 N이 소수인지 아닌지 판단하는 프로그램을 만들어보자


        System.out.println("\n\n\n\n--------- 소수 판독 프로그램---------\n\n\n\n");
        System.out.println("\n\n소수임을 판독할 자연수 N을 입력해 주세요\n\n");

        
        Scanner numN = new Scanner(System.in);
            
            while (true) {
                if (!numN.hasNextInt()) {
                    System.out.println("유효하지 않는 값 입니다.");
                }
            }

            for(int n = 1 ; n > 1 ; n++ ) {
            
                for (int i = 1 ; i > 1 ; i++) {

                    if (n % i == 0 || n == i) {
                    
                        if ( )
                        System.out.println("입력하신" + n + "은 소수 입니다");
                    }
                }
            }






    }
}
