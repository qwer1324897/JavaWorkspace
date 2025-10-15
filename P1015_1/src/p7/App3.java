package p7;
import java.util.Scanner;
// 은행 계좌 이름, 입금, 출금, 잔액 관리 시스템
// 클래스 사용해서 최대한 분리

public class App3 {
    public static void main(String[] args) {
        
    }
}


class BankAccount {   // Deposit 입금 Withdrawal 출금 balance 잔액
    private String owner;
    private int deposit;
    private int Withdrawal;
    private int balance;

    public BankAccount() {
    }

    public String setOwner(String owner) {
        return owner;
    }

    public int getDeposit() {
        return deposit;
    }

    public int getWithdrawal() {
        return Withdrawal;
    }
    
    public int balance() {
        return balance;
    }
}

class ScannerBankinginfo {
    public Scanner scanner = new Scanner(System.in);
    
    public String setOwner(String owner) {
        String setOwner = scanner.nextLine();
        return owner;
    }

}

