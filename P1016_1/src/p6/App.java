package p6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int x = scanner.nextInt();

        Runner takahashi = new Runner(b,a,c);
        Runner aoki = new Runner(e, d, f);

    }
}

class Stadium {

}

class Runner {
    private final int speed;
    private final int walkTime;
    private final int restTIme;
    public Runner(int speed, int walkTime, int restTIme) {
        this.speed = speed;
        this.walkTime = walkTime;
        this.restTIme = restTIme;
    }
}
