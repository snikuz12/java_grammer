// 비즈니스 로직이 동작하는 Service 코드
package C04Interface.BankService;

public class BankCardService {
    public void deposit(int money, BankAccount bankAccount){
        int myMoney = bankAccount.getBalance();
        int total = myMoney + money;
        bankAccount.updateBalance(total);
        System.out.println( money+"원 카드로 입금되었습니다.");
        System.out.println("현재 잔액은 " + total);
    }

    public void withdraw(int money, BankAccount bankAccount){
        if(bankAccount.getBalance() < money){
            System.out.println("잔액 부족입니다.");
        }else {
            int total = bankAccount.getBalance() - money;
            bankAccount.updateBalance(total);
            System.out.println(money + "원 카드로 출금되었습니다.");
            System.out.println("현재 잔액은 " + total);
        }
    }
}