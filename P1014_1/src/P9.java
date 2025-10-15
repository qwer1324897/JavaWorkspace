public class P9 {
    public static void main(String[] args) {
        Gear keyboard = new Gear();

        keyboard.setTitle("키보드");
        keyboard.setPrice(35000);
        keyboard.gearStore("직구");
        keyboard.printGear();

        Gear mouse = new Gear();

        mouse.setTitle("마우스");
        mouse.setPrice(36000);
        mouse.gearStore("직구");
        mouse.printGear();
    }
}

class Gear {

    // 필드
    String gearName;
    String gearStore;
    int gearPrice;

    // 생성자
    Gear() {
    }

    // 메서드
    void setTitle(String gearName) {
        this.gearName = gearName;
    }
    void gearStore(String gearStore) {
        this.gearStore = gearStore;
    }
    void setPrice(int gearPrice) {
        this.gearPrice = gearPrice;
    }
    void printGear() {
        System.out.println(gearName + "의 가격은 " + gearPrice + " 원이고, 구매처는 " + gearStore + "입니다.");
    }
}