package C02ClassBasic;

public class C1204MethodOverloading {
    public static void main(String[] args) {
        C1204MethodOverloading c1 = new C1204MethodOverloading(); // 객체 만들어서
        System.out.println(c1.sum(10,20));

        // 같은 sum 메서드여도 매개변수 보고 프로그램에서 알아서 판단
        System.out.println(c1.sum(10,20, 30));
        System.out.println(c1.sum(10.1,20.2));


        // static int sum이면
       // System.out.println(sum(10,20)); 으로 호출가능
    }
    // 접근제어자를 안붙이면 기본적으로 default 접근제어자 : 같은 패키지 내에서 접근가능(=유효)
    // private : 같은 클래스 내
    // public : 같은 프로젝트 내
    int sum(int a, int b) {
        return a + b;
    }
    // 기본적으로 같은 이름의 메서드 선언할 수 없으면, 매개변수의 개수 혹은 타입이 달라지면 가능
    // 매개변수 타입 또는 개수가 다르면, 같은 이름의 메소드 정의가능
    // 즉, 메서도 오버로딩
    double sum(double a, double b) {
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a + b + c;
    }


}
