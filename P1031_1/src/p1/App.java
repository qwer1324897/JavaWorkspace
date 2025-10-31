package p1;

public class App {
    public static void main(String[] args) {
        new Test1().start();
        new Test2().start();
        new Thread(() -> {
            for (int i = 0 ; i < 100 ; i++) {
                System.out.println("test3" + i);
            }            
        }).start();

        System.out.println("program exit");
    }
}

class Test1 extends Thread {
    @Override
    public void run() {
        for (int i = 0 ; i < 100 ; i++) {
            System.out.println("hi" + i);
        }
    }
}

class Test2 extends Thread {
    @Override
    public void run() {
        for (int i = 0 ; i < 100 ; i++) {
            System.out.println("there" + i);
        }        
    }
}

