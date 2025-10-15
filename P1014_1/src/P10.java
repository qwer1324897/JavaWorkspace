public class P10 {
    public static void main(String[] args) {
        Bmi p1 = new Bmi("승민");
        Bmi p2 = new Bmi("동훈");
        Bmi p3 = new Bmi("태호");

        p1.calculate(170.0, 73.0);
        p2.calculate(169.0, 55.0);
        p3.calculate(176.0, 65.0);

        p1.prdoubleBmi();
        p2.prdoubleBmi();
        p3.prdoubleBmi();
    
    }
}


class Bmi {

    String name;
    double height;
    double weight;
    double bmi;

    Bmi(String name) {
        this.name = name;
    }

    void calculate(double height, double weight) {
        this.height = height;
        this.weight = weight;
        this.bmi = weight/((height/100)*(height/100)) ;      
    }

    void prdoubleBmi() {
        System.out.println(this.name + "의 bmi는 " + this.bmi + " 입니다.");
    }
}