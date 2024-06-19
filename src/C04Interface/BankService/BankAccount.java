// 작업의 대상이 되는 객체 즉, Entity
package C04Interface.BankService;

public class BankAccount{
    static long static_id =0L;
    private long id;
    private String accountNumber;
    private int balance;
    BankAccount(String accountNumber){
        static_id +=1 ;
        id = static_id;
        this.accountNumber = accountNumber;
    }
    public void updateBalance(int newBalance){
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }

    public Long getId() {
        return id;
    }

    public void transfer(int money, BankAccount yourAccount) {
    }
}