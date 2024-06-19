package C05AnonymousLambda;

import java.util.*;

public class C0503ComparableComparator {
    public static void main(String[] args) {
        // 자바에서는 비교를 위한 인터페이스 2개 제공 : Comparable, Comparator
        // Comparable 인터페이스에는 compareTo메서드 선언이 되어있다(메서드가 하나밖에 없는 인터페이스)
        // Comparator 인터페이스에는 compare메서드 선언이 되어있다.

        // String 클래스 안에 CompareTo 내장(Comparable 구현, 오버라이딩된 것)
        // String 클래스 외에 java 많은 내장 클래스에서 Comparable 구현
//        String a = "hello";
//        String b = "horld";
        // 두 문자열의 각 자리를 순차적으로 비교
        // 문자열의 비교는 유니코드값의 차이를 반환하는 것
//        System.out.println(a.compareTo(b));
//
//        Integer a1 = 10;
//        Integer a2 = 10;
//        System.out.println(a1.compareTo(a2));// 0

//        List<String> myList = new ArrayList<String>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("javascript");
//        Collections.sort(myList); // Comparable의 compareTo메서드를 구현하여 정렬
//        System.out.println(myList); // [java, javascript, python]
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList); // [python, javascript, java]
//
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());

        List<Student> students = new ArrayList<>();
        students.add(new Student("kim", 24));
        students.add(new Student("lee", 21));
        students.add(new Student("park", 35));
        students.add(new Student("choi", 15));
        students.add(new Student("kim", 30));

//        // 방법1. Student 객체에서 Comparable을 구현 => compareTo메서드를 오버라이딩
//        Collections.sort(students);
//        for (Student s : students) {
//            System.out.println("이름 : "+ s.getName() + "나이 : "+ s.getAge());
//        }
//        //    choi 15
//        //    lee 21
//        //    kim 24
//        //    kim 30
//        //    park 35

        // 방법2. Comparator를 구현한 익명객체를 sort에 주입
        // Compare 메서드 오버라이딩
        Comparator<Student> myComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge(); // 나이 오름차순
            }
        };
//        for (Student s : students) {
//            System.out.println("이름 : "+ s.getName() + "나이 : "+ s.getAge());
//        }
        System.out.println(students);
        students.sort(myComparator); // Comparator 구현체를 필요로 한다.

        // 람다표현식으로 표현
        Comparator<Student> myComparator2 = (a,b) -> a.getAge() - b.getAge(); // 나이 비교
        students.sort(myComparator2);
        students.sort((a,b) -> a.getAge() - b.getAge());
        students.sort((a,b) -> a.getName().compareTo(b.getName())); // 이름 비교

