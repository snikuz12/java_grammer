//package C05AnonymousLambda;
//
//import java.util.*;
//
//public class pr_solution6 {
//    public static void main(String[] args) {
//
//    }
//}
//// 프로그래머스 : 가장 큰 수
//// numbers 중에서 첫번째 자리가 가장 큰 수를 제일 맨 앞에 붙이고,, 그다음으로 큰 수를 붙이고 반복,,
//class Solution {
//    public String solution(int[] numbers) {
//        List<String> myList = new ArrayList<>();
//        // numbers를 String으로 형변환 한 후에 List에 삽입
//        // numbers에 있는 String 이어붙였을 때 모든 경우의 수 List에 삽입
//
//        for(int i=0; i<numbers.length; i++) {
//            String myString = String.valueOf(numbers[i]);
//            myList.add(String.valueOf(numbers[i]));
//        }
//        Queue<String> myQueue = new PriorityQueue<>((a,b)-> b.compareTo(a) );
//        String answer = "";
//        return answer;
//    }
//
//}
