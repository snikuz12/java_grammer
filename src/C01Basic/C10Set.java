package C01Basic;

import java.util.*;

public class C10Set {
    public static void main(String[] args) {
//        Set<String> mySet = new HashSet<String>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        // 순서없고 중복제거 됨.
//        System.out.println(mySet); //[e, h, l, o]

//        // 프로그래머스 : 폰켓몬
//        // 종류 : set을 활용해서 몇가지 종류가 있는지 구하고
//        // 종류의 개수, n/2 중에서 둘 중 작은 값을 골라야 한다.
//        int [] nums = {3,3,3,2,2,4};
//        Set<Integer> mySet = new HashSet<>();
//        for(int n : nums){
//            mySet.add(n);
//        }
//        int answer = 0;
//        if(mySet.size() > nums.length/2){
//            answer = nums.length/2;
//        }else{
//            answer = mySet.size();
//        }
//        System.out.println(answer); // 3

//        List<String> myList = new ArrayList<>();
//        myList.add("tennis");
//        myList.add("baseball");
//        myList.add("baseball");
//        myList.add("baseball");
//        myList.add("basketball");
//        myList.add("basketball");
//
//        // list를 인자값으로 받아서 초기값 세팅 가능
//        Set<String> mySet = new HashSet<>(myList);
//        System.out.println(mySet); // [basketball, baseball, tennis]
//
//        String[] arr = {"baseball", "baseball", "basketball", "basketball"};
//        Set<String> mySet2 = new HashSet<>(Arrays.asList(arr));
//        mySet2.remove("baseball");
//        System.out.println(mySet2); // [basketball]

//        // 프로그래머스 : 전화번호 목록
//        String[] phone_book = {"12","123","1235","567","88"};
//        boolean answer = true;

        // 내코드 - 효율성에서 테스트 실패 뜲
//        for(int i=0; i<phone_book.length-1; i++){
//            for(int j=i+1; j<phone_book.length; j++){
//                if(phone_book[j].startsWith(phone_book[i])){
//                    answer = false;
//                    break;
//                }
//            }
//        }

//         //해시 이용
//        Set<String> mySet3 = new HashSet<>(Arrays.asList(phone_book));
//        boolean answer  = true;
//        for (String s : phone_book){
//            for(int i = 0; i < s.length(); i++){
//                if(mySet3.contains(s.substring(0, i))){
//                    answer = false;
//                    break;
//                }
//            }
//        }
//        // 집합관련 함수 : 교집합(retainAll), 합집합(addAll), 차집합(removeAll)
//        Set<String> set1 = new HashSet<>(Arrays.asList("java","python","javascript"));
//        Set<String> set2 = new HashSet<>(Arrays.asList("java","html","css"));

//        set1.retainAll(set2); // 교집합
//        System.out.println(set1); //[java] (set1 자체가 변경된다.)

//        // set1.retainAll(set2);
//        // set1.addAll(set2);
//        set1.remove(set2);
//        System.out.println(set1); // [python, java, javascript]

//        // 관련문제 : 뉴스 클러스터링
//        // LinkedHashSet, TreeSet
//        Set<String> mySet = new TreeSet<>();
//        mySet.add("hello5");
//        mySet.add("hello5");
//        mySet.add("hello4");
//        mySet.add("hello1");
//        System.out.println(mySet); // [hello1, hello4, hello5] (정렬됨)

        // 두개 뽑아서 더하기 : 배열, 리스트, TreeSet
        int[] numbers = {2,1,3,4,1};
        Set<Integer> mySet = new TreeSet<>();
        for (int i = 0; i < numbers.length-1; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                mySet.add(numbers[i]+numbers[j]);
            }
        }

        int[] answer = new int[mySet.size()];
        int count = 0;
        for(int a : mySet){
            answer[count]  = a;
            count++;
        }

    }
}
