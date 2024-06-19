package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0603GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java", "python", "C"};
        stChange(stArr,0,1); // stArr에서 0번째와 1번째를 바꿔줌
        System.out.println(Arrays.toString(stArr)); // [python, java, C]
        Integer[] intArr = {10, 20, 30};
        intChange(intArr,0,1);
        System.out.println(Arrays.toString(intArr)); // [20, 10, 30]
        genericChange(stArr,1,2);
        System.out.println(Arrays.toString(stArr)); // [python, C, java]

        Person p1 = new Person();
        p1.setValue("jeongseulki");

        GenericPerson<Integer> p2 = new GenericPerson<>();
        p2.setValue(100);
        System.out.println(p2.getValue()); // 100

        // 제네릭 소거
        // => object 타입추론
        // => 추론시점 : 런타임(리플렉션)

        // 제네릭 사용
        List<String> myList = new ArrayList<>();
        myList.add("hello");
        myList.add("java");

        // 컴파일 후 제네릭 소거
//        List myList = new ArrayList<>();
//        myList.add("hello");
//        myList.add("java");

    }

    // 제네릭메서드 생성 : 반환타입 왼쪽에 <T> 선언 (<A> 써도 상관없음)
    // 유의점 : 제네릭은 객체 타입이 들어와야 함
    static <T> void genericChange(T[] arr, int i, int j){
        // 배열의 i번째 요소와 j번째 요소를 swap 해줌
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void stChange(String[] arr, int i, int j){
        // 배열의 i번째 요소와 j번째 요소를 swap 해줌
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void intChange(Integer[] intArr, int i, int j){
        // 배열의 i번째 요소와 j번째 요소를 swap 해줌
        Integer temp = intArr[i];
        intArr[i] = intArr[j];
        intArr[j] = temp;
    }
}
// 제네릭 클래스는 클래스명 옆에 <T>선언
class GenericPerson<T>{
    T value;
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}


class Person{

    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}



