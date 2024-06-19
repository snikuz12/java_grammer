//package C01Basic;
//import java.util.*;
//
//// 프로그래머스 : 폰켓몬
//// 중복제거되지 않은 nums 리스트에서 nums.length/2 개 뽑음
//// 뽑은 원소들을 중복제거 -> 중복제거한 리스트 중 길이의 최댓 값 return
//// 1 2 3 4 5 6 7 8 9 10
//class pr_solution6 {
//    public int solution(int[] nums) {
//        Set<Integer> mySet = new HashSet<>();
//        ArrayList<Integer> myList = new ArrayList<>();
//        int answer = 0;
//        for (int i = 0; i<nums.length; i++) {
//            for(int j = i+1; j < nums.length/2; j++){
//                mySet.add(nums[i]);
//
//            }
//        }
//        return answer;
//    }
//}