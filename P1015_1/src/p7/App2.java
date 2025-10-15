package p7;

public class App2 {
    public static void main(String[] args) {
        Account a1 = new Account("David");

        a1.deposit(3000);
        a1.deposit(3000);
        a1.withdraw(100000);    


        System.out.println(a1.owner + "의 잔액: " + a1.balance);    // **1** private 때문에 여기서 owner랑 balance를 못 쓴다. 따라서,
        
        System.out.println(a1.getOwner() + "의 잔액: " + a1.getBalance());  // **3** 이렇게 쓸 수 있다.
    }
}

class Account {

    // 속성 - 정말 가장 중요!

    private String owner;
    private int balance;

    // 여기 필드에 있는 변수들을 퍼블릭으로 풀어버리면 클래스를 만드는 사람과 위에 App을 만드는 사람이 다를 경우(실무에선 빈번), 코드가 잘못될 수 있기 때문에
    // 반드시 private으로 설정해야 한다. 필드가 쉽게 남에 의해서 변경되어서는 안 된다.

    Account(String owner) {
        this.owner = owner;
    }

    // **2**

    public String getOwner() {
        return owner;
    }
    public int getBalance() {
        return balance;
    }

    // **2** 이렇게 겟으로 메서드를 지정해줘야

    public void deposit(int value) {
        balance += value;

    }

    public void withdraw(int value) {
        if(cannotWithdraw(value)) {
            System.out.println("출금 오류 : 잔액이 부족합니다.");
            return;
        }
        balance -= value;
    }

    private boolean cannotWithdraw(int value) {
        return balance < value;
    }

}






