package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankService {
    public static void main(String[] args) {
        List<BankAccount> bankAccounts = new ArrayList<>();

        while (true) {
            System.out.println("어떤 서비스를 이용하시겠습니까? 번호를 입력해주세요");
            System.out.println("1. 계좌개설   2. 입금   3. 출금   4. 계좌송금");
            Scanner sc = new Scanner(System.in);
            int number = Integer.parseInt(sc.nextLine());
            if(number == 1){
                System.out.println("계좌번호를 입력하세요");
                String accountNumber = sc.nextLine();
                BankAccount bankAccount = new BankAccount(accountNumber);
                bankAccounts.add(bankAccount);
                System.out.println(BankAccount.static_id); // 현재 id가 몇개까지 만들어졌는지?

            } else if (number == 2) {
                System.out.println("계좌조회 서비스");
                String accountNumber = sc.nextLine();
                for(int i = 0; i < bankAccounts.size(); i++){
                    if(bankAccounts.get(i).getAccountNumber().equals(accountNumber)){
                        System.out.println(bankAccounts.get(i).getBalance());
                        System.out.println(bankAccounts.get(i).getId());
                    }
                }


//                System.out.println("계좌번호를 입력하세요");
//                String accountNumber = sc.nextLine();
//
//                System.out.println("얼마 입금하시겠습니까?");
//                int money = Integer.parseInt(sc.nextLine());
//
//                for(int i = 0; i<bankAccounts.size(); i++){
//                    if(bankAccounts.get(i).getAccountNumber().equals(accountNumber)){
//                        bankAccounts.get(i).deposit(money);
//                    }
//                }

            } else if (number == 3) {
                System.out.println("본인 계좌번호를 입력해주세요");
                String myNumber = sc.nextLine();
                System.out.println("상대방 계좌번호를 입력하세요");
                String yourNumber = sc.nextLine();

                System.out.println("얼마 출금하시겠습니까?");
                int money = Integer.parseInt(sc.nextLine());

                BankAccount myAccount = null;
                BankAccount yourAccount = null;

                for(int i = 0; i<bankAccounts.size(); i++){
                    if(bankAccounts.get(i).getAccountNumber().equals(myNumber)){
                        myAccount  = bankAccounts.get(i);
                    }
                    if(bankAccounts.get(i).getAccountNumber().equals(myNumber)){
                        yourAccount = bankAccounts.get(i);
                    }
                }
                myAccount.transfer(money, yourAccount);
            }
        }

//    1. BankService라는 클래스를 생성
//    => main메서드에서 BankAccount 객체 생성 후 입금 출금 등 테스트
//        BankAccount b1 = new BankAccount("1234");
//        b1.deposit(100000); //100000원 입금되었습니다.
//        b1.withdraw(50000); //50000원 출금되었습니다.
//        b1.withdraw(200000); //잔액이 부족합니다.

//        BankAccount b2 = new BankAccount("4321");
//        b2.withdraw(50000);
//        b2.withdraw(200000);
        // b2.transfer(5000, b1의 메모리주소);
//        b2.transfer(5000, b1); // 매개변수로 b1의 메모리주소 넘겨줌
//        System.out.println(b2.getBalance()); // 0
//        System.out.println(b1.getBalance()); // 50000


    }
}
//2. BankAccount라는 클래스를 생성
//- accountNumber(계좌번호), balance(잔액) 변수 2가지만 갖고있음
class BankAccount{
    static Long static_id = 0L; // banckaccount가 들어갈때마다 autoincrement 되야함
    // 객체변수가 아니라 모두가 공유하는 변수가 됨.
    // 객체변수는 int의 0으로 초기화됨. static변수 0으로 초기화
    private  Long id; //
    private  String accountNumber; // 계좌번호
    private int balance; // 잔액

    BankAccount(String accountNumber){
        static_id += 1;
        id = static_id;
        this.accountNumber = accountNumber; // account number 초기화
    }

    //- 생성자 1개 : accountNumber를 초기화
    //- getter가 모든 변수에 맞게 존재
    //- deposit(예금하기) : balance(잔액) 증가시키는 메서드
    //=> "~원 입금되었습니다."
    public void deposit (int deposit_money){
        this.balance += deposit_money; // 예금시키기 (잔액증가)
        System.out.println(deposit_money + "원 입금되었습니다.");
        System.out.println("현재 잔액은 " + this.balance + " 입니다.");
    }

    //- withdraw(출금,이체) : balance(잔액) 감소시키는 메서드
    //=> 가지고 있는 돈보다 잔액이 부족하면 "잔액이 부족합니다"
    //        => 충분하면 "~원 출금되었습니다."
    public void withdraw (int withdraw_money){
        if(this.balance >= withdraw_money){
            this.balance -= withdraw_money;// 출금
            System.out.println(withdraw_money+"원 출금되었습니다.");
            System.out.println("현재 잔액은 " + this.balance + " 입니다.");
        }else{
            System.out.println("잔액이 부족합니다.");
            System.out.println("현재 잔액은 " + this.balance + " 입니다.");
        }
    }

    public void transfer(int transfer_money, BankAccount transferTo){
        if(this.balance >= transfer_money){
            this.balance -= transfer_money; // 잔액 - 송금금액
            transferTo.deposit(transfer_money);
            System.out.println(transfer_money+"원 이체되었습니다.");
            System.out.println("현재 잔액은 " + this.balance + " 입니다.");

        }else{
            System.out.println("잔액이 부족합니다.");
            System.out.println("현재 잔액은 " + this.balance + " 입니다.");
        }
    }

    public Long getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    BankAccount(String accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    BankAccount(){
        //
    }

}





