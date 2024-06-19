package C01Basic;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;

public class C07Array {
    public static void main(String[] args) {
//        // 배열 표현식 1 : 리터럴 방식
//        int[] intArr1 = {1, 2, 3, 4, 5};
//
//        // 배열 표현식 2 : 선언 후 할당방식
//        int[] intArr2 = new int[5];
//        intArr2[0] = 1;
//        intArr2[1] = 2;
//        intArr2[2] = 3;
//        intArr2[3] = 4;
//        System.out.println(intArr2[4]); // 0으로 초기화
//        for(int i=0; i<intArr2.length; i++){
//            System.out.println(intArr2[i]);
//        }
//        for(int i : intArr2){
//            System.out.println(i); // 원본 값에 들어가서 변경 못함
//   }
//
////        String[] charArr = new String[10];
////        System.out.println(charArr[0]);
//
//        // 표현식 3
//        int[] intArr3 = new int[]{1, 2, 3, 4};
//        // test(new int[]{1, 2, 3, 4}); //로도 할당가능
//
//        // 표현식 4 : 불가 -> 배열의 길이는 사전이 지정되어야 함.
//        int[] intArr4 = new int[];
//        String[] stArr1 = new String[5];
//        stArr1[0] = "hello";
//        stArr1[1] = "java";
//        // null pointer exception : 값을 할당안하면 null로 들어감 -> null을 대상으로 메서드를 사용하면 예외발생
//        System.out.println(stArr1[2].length());
//
//        String[] stArr2 = new String[5];
//        // 배열에 값 한꺼번에 세팅
//        Arrays.fill(stArr2, "java");
//        System.out.println(stArr2[3]);

//    // 85, 65, 90인 int 배열을 선언하고, 총합, 평균을 구해보자
//    int[] arr = {85, 65, 90};
//    int sum = 0;
////    int[] arr = new int[]{85, 65, 90} 도 사용가능 (통째로 매개변수로 넘겨주는 경우에 사용. 대부분 사용X)
//    for(int i=0; i< arr.length; i++){
//        sum += arr[i];
//    }
//    int n = arr.length;
//    int average = sum/arr.length;
//

//        // 최대값, 최소값
//        int[] arr = {10, 20, 30, 12, 8, 17};
//        int max = arr[0]; // Integer.MIN_VALUE로도 세팅가능 -2147483648
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("최대값은"+max+"입니다");
//
//        int min = arr[0]; // Integer.MAX_VALUE로도 세팅가능 2147483647
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        System.out.println("최소값은"+min+"입니다.");

        // 동적으로 배열의 순서 바꾸기
//        int[] arr = {10, 20};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;

//         int[] arr2 = {10, 20, 30, 40, 50};
//         // 0번째 index부터 마지막 index까지 순차적으로 자리 change
//        // 20, 30, 40, 50, 10으로 결과 반환
//        for (int i = 0; i < arr2.length-1; i++) {
//            int temp = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = temp;
//        }
//        System.out.println(Arrays.toString(arr2));

//        // 배열 뒤집기
//        int[] arr = {1,2,3,4,5};
//        // 새로운 배열에 위 arr을 뒤집은 값 세팅
//        int[] newArr = new int[arr.length];
//        int num = arr.length - 1;
//        for (int i = 0; i < arr.length; i++) {
//            newArr[num-i] = arr[i];
//        }
//        System.out.println(Arrays.toString(newArr));

//         // 내 코드
//        int n = arr.length;
//        int[] arr2 = new int[5];
//        for(int i = n-1; i >= 0; i--){
//            arr[i-n] = arr2[i];
//        }
//        System.out.println(Arrays.toString(arr2));

        // 숫자 뒤집기
        // int num = 1234;
        // 문자열과 관련된 풀이로 풀기
        // 4321이 문자열로 출력되도록
        // 문자열 -> 문자배열로 만들고 -> 문자열로 합해서 문자열로 출력

//        // 내 코드
//        int num = 1234;
//        String num2 = Integer.toString(num);
//        StringBuffer answer = new StringBuffer();
//        for(int i = num2.length()-1; i>=0; i--){
//            answer.append(num2.charAt(i));
//        }
//        System.out.println(answer);

//        // 강사님 코드
//        int num = 1234;
//        String stNum = Integer.toString(num);
//        StringBuilder sb = new StringBuilder();
//        int count = stNum.length()-1;
//        for(int i = 0; i<stNum.length(); i++){
//            sb.append(stNum.charAt(count-i));
//        }
//
//        // 정렬 : 메서드(사전기능구현) -> 선택정렬, 버블정렬
//        int[] arr = {5,1,2,7,3,1,2};
//        Arrays.sort(arr); // 오름차순 정렬이 기본
//        System.out.println(Arrays.toString(arr));

//        // 문자정렬
//        // 아스키코드 기준으로 정렬이 되므로 대문자가 소문자보다 아스키 코드 숫자가 낮다.
//        String[] fruits = {"banana", "apple", "cherry", "Apple"};
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));
//
//        String[] fruits2 = {"apple1", "apple11", "apple2"};
//        Arrays.sort(fruits2);
//
//        // 내림차순
//        String[] st_arr = {"hello", "hi", "bye", "goodmorning"};
//        Arrays.sort(st_arr, Comparator.reverseOrder()); // 오름차순 정렬
//
//        // 기본형 타입은 Comparator로 처리 불가
//        int[] intArr = {5, 1, 2, 7, 3, 1, 2};
//        //Arrays.sort(intArr, Comparator.reverseOrder()); // Comparator : 기본형X, 참조형만 처리가능
//        Arrays.sort(intArr);// 방법1 : 오름차순 정렬 후 배열 뒤집기

