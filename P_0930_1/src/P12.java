
import java.util.Scanner;
public class P12 {
    public static void main(String[] args) {
        
        // API

        // 출력: 출력의 경우 System.out.plintln; 하면 줄바꿔서 출력, print면 가로로 이어서 출력


        // 입력

        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력하세요");
        System.out.print(" > ");
        String inputValue = scanner.nextLine();    // 문자를 반환하는 입력 API
        System.out.println("입력하신 값은[" + inputValue + "] 입니다.");

        // 중요한 API 문자 -> 숫자. 단, 변경 불가능한 문자일 경우 Exception
        int age = Integer.parseInt(inputValue); 
        
        if(age < 26) {
            System.out.println("젋으시군요!") ; 
        }
        if(age < 20) {
            System.out.println("성인이 아닙니다.");
        }              
        
        if(age > 40) {
            System.out.println("입력 대상에 해당하지 않습니다. \n프로그램을 종료합니다.");
            System.exit(age);
        }
        else {
            System.out.println("") ;

        }
                

        scanner.nextLine();
        System.out.println("프로그램 종료");


    }
}
