package C03Inheritance.ProtectedTest;
// 루트(최상단) 패키지는 src
// 구분자 . 으로 구분
// import 룰 :
// * 을 통해 패키지 내에 모든 클래스 import 가능 (import C03Inheritance.*;)
// * 을 통해 패키지 내에 패키지까지 포함해서 모든 내용 import는 불가능
// 즉, import java.*은 불가능
import C03Inheritance.C0304ProtectedClass;

public class ProtectedMain extends C0304ProtectedClass {
    public static void main(String[] args) {
        // C0304ProtectedClass 을 가져다 쓰는건 protected랑 상관없음
        // 상속관계에 있으면 패키지가 달라지더라도 접근가능
        C0304ProtectedClass c1 = new C0304ProtectedClass();

//        // default 접근불가
//        System.out.println(c1.s2); // 오류
//        // protected 접근불가
//        System.out.println(c1.s3); // 오류

        ProtectedMain p1 = new ProtectedMain();
        // default 접근 불가
//        System.out.println(p1.s2); // 오류

        // 상속한 객체에서 protected 접근가능
        // 패키지가 다를 때 상속한 클래스의 객체를 만들어서 접근해야 protected 접근가능
        // 원래 클래스 객체 만드는거 아님
        System.out.println(p1.st3);
        // protected : 패키지가 다르더라도, 상속관계에 있는 자식클래스 객체를 생성시에 부모클래스의 protected요소에 접근가능

    }
}