//        // 방법2. streamapi, lambda를 활용한 내림차순 정렬
//         int[] answer = Arrays.stream(intArr); //intArr를 대상으로 Stream 객체
//                        .boxed() // int 요소를 Integer로 형변환 시키는 메서드
//                        .sorted(Comparator.reverseOrder())
//                        .mapToInt(a->a) // Integer를 int로 형변환
//                        .toArray(); // 배열로 변환

//        // 선택정렬, 버블정렬
//        // 프로그래머스 : k 번째 수
//        int[] array = {1, 5, 2, 6, 3, 7, 4};
//        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        int[] answer = new int[commands.length];
//        for (int i = 0; i < commands.length; i++) {
//            int start = commands[i][0] - 1;
//            int end = commands[i][1] ;
//            int value = commands[i][2] - 1;
//            int[] temp = new int[end - start + 1];
//            int count = 0;
//            for(int j=start; j<=end; j++){
//                temp[count] = array[j];
//                count ++;
//            }
//            Arrays.sort(temp);
//            answer[i] = temp[value];
//        }

//        // 선택정렬 알고리즘
//        int[] arr = {17, 20, 19, 25, 12};
//        //1번째에 min값 넣어야 함, 17 -> 12 자리 change
//        //2번째에 그 다음의 min값 넣어야 함. 그 이후의 자리들 중 값 비교 후 자리 change
//        // 자리 fix에 대한 1번째 for문
//        // min 값을 찾기 위한 2번째 for문

//        for (int i = 0; i < arr.length - 1; i++) {
//            int min = arr[i];
//            int index = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < min){
//                    min = arr[j];
//                    index = j;
//                }
//                int temp = arr[i]; // 원래 arr[i]값
//                arr[i] = arr[index]; // arr[i]에 최소값 넣고
//                arr[index] = temp; // arr[j]에 arr[i] 값으로 swap
//            }
//            System.out.println(Arrays.toString(arr));
//        }

//        // 두번 째 방법 : 선택정렬
//        int[] arr = {17,12,20,10,25};
//        for(int i=0; i<arr.length-1; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }

//        // 숫자 조합의 합 : 모두 각기 다른 숫자의 배열이 있을 때
//        // 만들어질 수 있는 2개의 조합의 합을 출력
//        int[] intArr = {10, 20, 30, 40, 50, 60};
//        ArrayList<Integer> newArr = new ArrayList<>();
//        for(int i = 0; i < intArr.length - 1; i++){
//            for(int j = i+1; j < intArr.length; j++){
//                newArr.add(intArr[i] + intArr[j]);
//            }
//        }
//        System.out.println(newArr);

//        // 배열의 복사
//        // copyOf(배열, length), copyOfRange(배열, start, end)
//        int[] arr = {10,20,30,40,50};
//        int[] newArr = Arrays.copyOf(arr, 10);
//        System.out.println(Arrays.toString(newArr)); // [10, 20, 30, 40, 50, 0, 0, 0, 0, 0]
//
//        int[] newArr2 = Arrays.copyOfRange(arr, 1, 4); // index 1이상 4미만
//        System.out.println(Arrays.toString(newArr2)); // [20, 30, 40]

