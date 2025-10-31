package p2;

public class App {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
    
        test1.setPriority(0);
        test1.start();

        Test2 test2 = new Test2();

        test2.setPriority(0);
        test2.start();
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