package C01Basic;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
        // 참조자료형 : 기본 자료형을 제외한 모든 자료형
        // WrapperClass : 기본형 타입을 Wrapping한 클래스
        // int와 Integer간의 형변환
//        int a = 10;
//        Integer b = new Integer(20);
//        // 오토 언박싱 : Integer-> int 형변환
//        int c = b;
//        // 오토 박싱
//        Integer d = a;

//        // String과 int의 형변환
//        int a = 10;
//        // int -> String
//        String st1 = Integer.toString(a);
//        String st2 = String.valueOf(a);
//        // String -> int
//        int b = Integer.parseInt(st1);

        // 참조자료형에 원시자료형을 담을 때는 Wrapper클래스를 써야 한다.
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);

        // String 변수 생성방법
//         객체 생성 -> 이게 룰이지만
//        String st1 = new String("hello");
//         리터럴 방식 -> 이걸 더 추천 권장하는 방식
//         문자pool을 통해 성능향상하는 방식
//        String st2 = "hello";
//        String st3 = new String("hello");
//        String st4 = "hello";
//        System.out.println(st1==st3); // 두 개의 메모리 주소 값을 비교 (false)
//        System.out.println(st2==st4); // 같은 값을 바라보고 있음
//        System.out.println(st3==st4);
//        System.out.println(st1.equals(st3));
//        System.out.println(st2.equals(st4));
//        System.out.println(st3.equals(st4));
//        System.out.println("hello".equalsIgnoreCase("hellO")); // 대소문자 구분없이 비교하기 true
        // String 문자열 비교는 equals (메모리 주소 비교가 아니라 값 비교다)

//        // 문자열 길이 : length();
//        String st1 = "hello java java";
//        System.out.println(st1.length());
//
//        // IndexOf : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치
//        int index1 = st1.indexOf("java");
//        System.out.println(index1);
//        // lastIndexOf : 마지막 문자열의 index 위치
//        System.out.println(st1.lastIndexOf("java"));
//
//        // contains : 특정 문자열이 있는지 여부를 boolean으로 리턴
//        System.out.println(st1.contains("hello")); // true
//        System.out.println(st1.contains("world")); // false
//
//        // charAt : 특정 index의 문자(char)값을 리턴
//        String st = "abcdefabaadf";
//        char ch1 = st.charAt(0);
//        char ch2 = st.charAt(6);
//        // 값 비교할 때 char는 ch1 == ch2
//        System.out.println(ch1 == ch2);
//
//        // 위의 문자열에 a의 개수가 몇개인지 count
//        // for문과 charAt, length() 사용
//        int count = 0;
//        for(int i=0; i<st.length(); i++){
//            if(st.charAt(i) == ch1){
//                count++;
//            }
//        }
//        System.out.println(count);

//        String st = "abcdefabaadf";
//        // toCharArray() : String 문자열을 char 배열로 리턴
//        System.out.println(Arrays.toString(st.toCharArray()));
//
//        // toCharArray를 활용하여 a가 몇갠지 count, 향상된 for문 사용
//        char[] arr = st.toCharArray();
//        int count = 0;
//        for(char i : arr){
//            if(i == 'a'){
//                count++;
//            }
//        }
//        System.out.println(count);

        // 문자열 더하기 : += : 메모리 접급 + 재할당 하는거라서 성능이 낮아진다
//        String st1 = "hello";
//        st1 += "world";

        // 프로그래머스 : 특정 문자 제거하기
//        for(int i=0; i<my_string.length(); i++){
//            if(my_string.charAt(i)!=letter.charAt(0)){
//                answer += my_string.charAt(i);
//            }
//        }
//        System.out.println(answer);

//        for(int i=0; i<my_string.length(); i++){
//            if(my_string.charAt(i) != letter.charAt(0)){
//                answer += my_string.charAt(i);
//            }
//        }

        // substring(a,b) : a이상 b미만의 index의 문자를 잘라 리턴
//        String st1 = "hello world"; // hello : 0 ~ 5
//        System.out.println(st1.substring(0,5));
//        System.out.println(st1.substring(6,st1.length()));
//        System.out.println(st1.substring((6,10));

        // 프로그래머스 : 가운데 글자 가져오기
//        String answer = "";
//        int len = s.length();
//        if (len % 2 != 0) {
//            answer = s.substring(len / 2, len / 2 + 1);
//        }else{
//            answer = s.substring(len / 2 - 1,len/2 + 1);
//        }
//        return answer;

        // trim, strip : 문자열 양쪽 끝의 공백 제거
//        String trimSt1 = "      hello world    ";
//        String trimSt2 = trimSt1.trim();
//        String trimSt3 = trimSt1.strip();
//        System.out.println(trimSt1);
//        System.out.println(trimSt2);
//        System.out.println(trimSt3);

//        // toUppercase : 대문자로 변환, toLowercase : 소문자로 변환
//        String s1 = "hello";
//        String s2 = s1.toUpperCase();
//        System.out.println(s2); // HELLO
//
//        String s3 = s1.toLowerCase();
//        System.out.println(s3); //hello
//
//        // char -> String 형 변환
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);
//        char ch2 = st1.charAt(0);
//        System.out.println(st1);
//
//        // replace(a,b) : a 문자열을 b 문자열로 대체
//        String st1 = "hello world";
//        String st2 = st1.replace("world", "java");
//        System.out.println(st2);

