package C01Basic;

//stack을 활용한 함수 호출 원리
public class C1101StackFuction1 {
    public static void main(String[] args) {
        System.out.println("main함수 시작");
        function1();
        System.out.println("main함수 끝");
    }
    static void function1() {
        System.out.println("function1 시작");
        function2();
        System.out.println("function1 끝");
    }
    static void function2() {
        System.out.println("function2 시작");
        System.out.println("function2 끝");
    }
}

//main함수 시작
//function1 시작
//function2 시작
//function2 끝
//function1 끝
//main함수 끝

