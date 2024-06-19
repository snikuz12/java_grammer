package C07ExceptionFileParsing.AuthorException;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class AuthorController {
    public static void main(String[] args) {
        // AuthorService 객체 생성
        AuthorService authorService = new AuthorService();

        while (true){
            // 입력
            // 1. 회원가입 2. 로그인
            System.out.println("이용하실 서비스를 선택해주세요 \n 1. 회원가입 \n 2. 로그인");
            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine()); // 서비스 유형 선택

            if(choice == 1){
                // 회원가입
                    System.out.println("Author 회원가입");
                    System.out.println("이름을 입력해주세요");
                    String name = sc.nextLine();
                    System.out.println("이메일을 입력해주세요 (중복이메일 불가)");
                    String email = sc.nextLine();
                    System.out.println("비밀번호를 입력해주세요 (6자리 이상)");
                    String password = sc.nextLine();

                try{
                    //AuthorService 객체생성 후 register 메소드에서 회원가입
                    // 회원가입 검증은 AuthorService의 register에서 검증
                    authorService.register(name, email, password);
                }catch(IllegalArgumentException e){
                    // register에서 IllegalArgument 예외 발생시 메시지 출력
                    System.out.println(e.getMessage());
                }catch (Exception e){
                    System.out.println("예외가 발생했습니다.");
                }

            } else if (choice == 2) {
                // 로그인
                System.out.println("Author 로그인");
                System.out.println("이메일을 입력해주세요");
                String email = sc.nextLine();
                System.out.println("비밀번호를 입력해주세요");
                String password = sc.nextLine();

                try{
                    //AuthorService 객체 생성 후 login 메서드 호출
                    authorService.login(email, password);

                }catch(IllegalArgumentException e){
                    // Service에서 예외가 발생하면 Controller로 전달해서 예외전가
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            }

        }
    }
}