//        students.sort(Comparator.reverseOrder());

        // 실습 : 아래 문자열을 글자길이 순서로 내림차순 정렬하여라
        String[] stArr = {"hello", "java", "C++", "world2"};
        Arrays.sort(stArr, Comparator.reverseOrder()); // 유니코드(문자)기준 내림차 순

        // reverseOrder 를 글자기준 말고 글자길이를 기준으로 내림차 순으로 커스텀하고 싶다.
        Arrays.sort(stArr, (a,b)-> b.length() - a.length()); // 글자길이 내림차 순 (길이 비교)
        System.out.println(Arrays.toString(stArr)); // [world2, hello, java, C++]

        // [4,5], [1,2], [5,0], [3,1]
        // 위 배열이 들어간 아래 리스트를 배열에 0번째가 아닌 1번째 요소를 기준으로 내림차순 배열 정렬
        List<int[]> myList = new ArrayList<>();
        myList.add(new int[]{4,5});
        myList.add(new int[]{1,2});
        myList.add(new int[]{5,5});
        myList.add(new int[]{5,0});
        myList.add(new int[]{3,1});

        myList.sort((a,b) -> b[1] - a[1]); // 내림차순이므로 b[1] - a[1]
        // a가 먼저나오면 오름차순, b가 먼저나오면 내림차 순
        // 왼쪽이 더 크면 양수, 오른쪽이 더 크면 음수, 같으면 0
        for (int[] a : myList) {
            System.out.println(Arrays.toString(a));
        }

        // +요구사항) 만약 1번째가 같을 때 0번째를 기준으로 내림차 순 한다.
        Comparator<int[]> myComparator3 = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o2[0] - o1[0];
                }else{
                    return o2[1] - o1[1];
                }
            }
        };
        for (int[] a : myList) {
            System.out.println(Arrays.toString(a));
        }

        // 람다함수 사용
        Comparator<int[]> c1 = (o1,o2) -> {
            {
                if(o1[1] == o2[1]){
                    return o2[0] - o1[0];
                }else{
                    return o2[1] - o1[1];
                }
            }
        };
        myList.sort(c1);

        // 우선순위 큐 PQ 사용
        String[] stArr2 = {"hello", "java", "C++", "world2"};
        Queue<String> pq = new PriorityQueue<>();
        for(String s : stArr2){
            pq.add(s);
        }
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
//        C++
//        hello
//        java
//        world2

        // 우선순위큐 내림차순으로 정렬하고 싶다면
        Queue<String> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        for(String s : stArr2){
            pq2.add(s);
        }
        while (!pq2.isEmpty()){
            System.out.println(pq2.poll());
        }

        // 글자길이 내림차 순
        String[] stArr3 = {"hello", "java", "C++", "world2"};
        Queue<String> pq3 = new PriorityQueue<>((o1,o2)-> o2.length() - o1.length());
        for(String s : stArr3){
            pq3.add(s);
        }
        while (!pq3.isEmpty()){
            System.out.println(pq3.poll());
        }

        // 프로그래머스 : 가장 큰 수
//        List<String> list = new ArrayList<>();
//        int[] numbers = new int[]{3, 30, 34, 5, 9};
//        for(int number : numbers){
//            list.add(String.valueOf(number));
//        }
//        list.sort((a,b)-> (b+a).compareTo(b+a));
//        String answer = String.join("",list);

        // 쓰레드 구현 방법 : 쓰레드 상속, Runnable 객체 주입
        // Runnable 인터페이스 주입을 통한 쓰레드 생성
        // thread : 한 task를 처리하는 단위 (자바에서는 인위적으로 thread를 생성해줘야한다)
        // thread 생성 방식 2가지 : runnable 객체 주입 (runnable 인터페이스 ->객체생성 -> 스레드에 주입)
        // Runnable에는 run이라는 단일메서드만 있기때문에 익명함수 사용가능
        Thread t1 = new Thread(new Runnable() {
            // new Runnable (Runnable 객체 생성) 하여 주입
            @Override
            public void run() {
                System.out.println("새로 생성한 쓰레드1 입니다.");
            }
        });
        t1.start(); // 쓰레드 만들고 start
        Thread t2 = new Thread( () -> System.out.println("새로 생성한 쓰레드2 입니다."));
        t2.start();
        new Thread( () -> System.out.println("새로 생성한 쓰레드3 입니다.")).start();
        System.out.println("main 스레드입니다.");
        // 스레드는 4주체가 동시에 실행되다보니 순서가 보장되지 않는다.
        // 한 스레드 안에서 생성되는 코드(작업내용)는 순서가 보장된다.
        //        새로 생성한 쓰레드1 입니다.
        //        새로 생성한 쓰레드2 입니다.
        //        main 스레드입니다.
        //        새로 생성한 쓰레드3 입니다.


    }
}

//class Student implements Comparable<Student> { // 어떤 객체를 Compare할건지 <>안에 표기
class Student  {
    String name;
    int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    // 모든 클래스의 조상클래스인 Object 클래스의 toString 메서드를 Overriding 하여
    // 객체 호출시에 자동으로 toString메서드 호출
    @Override
    public String toString() {
        return "이름 : " + this.name + ", 나이 : " +this.age;
    }

//
//    @Override
//    public int compareTo(Student s) {
////        return this.name.compareTo(s.getName());
////        return s.getName().compareTo(this.name);
////        return s.getAge() - this.age; // 내림차 순
//        return this.age - s.getAge(); // 오름차순
//    }
}