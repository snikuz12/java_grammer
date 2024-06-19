package C05AnonymousLambda;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C0504StreamApi {
    public static void main(String[] args) {
//        int[] arr = {20,10,4,12};
//        // 전통적인 방식의 데이터 접근방식 : 메모리 주소 접근
//        for(int i=0; i<arr.length; i++) {
//            System.out.println(arr[i]); // 원본값 접근 (객체중심)
//        }
//
//        // 함수형 프로그래밍 방식 : 데이터와 객체 중심이 아닌, 입력에 따른 출력만 존재
//        // java에서 함수형 프로그래밍을 지원하기 위한 라이브러리가 streamAPI
//        // forEach : 스트림의 각 요소를 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a -> System.out.println(a));
//
//        // arr이라는 복제본을 가지고 값을 출력 (데이터의 안정성이 올라감) -> 원본에 영향X
//        // stream 요소 : arr의 복사본, forEach : 하나씩 꺼냄
//        int[] arr2 = Arrays.stream(arr).map(a->a*10);

//        // 최종 연산 시에 모든 요소를 소모한 해당 스트림은 더는 사용할 수 없다
//        // 어떤 요소를 일회성으로 쓰기 위해서 사용
//        String[] stArr = {"hello", "world", "java"};
//        Stream<String> myStream = Arrays.stream(stArr);
//        int arrTotal = Arrays.stream(stArr).mapToInt(String::length).sum();

//        // 스트림의 생성 : .stream()
//        String[] stArr = {"HTML","CSS","JAVA","PYTHON"};
//        // stream<클래스명> : 제네릭타입으로 stream객체가 생성
//        Stream<String> stream1 = Arrays.stream(stArr);
//        List<String> stList = new ArrayList<>(Arrays.asList(stArr));
//        Stream<String> stream2 = stList.stream();
//
//        int[] intArr = {10,20,30,40,50};
//        // 기본형 자료는 별도의 stream제공
//        IntStream stream3 = Arrays.stream(intArr);
//
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        Stream<Integer> stream4 = myList.stream();
//
//        // int가 아니라 Integer이기 때문에 Intstream은 사용불가
////        IntStream stream5 = Arrays.stream(); //형변환 이슈로 안됨

//        // stream 변환(중개연산) : filter, map, sorted, distinct, limit
//        String[] stArr = {"HTML","CSS","JAVA","PYTHON"};
//        // filter : 특정기준을 대상으로 filtering 하는 것. Stream<String> 반환
//        // Stream -> Array로 반환
//        // 제네릭의 타입소거 문제 발생
//        // 제네릭의 타입소거란 제네릭타입을 런타임시점에는 제거하는 것을 의미한다. (컴파일할때 없어짐)
//        // 그래서, 타입이 소거된 Stream 객체에서 배열로 변환하려면 타입이 뭔지를 명시해줘야함(타입캐스팅)
//
//        // 문자가 4개 이하인 글자 출력 (요소 하나씩 꺼내서 filter링 한다.)
//        String[] newStArr = Arrays.stream(stArr).filter(a->a.length() <= 4).toArray(a-> new String[a]); // a 변수에는 stream 요소의 개수
//
//        // 메소드 참조 방식(매개변수가 추론가능할 때 생략하는 형식) => 클래스 ::메서드
//        // toArray(String[]::new); (new : 생성자를 호출하는 키워드 이므로 메서드로 보는 것)
//        String[] newStArr2 = Arrays.stream(stArr).filter(a->a.length() <= 4).toArray(String[]::new); // 메소드 참조
//
//        Arrays.stream(stArr).forEach(System.out::println); // 둘다 동일
//        Arrays.stream(stArr).forEach(a -> System.out.println(a)); // 둘다 동일
//
//        int[] intArr = {10,10,30,40,50};
//        // 30보다 작은 수 filtering
//        // 제네릭이 아니라 intstream이기 대문에 형변환 이슈X -> 바로 .toArray() 사용가능
//        int[] newIntArr = Arrays.stream(intArr).filter(a-> a<=30).toArray();
//        System.out.println(Arrays.toString(newIntArr)); // [10, 10, 30]
//
//        // distinct 이용 : 중복제거
//        int[] newIntArr2 = Arrays.stream(intArr).distinct().toArray();
//        System.out.println(Arrays.toString(newIntArr2)); // [10, 30, 40, 50
//
//        int total = Arrays.stream(intArr).sum();
//        System.out.println(total); // 140
//
//        // map : 기존의 스트림을 조작하여 새로운 스트림 반환
//        // 10씩 곱해본다
//        // 새로운 스트림.toArray();
//        int[] newMapArr = Arrays.stream(intArr).map(a -> a*10).toArray();
//        System.out.println(Arrays.toString(newMapArr)); // [100, 100, 300, 400, 500]
//
//        // 홀수찾기
//        int[] arr1 = {1,2,3,4,5,6};
//        // 홀수만 담은 배열 생성 : filter
//        int[] arr2 = Arrays.stream(arr1).filter(a -> a%2!=0).toArray();
//        System.out.println(Arrays.toString(arr2)); //[1, 3, 5]
//        // 홀수만 담은 배열의 값을 제곱한 새로운 배열 생성 : filter, map
//        int[] arr3 = Arrays.stream(arr1).filter(a-> a%2!=0).map(a->a*a).toArray();
//        System.out.println(Arrays.toString(arr3)); //[1, 9, 25]
//
//        // 홀수만 담은 배열의 값을 제곱한 새로운 배열 생성 후 오름차순 정렬 생성: filter, map, .sorted()
//        int[] newOddArr = Arrays.stream(arr1).filter(a-> a%2!=0).map(a->a*a).sorted().toArray();
//        // sorted(Comparator객체) : Comparator 객체에 기본형은 안됨.
//        // sorted(Comparator.reverseOrder());는 못함 => Integer 타입이어야하는데 int라서 안됨
//
//        // mapToInt : intstream 형태로 변환해주는 map
//        String[] stArr2 = {"HTML", "CSS", "JAVASCRIPT", "JAVA"};
//        // 각 문자열의 길이를 담은 새로운 int 배열 생성
//        int[] intArr5 = Arrays.stream(stArr2).mapToInt(a -> a.length()).toArray();
//        System.out.println(Arrays.toString(intArr5)); // [4, 3, 10, 4]
//
//        // limit : 개수제한 출력
//        int[] intArr6 = Arrays.stream(stArr2).mapToInt(a -> a.length()).limit(3).toArray();
//        System.out.println(Arrays.toString(intArr6)); // [4, 3, 10]

//        // 스트림의 소모연산 -> sum : 합계, reduce : 누적합계, foreach(출력) 등
//        int[] intArr = {10,20,30,40};
//        Arrays.stream(intArr).forEach(System.out::println); // a 생략가능
//        Arrays.stream(intArr).forEach(a -> System.out.println(a)); // 위와 동일
//
//        // reduce (누적연산) -> 조작가능
//        int intArrSum = Arrays.stream(intArr).sum();
//        // optional : 값이 있을수도 있고, 없을 수도 있음을 명시한 객체
//        int intArrMax = Arrays.stream(intArr).max().getAsInt(); // getAsInt() : 없으면 에러발생.
//        int intArrMin = Arrays.stream(intArr).min().getAsInt();
//        int intArrCount = (int)Arrays.stream(intArr).count(); // count의 return타입이 long이다.

//        // .reduce(초기값, 연삭식);
//        // .reduce(초기값, (a,b) -> a*b) : 누적곱
//        int allMultiply = Arrays.stream(intArr).reduce(1, (a, b) -> a * b);
//        int allAdd = Arrays.stream(intArr).reduce(0, (a, b) -> a + b);
//        System.out.println(allMultiply); // 240000
//        System.out.println(allAdd); // 100
//
//        String[] stArr = {"hello","java","world"};
//        String stAllAdd = Arrays.stream(stArr).reduce("", (a, b) -> a + b);
//        System.out.println(stAllAdd); // hellojavaworld
//
////        // 중복을 제거한 요소들의 합
////        int[] testArr = {10,10,20,20,20,30};
////        int answer = Arrays.stream(testArr).distinct().sum();
//
//        // findFirst : 첫번째 요소 찾기
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("kim",20));
//        students.add(new Student("choi",32));
//        students.add(new Student("lee",35));
//        students.add(new Student("park",22));
//
//        // 나이가 30이 넘는 학생 중에 첫번째 index값을 가지는 학생 객체 생성
//        Student s1 = students.stream().filter(a-> a.getAge()>=30).findFirst().get();
//        System.out.println(s1); // 이름 : choi, 나이 : 32
//
//        // Student 객체 실습
//        // 1) 모든 객체의 평균나이 : int에 결과를 담기 (average : Optional Double 이므로 getAsDouble)
//        int students_avg = (int)students.stream().mapToInt(a->a.getAge()).average().getAsDouble();
//        System.out.println(students_avg); // 27
//
//        // 2) 가장 나이 어린사람 찾기 : Student에 담아주기
//        Student students_min = students.stream().sorted((a,b)->a.getAge() - b.getAge()).findFirst().get();
//        System.out.println(students_min.getName()); // kim
//
//        // 3) 30대의 이름을 String 배열에 담기
//        String[] nameArr = students.stream().filter(a-> a.getAge()>=30).map(a->a.getName()).toArray(String[]::new);
//        System.out.println(Arrays.toString(nameArr)); // [choi, lee]
//
//        // Stream<객체> => Optional<객체> => get()
//        // IntStream => OptionalInt => getAsInt();
//
//        // Optional 객체 : 특정객체에 값이 없을지도 모른다는 것을 명시적으로 표현
//        // ofNullable : null이 있을수도 있는 경우에 Optional 객체를 생성하는 메서드
//        Optional<String> opt1 = Optional.ofNullable(null);
//        String st1 = null;
//        if(st1 != null){
//            System.out.println(st1.compareTo("hello"));
//        }else {
//            System.out.println("값이 없습니다.");
//        } // 에러날 수 있음
//
//        if(opt1.isPresent()){
//            System.out.println(opt1.get().compareTo("hello"));
//        }else{
//            System.out.println("값이 없습니다.");
//        }

        // Optional 생성 3가지 방법
        Optional<String> opt1 = Optional.empty();
        Optional<String> opt2 = Optional.of("hello"); //null이 못들어감
        Optional<String> opt3 = Optional.ofNullable(null);// null이 들어갈수있음

        // Optional 객체 처리 방법 4가지
        // 방법 1. isPresent() 확인 후 get()
        if(opt3.isPresent()){
            System.out.println(opt3.get().length()); // 5
        }
        // 방법 2. orElse() : 값이 있으면 return, 없으면 지정값 return
        System.out.println(opt3.orElse("").length()); // 0
        // 방법 3. orElseGet() : 값이 있으면 return, 없으면 람다함수 실행
        System.out.println(opt3.orElseGet(()-> new String("")).length()); // 0
        // 방법 4. orElseThrow() : 가장 중요. 값이 있으면 return, 없으면 지정된 예외 강제 발생
        // 개발에서 예외를 사용자에게 적절한 메시지 전달 목적으로 강제 발생시키는 경우도 존재.
        System.out.println(opt3.orElseThrow(() -> new NoSuchElementException("값이 없습니다.")).length());
        System.out.println(opt3.get().length());

        List<Student> students = new ArrayList<>();
        students.add(new Student("kim", 20));
        students.add(new Student("kim1", 21));
        students.add(new Student("kim2", 23));
        students.add(new Student("kim3", 25));

        // 방법 1 Option<> : 기본자료형은 <>안에 못들어감 -> 아예 OptionalDouble 형태로 제공함
        OptionalDouble answer = students.stream().filter(a->a.getAge() >= 29).mapToInt(a->a.getAge()).average();
        if(answer.isPresent()){
            System.out.println(answer.getAsDouble());
        }else{
            System.out.println("값이 없습니다.");
        }
        System.out.println(answer);

        // 방법 2
        double answer2 = students.stream().filter(a->a.getAge()>=29).mapToInt(a->a.getAge()).average().orElseThrow(()->new NoSuchElementException("값이 없습니다."));

    }
}
