package C02ClassBasic;

public class C0201Method {
    public static void main(String[] args) {
        // 코드의 중복이 발생하므로, 반복을 피하기 위해 위 기능을 분리
        // for문 이용해서 100~200까지 total값 출력
        System.out.println(sumAcc(100,200));

        // 기본방식 : 클래스명.메서드
        // 같은 클래스내에서의 클래스메서드 호출은 클래스명 생략가능
        System.out.println(C0201Method.sumAcc(100,200));
        System.out.println(sumAcc(100,200));

    }
    // 클래스 안의 메서드(함수)
    // int 라는 리턴타입을 가짐
    // input(매개변수) 값을 int 2개로 정의
    // 메서드 구성요소 : 매개변수, 리턴타입, 접근제어자(public), 클래스메서드여부(static) -> 4가지
    // 리턴타입 없으면 void
    public static int sumAcc(int start, int end){
        // 함수명 : 대문자시작X camelcase사용
        // start ~ end까지 총합을 구해주는 함수
        int total = 0;
        for(int i = start; i <= end; i++){
            total += i;
        }
        return total;
    }
}
