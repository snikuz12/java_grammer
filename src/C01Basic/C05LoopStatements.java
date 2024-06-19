package C01Basic;

import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {
//        int a = 0;
//        while (a < 10){
//            System.out.println("hello world");
//            a = a + 1;
//        }
        // 2~ 10까지 출력하는 while문 예제
//        int b = 2;
//        while (b <= 10){
//            System.out.println(b);
//            b = b + 1;
//        }
//
        // 입력한 숫자의 구구단 단수 출력
        // 3 X 1 = 3 출력
        // 3 X 2 = 6 출력
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        int counter = 1;
//        while (counter < 10) {
//            System.out.println(input + "x" + counter + " = " + input * counter);
//            counter++;
//        }

        // 1. 반복되는 도어락키 예제
        // 2. int를 string 변경
        // 3. 비밀번호를 맞추면 종료. break
        // 4. 비밀번호가 5회 이상 틀리면 종료 : "입력횟수를 초과했습니다." 출력
        // 도어락 키 if문
//        int a = 0;
//        while(a < 5){
//            String answer = "1234";
//            Scanner sc = new Scanner(System.in);
//            String input = sc.nextLine();
//            if(answer.equals(input)){
//                System.out.println("문이 열렸습니다.");
//                break;
//            }
//            else{
//                System.out.println("비밀번호가 틀렸습니다. 다시 시도하세요");
//                a ++;
//            }
//            if(a >= 5){
//                System.out.println("입력횟수를 초과하였습니다.");
//            }
//        }

//        if(answer == input){
//            // 참일 경우 실행문;
//            System.out.println("문이 열렸습니다.");
//        }else{
//            //거짓일 경우 실행문;
//            System.out.println("비밀번호가 틀렸습니다.");
//        }

//        int num = 1234;
//        int result = 0;
//        int temp = 0;
        // result에 숫자 num 을 반대로 뒤집은 숫자 값을 넣어주세요.
        // 나머지 % 값 활용
        // 내 코드
//        temp = num % 10;
//        result += temp * 1000;
//        num -= temp;
//        temp = num % 100;
//        result += temp * 10;
//        num -= temp;
//        temp = num % 1000;
//        result += temp / 10;
//        num -= temp;
//        temp = num % 10000;
//        result += temp / 1000;
//        System.out.println("Result: " + result);

        // 정답 풀이
//        int num = 1234;
//        int result = 0;
//
//        while(true){
//            int temp = num % 10;
//            result = result * 10 + temp;
//            num /= 10;
//
//            if(num == 0){
//                break;
//            }
//        }
//        System.out.println(result);

        // do while문 : 무조건 1번은 실행되는 반복문
//        int a = 100;
//        do{
//            a++;
//            System.out.println(a);
//        }while(a<10);

        // 2~ 10까지 출력을 for문을 활용하여 출력
//        for(int i = 2; i <= 10; i++) {
//            System.out.println(i);
//        }
        // 1 ~ 10 중에 홀수만 출력하기
//        for(int i = 1; i <= 10; i++) {
//            if(i % 2 != 0) {
//                System.out.println(i+"는 홀수입니다");
//            }
//        }

        // 1 ~ 10 까지의 수 중에 짝수를 모두 더한 값
//        int sum = 0;
//        for(int i = 1; i <= 10; i++) {
//            if(i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println("result = "+ sum);

        // 두 수의 최대공약수 구하기
//        int a= 24; int b = 36;
//        int max = a > b ? a : b;
//        int answer = 0;
//        for(int i=1; i <= max; i++){
//            if(a%i==0 && b%i==0){
//                answer = i;
//            }
//        }
        // 소수 구하기 : 1과 자기자신을 제외한 숫자로 나누어지지 않는 수
        // 사용자가 입력한 값이 소수인지?
        // 2, 3, 4, 5, 7...
        // 64가 2..63까지 나눠서 나눠지는 수가 있으면 소수가 아니다.
        // 64 = 8 * 8 이므로 8까지만 나눠봐도 ㄱㅊ

//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        boolean trueOrNot = false;
//        for(int i = 2; i*i <= input; i++){
//            if(input % i == 0){
//                trueOrNot = true;
//                break;
//            }
//        }
//        if(trueOrNot == false){
//            System.out.println("소수입니다.");
//        }

//        int count = 0;
//        for(int i=1; i <= 24; i++){
//            for(int j=1; j <= i; j++){
//                if(i%j == 0) {
//                }
//            }
//        }
    // 1 ~ 24 중 소수 찾기
//        for(int i = 2; i <= 24; i++){
//            boolean trueOrNot = false;
//            for(int j = 2; j < i; j++){
//                if(i % j == 0){
//                    trueOrNot = true;
//                    break;
//                }
//        }
//            if(trueOrNot == false){
//                System.out.println(i + "는 소수입니다");
//            }
//
//        }
        // 홀수만 출력하기 1 ~ 10 까지
//        for(int i=1;i<=10;i++){
//            if(i%2==0){
//                continue;
//            }
//            System.out.println(i);
//        }
//    // 배열과 enhanced for문 (향상된 for문 - for each 문)
//        int[] arr = {1,3,5,7,9};
//    // 일반 for문
//        for(int i=0; i<5; i++){
//            System.out.println(arr[i]);
//        }
//
//    // 향상된 for문 : 반복횟수는 arr에 들어가있는 데이터 개수 만큼 반복
//        for(int i : arr){
//            System.out.println(i);
//        }

    // 일반 for문을 통한 arr값 변경 후 출력
//        for(int i=0; i<5; i++){
//            arr[i] += 10;
//        }
//        System.out.println(Arrays.toString(arr)); // 메모리 주소출력이 내용출력
    // 향상된 for문을 통한 arr값 변경 후 출력
    // 향상된 for문으로는 실제 arr값의 변경은 불가능
//        for(int i : arr){
//            i += 10;
//        }
//
//        System.out.println(arr); // 메모리 주소 출력
//        System.out.println(Arrays.toString(arr)); // 메모리 주소출력이 내용출력

        // 자바 변수의 유효범위 : {}
//        int a = 10;
//        if(num>1){
//            int abc = 20;
//            num = 20;
//        }
        // abc=30; if문 중괄호 밖에서는 abc변수의 존재를 모름

        // 다중반복문 : 2 X 1 = 2
        // 각 n단 입니다. 출력
//        for (int i=2; i<10; i++){
//            System.out.println(i+"단 입니다.");
//            for(int j=1; j<10; j++){
//                System.out.println(i+"X"+j+"="+(i*j));
//            }
//        }
        // 직사각형 별찍기
//        for(int i=0; i<5; i++){
//            for(int j=0; j<10; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // 라벨문
//        loop1:
//        for(int i=0; i<5; i++){
//            for(int j=0; j<5; j++){
//                System.out.println("Hello World");
//                if(j==2){
//                    test=true;
//                    break loop1;
//                }
//            }
//            if(test)break;
//        }
        // 라벨문 활용해서 값찾기
        // 11을 찾으면 (3,1) 에 11이 있습니다.
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 11;
        loop1:
        for(int i=0;i<4;i++) {
            for(int j=0;j<3;j++) {
                if(arr[i][j] == target) {
                    System.out.print(i+","+j+"에 11이 있습니다.");
                    break loop1;
                }
            }
        }
        System.out.println(arr[0]);

    }
}
