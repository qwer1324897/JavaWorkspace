package com.joongang.stm.util;

import java.util.Scanner;

/* static 쓰려고 만든 예시 클래스. 실제로는 중요하지 않다 */

public class IoManager {

    private static Scanner scanner = new Scanner(System.in);    // static 이기때문에 처음부터 생성되고 계속 존재한다. 

    private IoManager() {}  // 아래거 쓸때 전부다 static이라서  Iomanager s1 = new Iomanger(); 이런식으로 클래스 생성하고 쓰지 않아도 된다.
    // 그래서 혹시몰라 생성해서 꼬이는걸 방지하기 위해 private 으로 이 클래스 자체를 막아버림. 이렇게 해도 아래에 있는 메서드는 어차피 static이라 쓰는데 지장 없음.

    public static String stringInput(String text){
        System.out.print(text);
        return scanner.nextLine(); 
    }
    
    public static int integerInput(String text) {
        System.out.print(text);
        while (!scanner.hasNextInt()) {
            System.out.print("\n유효하지 않은 값입니다.\n다시 입력해주세요. > ");
            scanner.nextLine();
        }
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void pause() {
        System.out.println("enter를 눌러 계속 진행합니다.");
        scanner.nextLine();
    }   // 이게 은행 프로그램에서 원하던 기능. 한 번 끝났을때 바로 메인메뉴 나오는게 아니라 enter로 한 번 쉬어가게 하는 기능.
}
