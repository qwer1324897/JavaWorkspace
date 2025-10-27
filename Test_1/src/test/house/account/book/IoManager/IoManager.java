package test.house.account.book.IoManager;

import java.util.Scanner;

public class IoManager {

    private IoManager() {}

    private static Scanner sc = new Scanner(System.in);
    
    public static void print(String text) {    // 출력만을 담당하는 메서드. Sysout 대체.
        System.out.println(text);
    }

    public static String printAndInputString(String text) {    // 문자열 입력 메서드.
        System.out.print(text);
        String valueString = sc.nextLine();
        if (valueString.trim().isEmpty()) {    // 유효성 검사.
            System.out.print("\n이 입력란은 공란일 수 없습니다. 다시 입력해 주세요.\n > ");
            valueString = sc.nextLine();
        }
        return valueString.trim();
    }

    public static Integer printAndInputInteger(String text) {    // 정수 입력 메서드.
        System.out.print(text);
        while (!sc.hasNextInt()) {    // 유효성 검사.
            System.out.print("\n유효하지 않은 값입니다. 다시 입력해주세요.\n > ");
            sc.nextLine(); 
        }
        Integer valueInteger = sc.nextInt();
        sc.nextLine();
        return valueInteger;
    }

    public static void pause() {  
    System.out.print("\nenter 키를 눌러 계속 진행합니다.");
    sc.nextLine();
    }

}
