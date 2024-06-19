package C03Inheritance;

public class C0304ProtectedTest {
    public static void main(String[] args) {
        C0304ProtectedClass pc = new C0304ProtectedClass();

        // public 접근가능
        System.out.println(pc.st4);

        // private 변수 접근 불가능
//        System.out.println(pc.st1); // 오류 뜸

        // defualt 변수 접근가능
        System.out.println(pc.st2);

        // protected 변수 접근가능 : 같은패키지 벗어나더라도 상속관계인 경우 접근가능
        System.out.println(pc.st3);
    }
}
