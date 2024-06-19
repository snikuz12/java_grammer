package C07ExceptionFileParsing;

import java.sql.SQLException;
import java.util.Scanner;

public class C0701Exception {
    public static void main(String[] args) {
        System.out.println("나눗셈 프로그램입니다.");
        Scanner sc = new Scanner(System.in);

        // 예외가 발생할 것으로 예상되는 코드에 try로 감싸고
        // 예외가 발생했을 때 대응하는 코드를 catch에 작성한다.
        // 예외는 catch 구문 순차적으로 검사함.
        try {
            System.out.println("분자입력");
            int head = Integer.parseInt(sc.nextLine());
            System.out.println("분모입력");
            int tail = Integer.parseInt(sc.nextLine());
            int result = head / tail;
            System.out.println("나눈 결과값은" + (head/tail));
        }catch(ArithmeticException e){ // 예외 타입, 변수
            // 산술적 예외
            // 예외가 발생된 내역을 로그를 남기기 위함
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("0으로 나누시면 안됩니다.");
        }catch(NumberFormatException e){
            // 문자열을 숫자로 변환하려고 할 때 해당 문자열이 유효한 숫자 형식이 아닐 경우 발생
            System.out.println("숫자에 맞는 값을 입력헤주세요");
            e.printStackTrace();
        }catch (Exception e) {
            // Exception : 모든 예외의 조상클래스
            // 모든 예외를 다 잡으므로 상단에 위치하면 부적절하다. (나머지 catch구문에서 에러가 잡히지 않음)
            System.out.println("예외가 발생했습니다.");
            e.printStackTrace();
        } finally {
            System.out.println("무조건 실행되는 구문입니다.");
        }
        // try catch구문을 작성하면 오류가 발생해도 강제로 종료되지 않는다.
        System.out.println("감사합니다.");

        // throws : 예외처리 위임을 명시
        login("1234");
        try{
            login2("1234");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
//        login2("1234");

    }
    // unchecked 예외에서는 thows 키워드가 예외사항을 명시하는 용도로만 사용된다.
    static void login(String password) throws IllegalArgumentException, RuntimeException{
        if(password.length() < 10){
//            throw new : 예외를 강제로 발생
//            예외는 기본적으로 메서드를 호출한 쪽에 전파
//            unchecked 예외는 예외처리가 강제되지 않음.
//            unchecked : 예상하기 어려운 예외
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        }
        if(password.contains("*")){
            throw new RuntimeException("예외발생"); // IllegalArgumentException이 포함됨
        }
    }

    static void login2 (String password) throws SQLException{
//        // 방법1 : 직접 예외처리
//        try{
//            if(password.length() < 10){
//                throw new SQLException("DB조회 상황에서 예외가 발생했습니다.");
//            }
//        }catch(SQLException e){
//            // 발생한 문제를 catch해서 들어옴
//            // new SQLException("DB조회 상황에서 예외가 발생했습니다.");이게 들어옴
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }

//        방법2. 메서드를 호출한 쪽에 위임 : throws
        if(password.length() < 10){
            throw new SQLException("DB조회 상황에서 예외가 발생했습니다.");
        }
    }
}
