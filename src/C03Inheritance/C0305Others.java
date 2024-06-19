package C03Inheritance;

//public class C0305Others extends FinalParents{ // Final 클래스 상속 불가 (오류)
public class C0305Others {
    public static void main(String[] args) {
//        AbstractDog dog = new AbstractDog();
//        // 추상클래스와 인터페이스는 구현없이 객체생성 불가
//        AbstractAnimal animal = new AbstractAnimal();
//        List<Integer> myList = new ArrayList<Integer>();
    }
}

// final : 상수 (변하지 않는 값) 선언할 때 사용
// final을 클래스에 붙이면 상속부라갛나 클래스 생성
final class FinalParents{

}
// 인터페이스는 모든 메서드가 추상메서드
// 추상 메서드가 하나라도 있으면 클래스도 추상클래스가 되어야 한다.
// 추상 클래스 abstract class
class AbstractAnimal{
    void makeSound1(){
        System.out.println("동물소리를 냅니다.1");
    }

    // 메서드 앞에 final이 붙으면 오버라이딩 불가
    final void makeSound2(){
        System.out.println("동물소리를 냅니다.2");
    }

    // abstract 키워드는 자식클래스로 하여금 오버라이딩 강제
    // abstract 메서드가 하나라도 있으면 반드시 클래스에도 abstract 키워드가 붙어야 함
    // 리턴타입과 매개변수만 정의되어 있음
    //abstract void makeSound3();
}

abstract class AbstractDog extends AbstractAnimal{
    // 메서드 앞에 final이 붙으면 오버라이딩 불가
//    @Override
//    void makeSound2(){
//        System.out.println("멍멍2");
//    }

//    @Override
//    void makeSound3(){
//        System.out.println("멍멍3");
//    }
}

