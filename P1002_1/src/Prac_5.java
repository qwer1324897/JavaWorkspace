import java.util.Scanner;

public class Prac_5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("점수를 입력하세요 (0~100)\n>");
        
        while(true) {

        if (!scanner.hasNextInt()) {
            System.out.println("유효하지 않은 값입니다. 다시 입력해주세요.");
            scanner.next();
            continue;
        }

    }
}
}
