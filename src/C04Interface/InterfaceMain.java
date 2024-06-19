package C04Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        CatImplements cat1 = new CatImplements();
        cat1.makeSound(); // 야옹
        DogImplements dog1 = new DogImplements();
        dog1.makeSound(); // 멍멍

        Animalnterface1 cat2 = new CatImplements(); // 왼쪽에 인터페이스
        cat1.makeSound(); // 야옹
        Animalnterface1 dog2 = new DogImplements();
        dog1.makeSound(); // 멍멍

        // 다형성 : 한나의 객체가 여러개의 참조변수를 가질 수 있음을 의미

        CatMultiImplements cat3 = new CatMultiImplements();
        cat3.makeSound();
        System.out.println(cat3.play("코숏","먼치킨"));

        DogMultiImplements dog3 = new DogMultiImplements();
        dog3.makeSound();
        System.out.println(dog3.play("진돗개","시바견"));

        // 기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하나,
        // 익명내부클래스 방식으로 생성가능
        Animalnterface1 ai1 = new Animalnterface1() {
            @Override
            public void makeSound() {
                System.out.println("hello");
            }
        };
        ai1.makeSound();
    }
}
