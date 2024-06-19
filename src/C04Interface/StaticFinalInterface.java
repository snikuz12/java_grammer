package C04Interface;

public class StaticFinalInterface {
    public static void main(String[] args) {
        MyImplements m1 = new MyImplements();
        m1.methodA();
        // MyImplements에 my_constant 변수가 상속되었다.(static final 변수)
        System.out.println(MyImplements.my_constant);
    }
}
interface MyInterface {
    // 아래 변수는 컴파일 타임에 static final 키워드가 붙음
    int my_constant = 10;

    void methodA();
}
class MyImplements implements MyInterface {
    @Override
    public void methodA() {
        System.out.println("hello world");
    }
}