package C01Basic;

import java.util.Scanner;

public class C01InputOutput {
    public static void main(String[] args) {
        // 출력 : System.out(콘솔)
//
//        int a = 20;
//        // println: 출력 후 줄바꿈
//        // print : 출력 (줄바꿈 없이)
//
//        System.out.print(a);
//        String b = "Hello World";
//        System.out.println(b);
//
//        // 문자열과 숫자를 합하면 문자가 된다.
//        System.out.println(a+b);
//        // 숫자 + 숫자
//        System.out.println(20 + 1);

        // 입력 : System.in(키보드 입력) + Scnner(입력을 위한 클래스)
        Scanner myScanner = new Scanner(System.in);

//        System.out.println("아무 문자열을 입력해주세요");
//        // nextLine은 입력 받은 데이터를 한 줄 읽어서, String 리턴
//        String inputs = myScanner.nextLine();
//        System.out.println(inputs);

//        System.out.println("더하기할 두 숫자를 입력해주세요");
//        int a1 = myScanner.nextInt();
//        int a2 = myScanner.nextInt();
//        System.out.println("두 수를 더한 값은 "+(a1+a2)+" 입니다.");

//        System.out.println("실수를 입력해주세요");
//        double input_double = myScanner.nextDouble();
//        System.out.println(input_double);

//        System.out.println("true/false를 입력해주세요");
//        boolean input_boolean = myScanner.nextBoolean();
//        System.out.println(input_boolean);

        // java 밖의 시스템이므로 입출력 시스템 메모리 해제해주는 것이 좋다.
        myScanner.close();

    }
}
