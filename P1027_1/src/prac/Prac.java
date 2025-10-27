/*
아래 3가지 조건을 만족하면 Yes, 아니라면 No 출력

하나의 문자열은 하나의 대문자 영어 알파벳을 포함한다.
하나의 문자열은 하나의 소문자 영어 알파벳을 포함한다.
하나의 문자열의 모든 문자는 두 번 이상 반복될 수 없다.

예를 들어, AtCoder와 Aa는 멋진 문자열이지만, atcoder와 Perfect는 그렇지 않다.

제약
1 ≤ ∣S∣ ≤ 100
문자열은 대문자와 소문자로 구성된 하나의 문자열이다.
*/
package prac;

import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\n문자열을 입력하세요. > ");
            String s1 = sc.nextLine().replaceAll("[\\d\\s]", "");

            if (s1.isEmpty()) {
                System.out.println("문자열은 공란일 수 없습니다.");
                continue;
            }

            String s1No = s1.replaceAll("[a-z]", "");
            if (s1No.isEmpty()) {
                System.out.println("대문자가 없습니다.");
                System.out.println("No");
                break;
            } 

            String s1No2 = s1.replaceAll("[A-Z]", "");
            if (s1No2.isEmpty()) {
                System.out.println("소문자가 없습니다.");
                System.out.println("No");
                break;
            }

            char[] arrS = s1.toCharArray();

            for (int i = 0 ; i < s1.length() ; i++) {
                for (int n = i + 1 ; n < s1.length() ; n ++) {
                    if (arrS[i] == arrS[n]) {
                        System.out.println("문자열이 중복됩니다");
                        System.out.println("No");
                        System.exit(0); 
                    }
                }
            }
            System.out.println("Yes");
            break;
        }
        sc.close();
    }
}