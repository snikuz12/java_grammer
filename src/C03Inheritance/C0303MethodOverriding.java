package C03Inheritance;

public class C0303MethodOverriding {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound2(); // 멍멍멍

        // 상속관계일 때 부모클래스타입을 자식클래스객체의 타입으로 지정가능
        // Animal클래스에 정의된 메서드만 사용가능하도록 제약 발생
        Animal myDog2 = new Dog();
        // Animal에 있는 메서드만 사용가능
//        myDog2.sound(); // 컴파일에러발생

        // Dog myDog3 = new Animal(); => 자식 클래스 = new 부모클래스 이건불가능
        // 자식클래스에 부모클래스에 없는 메서드가 있을 수 있기 때문

        // 오버로딩 : 같은 메서드 이름의 메서드 여러개 정의
        // 오버라이딩 : 부모클래스의 메서드를 재정의

    }
}
class Animal{
    void sound(){
        System.out.println("동물은 소리를 냅니다.");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("멍멍");
    }
    void sound2(){
        System.out.println("멍멍멍");
    }
}
class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("야옹");
    }
}
