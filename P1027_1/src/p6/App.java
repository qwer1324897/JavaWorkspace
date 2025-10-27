package p6;

public class App {
    public static void main(String[] args) {
        new Controller().controllerMethod();
    }
}

class Controller {
    public void controllerMethod() {
        new Service().serviceMethod();
    }
}

class Service {
    public void serviceMethod() {
        try {
        new Repository().repositoryMethod();
        } catch (Exception exception) {
            System.out.println("예외 처리...");
            return;
        } finally {
            /* 
             * 그 어떠한 경우에도 실행됨.
             * 사실상 자원 반납 용도로만 쓰인다.
             * scanner.close(); 같은.
             */
            System.out.println("finally 실행됨.");
        }
        System.out.println("End");
    }
}

class Repository {
    public void repositoryMethod() {
        int result = 10/0;
        System.out.println(result);
    }
}
