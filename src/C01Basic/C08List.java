package C01Basic;

import java.util.*;
import java.util.stream.Collectors;

public class C08List {
    public static void main(String[] args) {
        // List 선언방법
//        ArrayList<String> myList1 = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList<>();
//
//        // 가장 일반적인 List 선언방법
//        // 왼쪽엔 인터페이스, 오른쪽엔 구현체(클래스)
//        List<String> myList3 = new ArrayList<>();
//        // 선언만 있고 실제구현은 ArrayList에서 구현하고 있다.
//
//        // 초기값 생성방법 1.
//        myList3.add("java");
//        myList3.add("C++");
//        myList3.add("python");
//
//        // 초기값 생성방법 2. 리스트를 주입하는 방식
//        // Arrays.asList는 배열을 리스트로 변환하는 메서드
//        String[] myArr = {"java", "C++", "python"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(myArr));
//        List<String> myList6 = new ArrayList<>(List.of(myArr));
//
//        int[] intArr = {10,20,30};
//        List<Integer> myList5 = new ArrayList<>();
//        for(int i : intArr){
//            myList5.add(i);
//        }

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        System.out.println(myList); // [10, 20]
//
//        // add(index, 값) : 중간에 값 삽입
//        myList.add(0, 30); // 중간에 값 삽입하면 줄줄이 밀려나가서 성능 떨어짐
//        System.out.println(myList); // [30, 10, 20]
//
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(1);
//        myList2.add(2);
//
//        // 특정 리스트의 요소를 모두 add
//        myList.addAll(myList2);
//        // get : 특정 위치의 요소를 반환
//        System.out.println(myList.get(0)); // 30
//
//        // for문을 돌려 전체 list 출력
//        // size() : 리스트의 길이(개수) 반환
//        for(int i=0; i<myList.size(); i++){
//            System.out.println(myList.get(i));
//        }
//
//        // remove : 요소삭제
//        // 1) index를 통한 삭제 2) value를 통한 삭제
//        System.out.println(myList); // [30, 10, 20, 1, 2]
//        myList.remove(0);
//        System.out.println(myList); // [10, 20, 1, 2]
//        myList.remove(Integer.valueOf(10)); // 중복되면 맨 앞에 것 삭제
//        System.out.println(myList);

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//
//        // set(index, value) : 인덱스 위치의 자리에 value값 setting(변경)
//        myList.set(myList.size() - 1, 10);
//        System.out.println(myList); // [10, 20, 10]
//
//        // indexOf : 특정 값이 몇번 째 index에 위치한지 return
//        // 가장 먼저 나오는 값의 index return
//        System.out.println(myList.indexOf(10)); // 0
//
//        // 전체삭제 : clear()
//        // isEmpty : 값이 비었는지, 안 비었는지
//        List<Integer> list = new ArrayList<>();
//        System.out.println(list.isEmpty());
//        list.add(10);
//
//        // contains : 특정 값이 있는지 없는지 확인
//        System.out.println(list.contains(20)); // false

//        // 이중 리스트 (리스트 안에 리스트)
//        // [[],[]]
//        List<List<Integer>> myList = new ArrayList<>();
//        myList.add(new ArrayList<>());
//        myList.add(new ArrayList<>());
//        myList.get(0).add(10);
//        myList.get(0).add(20);
//        myList.get(1).add(1);
//        myList.get(1).add(2);
//        System.out.println(myList); // [[10, 20], [1, 2]]

//        // 리스트 안에 배열 : 배열사이즈 2,3,4개짜리 배열 3개 들어가는 것으로 add
//        // 2(1,2) 3(10,20,30) 4(100,200,300,400)
//        List<int[]> myList2 = new ArrayList<>();
//        myList2.add(new int[2]);
//        myList2.add(new int[3]);
//        myList2.add(new int[2]);
//        myList2.add(new int[]{1,2});
//        myList2.add(new int[]{10,20,30});
//        System.out.println(myList2);

//        // 리스트 정렬 : Collections.sort(), 리스트 객체.sort()
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(4);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);
//
//        // 정렬1. Collections.sort()
//        Collections.sort(myList); // 오름차순
//        Collections.sort(myList, Comparator.reverseOrder()); // 내림차순
//
//        // 정렬2. 리스트객체.sort()
//        myList.sort(Comparator.naturalOrder()); // 오름차순
//        myList.sort(Comparator.reverseOrder());
//
//        List<String> myList = new ArrayList<>();
//        myList.sort(Comparator.reverseOrder());

//        // 프로그래머스 : n의 배수 고르기
//        int n = 3;
//        int[] numlist = {4,5,6,7,8,9,10,11,12};
//        List<Integer> answerList = new ArrayList<>();
//        for(int i=0; i<numlist.length; i++) {
//            if(numlist[i] % n == 0) {
//                answerList.add(numlist[i]);
//            }
//        }
//        int[] answer = new int[answerList.size()];
//        for(int i=0; i<answer.length; i++) {
//            answer[i] = answerList.get(i);
//        }
//        System.out.println(Arrays.toString(answer));

        // 프로그래머스 : 두 개 뽑아서 더하기
//        List<Integer> answerList = new ArrayList<>();
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (!answerList.contains(numbers[i]+numbers[j])) {
//                    answerList.add(numbers[i] + numbers[j]);
//                }
//            }
//        }
//        Collections.sort(answerList);
//        int[] answer = new int[answerList.size()];
//        for (int j = 0; j < answerList.size(); j++) {
//            answer[j] = answerList.get(j);
//        }

        // 배열과 List간의 변화
        // 1. String 배열을 List<String>로 변환
        String[] stArr = {"java","python","c++"};
        // 1-1 Arrays.asList
        List<String> stList1 = new ArrayList<>(Arrays.asList(stArr));
        // 1-2 for문을 통해 담기
        // 1-3 streamAPi(참고만)
        List<String> stList2 = Arrays.stream(stArr).collect(Collectors.toList());

        // 2. List<String>을 String 배열로 변환
        // 2-1. for문을 통해 담기
        // 2-2 toArray 메서드
        String[] stArr2 = stList1.toArray(new String[stList1.size()]);

        // 3. int배열을 List<Integer>로 변환
        // 3-1. for문을 통해 담기
        // 3-2. streamAPI 사용
        int[] intArr = {10,20,30,40};
        List<Integer> intList = Arrays.stream(intArr).boxed().collect(Collectors.toList());

    }
}
