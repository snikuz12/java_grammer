package C05AnonymousLambda;

import java.sql.SQLOutput;

public class C0502AnonymousClass {
    public static void main(String[] args) {
        // AbstractAnimal 상속한 클래스가 별도로 존재하지 않고,
        // 익명의 클래스가 만들어짐과 동시에 익명객체가 생성됨
        AbstractAnimal a1 = new AbstractAnimal() {
            @Override
            void makeSound2() {}
        };
        // 익명객체에 구현메서드가 1개밖에 없을 때에 람다표현식(화살표함수)로 표현가능
        // () 부분에 매개변수를 지정하여 구현체에서 활용한다.
        // 변수의 개수가 많을 때에는 개수와 순서에 맞춰서 지정
        // (매개변수) -> 구현부
        Animal a2 = (a,b) -> System.out.println("동물소리를 냅니다." +a+b);
//                new Animal() { // 이렇게 구현하는게 정석
//            @Override
//            public void makeSound() {
//                System.out.println("동물소리를 냅니다.");
//            }
//        };

        // 익명객체를 만들어서 input1+input2+input3을 더해서 return하는 메서드 정의
        // 위에서 return 된 문자열 출력
        // 실행문이 한줄일때는 {} 와 return 생략 가능
        // 2줄 이상일 때는 {}를 사용해서 return 처리
        Animal2 a3 = (a,b,c) ->  a+b+c; // return 생략 가능 (익명함수 : 함수명은 필요없다)
        System.out.println(a3.makeSound("hello","world",3)); // helloworld3

        Animal2 a4 = (a,b,c) -> {
            if(c>10){
                return a+b;
            }else{
                return a;
            }
        };
        System.out.println(a4.makeSound("hello","world",3)); // hello

//        Animal2 a4 = new Animal2() {
//            @Override
//            public String makeSound(String a, String b, int c) {
//                return "Animal2의 makeSound입니다"+a+b+c;
//            }
//        };
    }
}

interface Animal {
    void makeSound(int input1, String input2);

}

interface Animal2{
    String makeSound(String a, String b, int c);
}

abstract class AbstractAnimal{
    void makeSound1(){

    }
    abstract void makeSound2();
}
