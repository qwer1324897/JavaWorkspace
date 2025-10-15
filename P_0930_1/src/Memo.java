import java.util.Scanner;

public class Memo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("랜덤 주사위 프로그램");
        System.out.print("1을 입력하고 엔터를 누르면 실행됩니다. \n >");  
        
        while (true) {       
      
        String inputValue = scanner.nextLine(); 

        if (inputValue.equals("1")) {

            int num = (int)(Math.random()*6) + 1 ; 
    
            if (num == 6) {
            System.out.println("\n주사위를 힘차게 굴려 6이 나왔습니다.\n \n1을 입력하면 한 번 더 실행됩니다. \n");
            } if (num == 5) {
            System.out.println("\n주사위를 세차게 굴려 5가 나왔습니다.\n \n1을 입력하면 한 번 더 실행됩니다. \n");
            } if (num == 4) {
            System.out.println("\n주사위를 힘껏 굴려 4가 나왔습니다.\n \n1을 입력하면 한 번 더 실행됩니다. \n");
            } if (num == 3) {
            System.out.println("\n주사위를 힘껏 굴려보았지만 3이 나왔습니다.\n1 \n을 입력하면 한 번 더 실행됩니다. \n");
            } if (num == 2) {
            System.out.println("\n주사위를 굴려 2가 나왔습니다.\n \n1을 입력하면 한 번 더 실행됩니다. \n");
            } if (num == 1) {
            System.out.println("\n주사위를 힘껏 굴려보았지만 1이 나왔습니다...\n \n1을 입력하면 한 번 더 실행됩니다. \n");
            }
        }
        else {
        System.out.println("\n숫자 1을 입력해야 실행됩니다. \n \n주사위 던지기를 종료합니다.");
        break; 
        }
    }

}
}

