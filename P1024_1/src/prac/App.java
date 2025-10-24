
// https://atcoder.jp/contests/abc221/tasks/abc221_b  문제풀이

package prac;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("문자열 A를 입력해 주세요. (숫자 입력 시, 자동으로 제거됩니다.) \n> ");
            String A = sc.nextLine().toLowerCase().replaceAll("[\\d\\s]+", "");
            if (A.isEmpty()) {
                System.out.println("\n\n** 입력값은 공란일 수 없습니다 **");
                continue;
            }
            System.out.print("문자열 B를 입력해 주세요. (숫자 입력 시, 자동으로 제거됩니다.) \n> ");
            String B = sc.nextLine().toLowerCase().replaceAll("[\\d\\s]+", "");
            if (B.isEmpty()) {
                System.out.println("\n\n** 입력값은 공란일 수 없습니다 **");
                continue;
            }
            if (!(A.length()==B.length())) {
                System.out.println("\n** A와 B의 문자열 길이는 같아야 합니다 **\n");
                System.out.println("enter를 눌러 다시 진행 합니다.");
                sc.nextLine();
                continue;
            }
            
            String[] arrA = new String[A.length()];
            String[] arrB = new String[A.length()];
            
            System.out.println("\n\n입력하신 문자열은 다음과 같습니다.\n");
            System.out.println("A: " + A + " B: " + B);
            System.out.println("\n계속 진행하시려면 enter를 눌러주세요.");
            sc.nextLine();

            if (A.equals(B)) {
                System.out.println("Yes");
                break;
            }
            for (int i = 0 ; i < A.length() ; i++) {
                arrA[i] = A.substring(i, i+1);
                arrB[i] = B.substring(i, i+1);
            }
            for (int i = 0 ; i < A.length() -1 ; i++) {
                String[] arrAcopy = arrA.clone();
                String temp = arrAcopy[i];
                String temp2 = arrAcopy[i+1];
                arrAcopy[i] = temp2;
                arrAcopy[i+1] = temp;

                if (Arrays.equals(arrAcopy, arrB)) {
                    System.out.println("Yes");
                    System.exit(0);
                }
            }
            System.out.println("No");
            break;
        }
    }
}
