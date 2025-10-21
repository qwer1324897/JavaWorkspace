package p5;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        new Controller().run();
    }
}

class Controller {
    private ServiceContainer serviceContainer = new ServiceContainer();

    public void run() {
        System.out.println("하루 일과를 시작합니다.");
        for(Service service : serviceContainer.getServiceList()) {
            service.process();
        }
    }
}

interface Service {
    public void process();
}

class WakeUpService implements Service {
    public void process() {
        System.out.println("일어납니다.");
    }
}

class EatService implements Service {
    public void process() {
        System.out.println("밥 먹습니다.");
    }
}

class StudyService implements Service {
    public void process() {
        System.out.println("공부합니다.");
    }
}

class ServiceContainer {
    private List<Service> list = new ArrayList<>();

    public ServiceContainer () {
        list.add(new WakeUpService());
        list.add(new EatService());
        list.add(new StudyService());
    }
    public List<Service> getServiceList() {
        return list;
    }
}