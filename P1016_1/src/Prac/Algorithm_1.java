package Prac;
import java.util.*;
// A - 켜고 끄고

// 문제 설명
// 다카하시는 매일 S시(24시간제)에 자신의 방의 불을 켜고, 매일 T시에 불을 끈다.
// 불이 켜져 있는 동안 날짜가 변경될 수 있다.

// X시 30분에 불이 켜져 있는지 구하라.

// 제약
// 0≤S,T,X≤23
// S≠T
// 모든 입력값은 정수이다.

// 입력
// 입력은 다음 형식의 표준입력으로 제공된다.

// S T X

// 출력
// X시 30분에 불이 켜져 있으면 Yes를 인쇄하고, 그렇지 않으면 No를 인쇄한다

public class Algorithm_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int T = scanner.nextInt();
        int X = scanner.nextInt();

        if (S > T) {
            if (X >= S || X < T) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } 

        if (T > S) {
            if (X >= S && X < T) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
