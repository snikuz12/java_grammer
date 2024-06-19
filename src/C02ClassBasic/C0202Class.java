package C02ClassBasic;

public class C0202Class {
    public static void main(String[] args) {
        // 클래스메서드 호출방식 : 클래스명. 메서드명();
//        MyCalculator.sumAcc(10,20);
//        System.out.println(MyCalculator.sum(10,20)); //30
//        System.out.println(MyCalculator.minus(10,20)); //-10

        // A 부서의 매출
        // 20원 발생
        MyCalculator.sumAcc((20));
        System.out.println(MyCalculator.total);

        // B부서의 매출을 구하고 싶을 땐,,?? instance 만든다

        // 객체를 사용한 회계 프로그램 : 객체 고유의 메모리 공간 할당
        // A 회사의 매출
        MyCalculatorInstance m1 = new MyCalculatorInstance();
        //
        m1.sumAcc(10);
        m1.sumAcc(10);
        m1.sumAcc(10);


        MyCalculatorInstance m2 = new MyCalculatorInstance();

        C0203Person person1 = new C0203Person();
        // 변수값에 직접 접근하여 값을 할당하는 방식
//        person1.name = "홍길동";
//        person1.email = "홍길동@naver.com";
//        person1.age = 18;
//        person1.eating();
//        System.out.println("이름 : " + person1.name + "이메일은" + person1.email);
//
        // 일반적인 패턴은 변수값에 직접 접근하지 않는다.
        // 의도를 명확히한 메서드를 통해 변수값을 할당하고 가져옴.
        person1.eating(); // null이 밥을 먹는다.
        person1.setName("홍길동"); // heap메모리에 person1에 대한 메모리 할당 -> person1의 name에 setting됨
        person1.eating();

        int[] arr = new int[10];
        System.out.println(arr[0]);


    }

}

class MyCalculator{
    static int total = 0;
    static int sum(int a, int b){
        return a+b;
    }
    static void sumAcc(int a){
        total += a;
    }
    static int minus(int a, int b){
        return a-b;
    }


}
class MyCalculatorInstance{
    // static이 붙어있는 변수는 클래스변수, static이 붙어있지 않으면 객체변수
    int total = 0;
    int sum(int a, int b){
        return a+b;
    }
//    void sumAcc(int a){
//        total += a;
//    }
    int minus(int a, int b){
        return a-b;
    }

    void sumAcc(int totalInput){
        // this는 객체 그 자신을 의미
        this.total += totalInput;
    }
}

// 클래스를 통해서 객체를 만듦 (= 고유의 메모리값을 할당하여 복제본을 만듦)

