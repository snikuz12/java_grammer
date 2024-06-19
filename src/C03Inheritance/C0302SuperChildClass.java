package C03Inheritance;

public class C0302SuperChildClass extends SuperParents{
    int a;
    int c;
    // super() : 부모클래스의 생성자 호출을 의미
    // super.변수명 : 부모클래스의 변수명 (부모클래스와 자식클래스의 변수명이 같을때 구분지어주기 위해 사용)
    C0302SuperChildClass() {
        super(30);
        a = 10;
        c = 20;
    }

    public static void main(String[] args) {
        C0302SuperChildClass c1 = new C0302SuperChildClass();
        c1.display2();// 변수명이 똑같은 경우 부모보다 자식클래스의 것이 먼저다.
    }
    void display2(){
        System.out.println(a); // this.a와 같음 => 10 출력
        System.out.println(super.a); // 굳이 부모의 것을 출력하고 싶은경우 super. 붙여주면 됨 => 30 출력
    }
}
class SuperParents{
    int a;
    SuperParents(int a){
        this.a = a;
    }
    void display(){
        System.out.println("부모클래스입니다.");
    }
}
