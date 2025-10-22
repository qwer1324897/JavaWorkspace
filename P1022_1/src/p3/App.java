package p3;

public class App {
    public static void main(String[] args) {
        QQQ qqq1 = a -> Math.sqrt(a);   // 근데 이것도 줄일 수 있다.
        QQQ qqq2 = Math::sqrt;  // 이렇게.

        double result = qqq1.calculate(10);
    }
}

interface QQQ {
    public double calculate(int a);
}

