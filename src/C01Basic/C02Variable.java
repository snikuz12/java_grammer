package C01Basic;

import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {
        // 정수 : byte(1바이트), int(4바이트), long(8바이트)
//        byte a = 127;
//        byte b = -128;
//        // 오버플로우 또는 언더플로우 발생
//        a++;
//        b--;
//        System.out.println(a);
//        System.out.println(b);

        //int int_a = 10;
        // long 명시적으로 L을 붙여 long 타입임을 명시
       // long long_a = 20L;
//
        // 실수 : float, double(기본)
//        float f1 = 1.123F; // F 안붙이면 컴파일 에러 발생
//        double d1 = 1.123; // double 은 D 생략 가능

        // 부동소수점 오차 테스트
        //double d2 = 0.1;
//        System.out.println(d2);

//        double total = 0.1;
//        for(int i=0; i<1000; i++){
//            total += 0.1 * 10;
//        }
//        // System.out.println(total/10);
//        // 소수점 오차의 대안으로 Bigdecimal 클래스 사용
//        double d1 = 1.03;
//        double d2 = 0.42;
//        System.out.println(d1-d2);
        //Bigdecimal의 원리 : 저장할때 문자열로 저장해서,
        // 연산할때 정수로 변환,최종결과는 실수로 반환
//        BigDecimal b1 = new BigDecimal("1.03");
//        BigDecimal b2 = new BigDecimal("0.42");
//        double result = b1.subtract(b2).doubleValue();
//        System.out.println(result);
//
//        // 문자형 : char
//        char m1 = '가';
//        System.out.println(m1);
//
//        // boolean : true 또는 false
//        boolean bool1 = true;
//        boolean bool2 = false;
//
//        Scnner sc = new Scanner(System.in);
//        int input1 = sc.nextInt();
//        boolean bool3 = input1 > 0;
//        // if 조건절 안에 boolean 타입 값이 들어옴에 유의
//        if(input1 > 0){
//            System.out.println("입력하신 값이 0보다 큽니다.");
//        }
//
//        // 타입변환
//        // 코딩으로 굳이 표현안해도 알아서 변환 -> 묵시적 타입변환
//        char ch1 = 'a';
//        int ch1_num = ch1;
//        System.out.println(ch1_num);
//
//        // 알파벳 비교를 위한 묵시적 타입변환 발생
//        System.out.println('a' > 'b');
//
//        // int -> double 형변환 : 문제없음 (묵시적 형변환)
//        int i1 = 10;
//        double d1 = i1;
//        System.out.println(d1);
//
        // double -> int 묵시적 형변환은 불가능
        // 명시적 형변환은 가능
//        double d2 = 10.5;
//        int i2 = (int)d2;
//        System.out.println(i2);

        // 코딩으로 명확히 표현해야 변환 -> 명시적 타입변환
//        System.out.println((int)'b');
//
//        // 형변환 관련 나눗셈 문제
//        int a = 1;
//        int b = 4;
//        int c = 1/4;
//        double d = 1/4;
//        // int/int 이므로 결과값을 int로 판단하여 소수점 절사
//        // 두 값중에 한 값만이라도 double로 명시적 형변환 시켜주면 결과값 double
//        System.out.println(c);
//        System.out.println(d);

        // 변수와 상수
        // 상수는 초기화 이후에 값이 재할당되는 것이 불가능
        // 상수는 final 키워드를 통해 표현
        // 값의 항상성을 유지가능(값이 변하는 것 방지)
        // 일반적으로 상수값은 대문자로 표기
        final int AGES = 20;
        //a2 = 30; //에러 : 재할당을 막음

    }
}
