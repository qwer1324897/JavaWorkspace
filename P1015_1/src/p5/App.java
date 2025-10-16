package p5;
import java.util.Scanner;

class BankAccount {     // 계좌 정보와 입,출금 로직 클래스

    private String owner;   // 접근제한자로 계좌명 변수 설정
    private int balance;    // 접근제한자로 잔액 변수 설정

    public BankAccount(String owner, int startBalance) {    // 생성자, 초기값 설정.
        this.owner = owner;
        this.balance = startBalance;
    }

    public void deposit(int money) { // 입금 메서드
        if (money <= 0) {
            System.out.println("입금 금액은 0 이하일 수 없습니다.");
            return;
        }
        this.balance += money;
        System.out.println("\n" + money + "원이 입금되었습니다. 현재 잔액: " + this.balance + "원");
    }
    public void withdrawal(int money) {   // 출금 메서드
        if (money <= 0) {
            System.out.println("출금 금액은 0 이하일 수 없습니다.");
            return;
        }
        if (this.balance < money) {
            System.out.println(" *잔액이 부족합니다.* \n출금에 실패하였습니다. 현재 잔액: " + this.balance + "원");
        } else {
            this.balance -= money;
            System.out.println("\n" + money + "원이 출금되었습니다. 현재 잔액: " + this.balance + "원");
        }
    }
    public void printAccount() {    // 계좌 이름, 잔액 확인 메서드
        System.out.println("========== 계좌 정보 ==========");
        System.out.println("계좌주: " + this.owner + "  잔액: " + this.balance + "원");
    }
    public int getBalance() {   // 잔액 반환 메서드. 잔액은 접근제한자로서, 이 메서드를 통해야만 접근 가능.
        return this.balance;
    }

}

class ScannerHandler {     // 스캐너로 값들을 입력받는 클래스

    private Scanner scanner;    // 입력받을 scanner 필드. 

    public ScannerHandler() {     // 생성자. 입력받은 scanner값 초기화.
        this.scanner = new Scanner(System.in);
    }

    public String getStringInput(String text) {   // 계좌명 입력받는 메서드  !! 이거 여기서 text가 무슨역할인지 정확히 이해. !!
        
        while(true) {
            System.out.print(text);
            String scannerOwnerName = scanner.nextLine();

            if (scannerOwnerName == null || scannerOwnerName.isEmpty()) {
                System.out.println("\n*계좌명은 비워둘 수 없습니다.*\n");
                continue; 
            }
            return scannerOwnerName;
        }
    }

    public int getIntInput(String text) {   // 정수 입력받는 메서드  !! 마찬가지. 이 text가 무슨 의미인지 이해하고 넘어갈 것. !!
        while(true) {
            System.out.print(text);

            if (scanner.hasNextInt()) {
                int rightInt = scanner.nextInt();
                scanner.nextLine();
                return rightInt;
            } else {
                System.out.println("\n*유효한 숫자를 입력하세요.*\n");
                scanner.nextLine(); // 이 부분 이해가 안 된다. 엔터를 버려야 한다? 원래 이런거 없이도 잘 됐는데. 이 부분 빼놓고 실행시켜보자. 안 되려나?
            }
        }
    }

    public void close() {   // 스캐너 닫는 메서드
        scanner.close();
    }
}

class MenuHandler {     // 초기화면(메인메뉴) 무한루프 클래스(사실상 인터페이스)

    private BankAccount account;    
    private ScannerHandler input;     // 클래스를 타입으로 지정해서, 잡다하게 중복사용하지 않고 간편하게 사용.(솔직히 완벽히 이해되진 않음)

    public MenuHandler(BankAccount account, ScannerHandler input) {
        this.account = account;
        this.input = input; 
    }   // 계좌와 입력 핸들러를 받고 초기화.

    public void runMenu() {     // 처음 초기화면으로 쓰일 무한루프 메서드
        while (true) {
            System.out.println("\n====== Bank Menu ======\n");
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 잔액 확인");
            System.out.println("0. 종료");
            System.out.println("\n========================\n");

            int choice = input.getIntInput("원하는 메뉴의 번호를 입력하세요: ");
            // 이 부분에서 전율이 돋았다. 위의 text가 도저히 이해가 안 갔는데, 이 줄과 이 다음줄에서 완벽하고 아름답게 연결된다. 이게 클래스구나.

            if (choice == 1) {
                System.out.println("\n===== 입금을 진행합니다. =====\n");
                int moneyToDeposit = input.getIntInput("입금할 금액을 입력하세요: ");   // ScannerHandler로 숫자 입력받기
                account.deposit(moneyToDeposit);    // BankAccount에 전달하여 입금 실행

            } else if (choice == 2) {
                // 출금 처리
                System.out.println("--- 출금을 진행합니다 ---");
                int moneyToWithdraw = input.getIntInput("출금할 금액을 입력하세요: ");   // ScannerHandler로 숫자 입력받기
                account.withdrawal(moneyToWithdraw);    // BankAccount에 전달하여 출금 실행

            } else if (choice == 3) {
                // 잔액 확인
                account.printAccount();

            } else if (choice == 0) {
                // 종료
                System.out.println("프로그램을 종료합니다.");
                break; 
                
            } else {
                System.out.println("잘못된 메뉴 번호입니다. 다시 입력해주세요.");
            }
        }
    }
}

    // main에서는 맨 처음 객체 생성하고, 호출로 실행만 함.(main 최소화 > 가독성 극대화)

public class App {
    public static void main(String[] args) {   
        
        // 1. 입력을 담당할 객체 먼저 생성
        ScannerHandler scannerHandler = new ScannerHandler();

        // 2. 계좌 개설을 위한 초기 정보 입력받기
        System.out.println("\n===== 신규 계좌를 개설합니다 =====\n\n");
        String ownerName = scannerHandler.getStringInput("사용자 성함을 입력해주세요: ");
        int startBalance = scannerHandler.getIntInput("초기 입금액을 입력해주세요: ");

        // 3. 입력받은 정보로 계좌 객체 생성
        BankAccount myAccount = new BankAccount(ownerName, startBalance);
        
        // 4. 메뉴를 돌려줄 객체에 계좌와 스캐너 핸들러를 전달하며 생성
        MenuHandler menuHandler = new MenuHandler(myAccount, scannerHandler);

        // 5. 메뉴 실행
        menuHandler.runMenu();

        // 6. 프로그램이 모두 끝나면 스캐너 닫기 (자원 누수 방지)
        scannerHandler.close();
    }
}