//        // replaceAll(a,b) : replace와 동일, 정규표현식을 쓸 수 있음.
//        String st1 = "01abc123한글123";  // 숫자, 알파벳, 한글 등이 섞여 있을 때
//        // for문 활용해서 알파벳(소문자) 제거
//        String answer = "";
//        for(int i=0; i<st1.length(); i++){
//            if(st1.charAt(i) < 'a' || st1.charAt(i) > 'z'){
//                answer += st1.charAt(i);
//            }
//        }
//        System.out.println(answer);

//        // replaceAll과 정규표현식 활용
//        String st1 = "01abc123한글123";
        // [a-z]+ : a-z 1개 이상의 소문자 알파벳을 표현하는 정규표현식
        // [A-Za-z]+ : 대소문자 포함
        // [가-힣]+ : 한글
        // [0-9]+ : 숫자
//        String answer = st1.replaceAll("[A-Za-z]+","");// 패턴형식, 대체문자
//        System.out.println(answer);
//
//        // String의 matches와 Pattern.matches() 정규표현식과 일치하는지 boolean값으로 return
//        String test = "helloA";
//        System.out.println(test.matches("[A-Za-z]+")); // true
//
//        boolean b1 = Pattern.matches("[0-9]+", "12345hello");// false
//        boolean b2 = Pattern.matches("[0-9]+", "12345"); //true
//        System.out.println(b1);
//        System.out.println(b2);

        // 프로그래머스 : 문자열 다루기
//        boolean answer = false;
//        if((s.length() == 4 || s.length() == 6) && s.matches("[0-9]+")){
//            answer = true;

        // ^ : 정규표현식의 시작, $ : 정규표현식의 끝, * : 반값포함
//        boolean b2 = Pattern.matches("^[A-Za-z]*$", "HelloWorld");
//        System.out.println(b2);

        // 전화번호 패턴 검증
//        while(true){
//            Scanner sc = new Scanner(System.in);
//            String number = sc.nextLine();
//
//            //boolean check = Pattern.matches("^[0-9]*$", number);
//            if(Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", number)) {
//                System.out.println("올바르게 입력하셨습니다.");
//            }else{
//                System.out.println("틀린 형식의 전화번호입니다.");
//            }
//        }
//
//        // 이메일 검증 : 소문자+숫자@소문자.com 형식
//        String email = "abc@naver.com";
//        boolean b3 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$",email);
//        System.out.println(b3);

//        // split : 특정문자를 기준으로 문자열을 자르는 것. 문재열 배열을 return
//        String a = "a:b:c:d";
//        String[] a_arr = a.split(":");
//        System.out.println(Arrays.toString(a_arr));

//        // 공백이 여러개인 것이 끼어있을 경우
//        String b = "a b c   d";
//        // \s : 공백 (escape문으로 \하나 더 붙여줘야 함)
//        String[] b_arr = b.split("\\s+"); // 공백 하나 이상

//        // isEmpty와 null(자료타입)
//        String st1 = null;
//        String st2 = " ";
//        // equal 관계가 아님
//        System.out.println(st1==st2);
//        // 문제 발생X
//        System.out.println(st2.isEmpty()); //true (null은 아니기 때문에 오류X)
//        // 문제 발생O : NullPointer Excepton예외 발생
//        System.out.println(st1.isEmpty()); //false (String이기는 하나 null이기 때문)

//        // join : String[]을 하나의 String 만드는 메서드
//        String[] arr = {"java", "python", "C++", "javascript"};
//        // 클래스 메서드
//        String st = String.join(" ",arr); //어떤기준으로 join할건지?
//        System.out.println(st);
//
//        // StringBuffer
//        StringBuffer sb1 = new StringBuffer("hello");
//        // .append : 문자열 가장 뒤에 다른 문자열을 더하는 것.
//        sb1.append(" java");
//        sb1.append(" world"); // world를 더하겠다.
//        // 중간에 끼워넣기
//        sb1. insert(5, " python");
//        // 삭제
//        sb1.delete(17,sb1.length());
//        System.out.println(sb1.toString());

        // String += < StringBuffer < StringBuilder

//        // StringBuilder는 스레드 safe X
//        StringBuilder sb2 = new StringBuilder();
//        sb2.append("hello");
//        sb2.append("\n"); // 줄바꿈
//        sb2.append("world");
//        System.out.println(sb2.toString());
//
//        // StringBuilder를 사용해서 각 문자를 n번만큼 반복하기
//        String my_string = "hello";
//        StringBuilder sb3 = new StringBuilder("hello");
//        int n = 3; // hhheeellllllooo 결과가 answer에 담기도록
//
//        for(int i = 0; i < my_string.length(); i++) {
//            char temp = my_string.charAt(i);
//            for(int j = 0; j < n; j++) {
//                sb3.append(temp);
//            }
//        }
//        System.out.println(sb3);

        // 프로그래머스 : 문자열 밀기

    }
}
