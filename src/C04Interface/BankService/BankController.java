// Controller로의 역할을 사용자와의 인터페이싱
package C04Interface.BankService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankController {
    public static void main(String[] args) {
        System.out.println("계좌번호를 입력하세요");
        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.nextLine();
        BankAccount bankAccount = new BankAccount(accountNumber);

        while (true) {
            System.out.println("서비스 번호를 입력하세요. 1.카드 2.카카오페이 ");
            int number = Integer.parseInt(sc.nextLine());
            System.out.println("입금하시려면 1번, 출금하시려면 2번");
            int number2 = Integer.parseInt(sc.nextLine());

            if (number == 1) {
                // 카드 선택 (BankCardService 객체 생성)
                // 인터페이스 bcs = new 구현체
                BankCardService bcs = new BankCardService();
                if (number2 == 1) {
                    // 카드 선택 -> 입금
                    System.out.println("얼마를 입금하시겠습니까?");
                    int deposit_amount = Integer.parseInt(sc.nextLine()); // 입금금액
                    bcs.deposit(deposit_amount, bankAccount);
                } else {
                    // 카드 선택 -> 출금
                    System.out.println("얼마를 출금하시겠습니까?");
                    int withdraw_amount = Integer.parseInt(sc.nextLine()); // 출금금액
                    bcs.withdraw(withdraw_amount, bankAccount);
                }
            } else if (number == 2) {
                // 카카오페이
                BankKaKaoService bks = new BankKaKaoService();
                if (number2 == 1) {
                    // 카카오페이 선택 -> 입금
                    System.out.println("얼마를 입금하시겠습니까?");
                    int deposit_amount = Integer.parseInt(sc.nextLine()); // 입금금액
                    bks.deposit(deposit_amount, bankAccount);
                } else {
                    // 카카오페이 선택 -> 출금
                    System.out.println("얼마를 출금하시겠습니까?");
                    int withdraw_amount = Integer.parseInt(sc.nextLine()); // 출금금액
                    bks.withdraw(withdraw_amount, bankAccount);
                }
            }
        }
    }
}