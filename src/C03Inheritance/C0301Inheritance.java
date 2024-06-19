package C03Inheritance;

// extends 키워드를 통해 상속관계를 표현
public class C0301Inheritance extends Parents{
    int c = 30; // static이 붙어있으면 main함수내에서 사용가능하지만 인스턴스 변수라서 바로사용불가

    public static void main(String[] args) {
        C0301Inheritance c1 = new C0301Inheritance();
        // 자식 클래스라 하더라도 private변수는 상속 및 접근불가
        System.out.println(c1.a); // 10
        System.out.println(c1.c); // 30
        // 메서드 상속
        c1.parentMethod();// 부모 클래스입니다.  -> (override 후) : 부모클래스가 아니라 자식 클래스입니다.

    }

    // 부모 메서드 재정의 : overriding(오버라이딩)
    // 성능의 최적화를 위해 붙여주는게 좋은 것으로 알려져있음
    @Override
    void parentMethod() {
        System.out.println("부모클래스가 아니라 자식 클래스입니다.");
    }

    void childMethod(){
        System.out.println("자식클래스 입니다.");
    }
}

// private : 같은 클래스 내에서만 접근가능
// public : 프로젝트 전체에서 접근가능
// default : 같은 패키지 내에서 접근가능
// protected : 다른 패키지이더라도 상속관계면 접근가능
//  private < default < protected < public

class Parents{
    int a = 10;

    private  int b = 20; // 자식클래스에서 접근

    void parentMethod(){
        System.out.println("부모 클래스입니다.");
    }

}
