package C01Basic;

public class C1102StackFunction2 {
    public static void main(String[] args) {
        System.out.println("main함수 시작");
        function1(1);
        System.out.println("main함수 끝");
    }
    static int function1(int a) {
        System.out.println("function1 시작" + a);
        System.out.println("function1 끝");
        return function1(a+1); // 5098 정도까지 가다가 stack overflow 발생
        // 재귀함수를 잘못사용하면 stack overflow 발생할 수 있다.
    }
}
