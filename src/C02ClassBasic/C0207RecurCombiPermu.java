package C02ClassBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0207RecurCombiPermu {
    static List<Integer> myList;
    static List<List<Integer>> answer;
    static int count;
    public static void main(String[] args) {
        // dfs알고리즘 적용됨
        //List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));

        myList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        answer = new ArrayList<>();
        count = 5;

        // 방법1
//        // myList로 만들 수 있는 2개짜리 숫자조합을 이중리스트에 담기
//        List<List<Integer>> combinations = new ArrayList<>();

//        for (int i = 0; i < myList.size()-1; i++) {
//            for(int j = i+1; j < myList.size(); j++) {
//                List<Integer> temp = new ArrayList<>();
//                temp.add(myList.get(i));
//                temp.add(myList.get(j));
//                combinations.add(temp);
//            }
//        }
//        System.out.println(combinations);

//        // 방법2.
//        // myList로 만들 수 있는 2개짜리 숫자조합을 이중리스트에 담기
//        List<List<Integer>> combinations = new ArrayList<>();
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
//        System.out.println(combinations);

        List<List<Integer>> answer = new ArrayList<>();
       // combinations(answer, new ArrayList<>(), myList, 2,0);
        permu(answer, new ArrayList<>(), myList, 2,new boolean[myList.size()]);
        System.out.println(answer);
    }
    // [[1,2],[1,3],[1,4],[1,5]...] : count = 2
    // [[1,2,3],[1,2,4],[1,2,5]...] : count = 3
    static void combinations(List<Integer>temp ,int start){
        if(temp.size() == count){ // count : answer[i]에 들어가는 2번째 리스트 크기
//            temp값을 그대로 add할 경우 temp 메모리 값이 add 되므로, 모든 answer리스트에 같은 temp리스트 add
//            answer.add(temp); 하면 새로운 temp에 add되는게 아니라 같은 temp에 계속 누적됨.
            answer.add(new ArrayList<>(temp)); // 계속 새로운 temp에 담기는 리스트를 add해줘야 됨.
            return;
        }

        for(int i = start; i < myList.size(); i++){
            temp.add(myList.get(i));
            combinations(temp, i + 1);
            temp.remove(temp.size()-1);
        }
    }

    static void permu(List<List<Integer>> answer ,List<Integer>temp, List<Integer> myList, int count, boolean[] visited){
        if(temp.size() == count){
            answer.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0; i<myList.size(); i++){
            if(visited[i] == false){
                visited[i] = true;
                temp.add(myList.get(i));
                permu(answer, temp, myList, count, visited);
                temp.remove(temp.size()-1);
                visited[i] = false;
            }
        }
    }
}
