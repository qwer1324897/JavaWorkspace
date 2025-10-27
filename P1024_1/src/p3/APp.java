package p3;

import java.util.Random;

public class APp {
    public static void main(String[] args) {
        Random random = new Random(1);

        int value = random.nextInt(100) + 1;
        System.out.println(value);

        value = random.nextInt(100) + 1;
        System.out.println(value);

        value = random.nextInt(100) + 1;
        System.out.println(value);

    }
}
