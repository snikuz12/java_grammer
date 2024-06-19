package LectureCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0207RecurCombiPermu {
//    static List<Inteer> myList;
//    static List<List<Integer>> answer;
//    static int count;g
    public static void main(String[] args) {

//        myList로 만들수 있는 2개짜리 숫자조합을 이중리스트에 담기
//        [[1,2], [1,3] [1,4], ...]
//        List<Integer> temp = new ArrayList<>();
//        for(int i=0; i<myList.size()-1; i++){
//            temp.add(myList.get(i));
//            for(int j=i+1; j<myList.size(); j++){
//                temp.add(myList.get(j));
//                combinations.add(temp);
//                temp.remove(myList.size()-1);
//            }
//            temp.remove(myList.size()-1);
//        }

        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<List<Integer>> answer = new ArrayList<>();
        combi(answer, new ArrayList<>(), myList, 2, 0);
        System.out.println(answer);
    }
    static void combi(List<List<Integer>> answer, List<Integer> temp, List<Integer> myList, int count, int start){
        if(temp.size() == count){
            answer.add(temp);
            return;
        }
        for(int i=start; i<myList.size(); i++){
            temp.add(myList.get(i));
            combi(answer, temp, myList, count ,i+1);
            temp.remove(temp.size()-1);
        }
    }
}