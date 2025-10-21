package Prac;

import java.util.Scanner;

/**
B - 슬라임

문제 설명
슬라임 A가 있다.
스누크가 소리칠 때마다, 슬라임은 K배로 증가한다.
B 또는 그 이상의 슬라임을 가지려면, 스누크가 최소한 몇 번을 소리쳐야 하는가?

제약
1 ≤ A ≤ B ≤ 10^9
2 ≤ K ≤ 10^9
모든 입력값은 정수이다.

입력
입력은 다음 형식의 표준입력으로 제공된다.
A B K

출력
답을 인쇄한다.
*/

public class Algorithm_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long K = scanner.nextLong();

        if (A == B) {
            System.out.println("0");
            return;
        }

        long sum = A*K;

        if (sum >= B) {
            System.out.println("1");
            return;
        }

        for (long i = 2 ; i < B ; i++) {
            
            sum = sum*K ;
    
            if (sum >= B) {
                System.out.println(i);
                break;
            }
        }
    }
}
