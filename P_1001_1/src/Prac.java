import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("점수를 입력하세요 (0~100)\n>");
        
        while(true) {
        

        if (!scanner.hasNextInt()) {
            System.out.println("유효하지 않은 값입니다. 다시 입력해주세요.1");
            scanner.next();
            continue;
        }

        int score = scanner.nextInt();

        if (score <= 100 && score >= 0) {

            if (score >= 90 && score <= 100) {
            System.out.println("A 학점 입니다.");
            break;
            } if (80 <= score && score < 90) {
            System.out.println("B 학점 입니다.");
            break;
            } if (score >= 70 && score <80) {
            System.out.println("C 학점 입니다.");
            break;
            } if (score >= 60 && score <70) {
            System.out.println("D 학점 입니다.");
            break;
            } if (score < 60 && score >= 0) {
            System.out.println("F 학점 입니다. 재수강 하세요.");
            break;
            }
        }    
        else {
            System.out.println("유효하지 않은 값입니다. 입력해주세요.2");
        }
}
}
}



