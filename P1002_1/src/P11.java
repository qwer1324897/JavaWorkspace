import java.util.Scanner;
public class P11 {
    public static void main(String[] args) {
        
        // 소수 판별 문제
        // 2~100 사이의 소수를 출력하세요
        // for문으로 하고

        // 에라토스테네스 체 로도 한 번 해보자


        for(int primeNum = 2 ; primeNum < 100 ; primeNum ++ ) {
            
            boolean primeNumIs = true;

            for (int i = 2 ; i < primeNum ; i ++) {
               
                if (primeNum % i == 0) {
                    primeNumIs = false;
                    break;
                }
            } 

            if (primeNumIs) {
                System.out.println(primeNum);
            }   
        }


        // 에라토스테네스 체?




        // 소수 판정법
        // 자연수 N이 소수인지 아닌지 판단하는 프로그램을 만들어보자

        {

            
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
}