//        // 배열의 중복제거
//        int[] temp = {10,10,5,7,40,40,10,10};
//        int[] newTemp = new int[temp.length];
//        int num = 0;
//        // 5, 7, 10, 10, 10, 10, 40, 40 정렬 후 옆자리에 중복값이 있으면 제거
//        // list, set도 쓰지 말고 중복제거
//        // hint : 옆에 숫자와 같은지 비교
//        // 새로운 배열의 길이는 넉넉하게 temp길이로 배정 후 추후 copyofrange
//        Arrays.sort(temp);
//        System.out.println(Arrays.toString(temp));// [5, 7, 10, 10, 10, 10, 40, 40]
//        for(int i=0; i<temp.length; i++){
//            if(i==0 || temp[i] != temp[i-1]){
//                newTemp[num] = temp[i];
//                num++;
//            }
//        }
//        System.out.println(Arrays.toString(newTemp));
//        int[] answer = Arrays.copyOfRange(newTemp, 0, num);
//        System.out.println(Arrays.toString(answer));

//        // 프로그래머스 : 두 개 뽑아서 더하기
//        int[] numbers = {2,1,3,4,1};
//        int[] temp = new int[numbers.length * numbers.length];
//        int count = 0;
//        for(int i = 0; i < numbers.length; i++){
//            for(int j = i+1; i < numbers.length; j++){
//                temp[count] = numbers[i] + numbers[j];
//                count++;
//            }
//        }
//
//        temp = Arrays.copyOf(temp, count);
//        Arrays.sort(temp);
//        System.out.println(Arrays.toString(temp));

//        // 배열의 검색
//        int[] arr = {5, 3, 1, 8, 7};
//        // 8이 위치한 index 찾기
//        int target = 8;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == target){
//                System.out.println((i+1)+"번째에 "+target+"이 위치해있습니다.");
//                break;
//            }
//        }

//        // 이진검색(Binary Search) - 이분탐색
//        // 복잡도 O(logN)
//        int[] arr = {1,3,6,8,9,11,15}; // 전제조건 : 정렬되어있어야 함
//        // 사전에 오름차순 정렬이 되어 있어야 이진검색 가능
//        System.out.println(Arrays.binarySearch(arr, 15)); // 6
//
//        // 배열 간 비교
//        int[] arr1 = {10, 20, 30};
//        int[] arr2 = {10, 20, 30};
//
//        // System.out.println(arr1==arr2); // false : 배열도 객체이기 때문에 각자 서로 다른 힙메모리 주소를 비교함 -> 주소 다르기 때문에 false출력
//
//        // Arrays.equals : 값과 순서까지 동일해야 true
//        System.out.println(Arrays.equals(arr1,arr2));

//        // 2차원배열 선언과 할당
//        int[][] arr = new int[2][3];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;
//
//        // 리터럴 방식으로 할당
//        // {{1,2,3},{4,5,6}}
//        int[][] arr2 = {{1,2,3},{4,5,6}};
//
//        // 2차원 배열의 출력
//        System.out.println(Arrays.deepToString(arr2)); //deepToString : 2차원 배열 String으로 읽을때
//
//        // 2차원 가변배열 선언 후 할당
//        int[][] arr = new int[2][];
//        arr[0] = new int[3];
//        arr[1] = new int[4];
//
//        // 가변배열 리터럴 방식
//        int[][] arr2 = {{10, 20}, {10,20,30}};

//        // [3][4] 사이즈 배열을 선언한 뒤
//        // 1~12까지 숫자값 각 배열에 할당 후 출력
//        // {1,2,3,4}, {5,6,7,8}, {9,10,11,12}
//        int[][] temp = new int[3][4];
//        int num = 1;
//        for (int i=0; i < temp.length; i++){
//            for (int j=0; j < temp[i].length; j++){
//                temp[i][j] = num;
//                num++;
//            }
//        }
//        System.out.println(Arrays.deepToString(temp));

        // 프로그래머스 : 행렬의 덧셈


        // 가변배열 실습 : 행의길이(전체배열의 길이)5 => {{10},{20,20},{30,30,30},{40,40,40,40},{50,50,50,50,50}}
        int[][] test = new int[5][];

        for(int i = 0; i < test.length; i++) {
            test[i] = new int[i+1];
            for(int j = 0; j < test[i].length; j++){
                test[i][j] = (i+1)*10;
            }
        }
        System.out.println(Arrays.deepToString(test));


    }
}
