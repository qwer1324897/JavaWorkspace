package p3;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        
    // 학생관리프로그램
    System.out.println("반갑습니다.");
    
    while(true) {
        System.out.println("1. 학생 등록");
        }

        Service service = Serviceconatinor.getService(command);
        service.run();

    }

    class StudentAddService implements Service {
        public void run() {
            // 학생 출력 로직
        }
    }

    class StrudentRemoveService implements Service {
        public void run() {
            // 학생 출력 로직
        }
    }

    class Serviceconatinor {

        private Map<String, Service> map = new HashMap<>();

        public Serviceconatinor() {
            map.put("1", new StudentAddService());
            map.put("4", new StrudentRemoveService());
        }
        }



}
