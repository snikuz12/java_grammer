package C01Basic;
import java.util.*;

class pr_solution4 {
    public String solution(String[] participant, String[] completion) {
        // 완주하지 못한 선수
        Map<String, Integer> myMap = new HashMap<>(); // 참가자, 완주 명단 put할 map
        Map<String, Integer> answer = new HashMap<>();

        for(String a : participant){
            if(myMap.containsKey(a)){
                myMap.put(a,myMap.get(a)+1); // 이미 있으면 +1 시켜서 put
            }else{
                myMap.put(a,1); // 없으면 put
            }
        }
        for(String a : completion){
            if(myMap.containsKey(a)){
                myMap.put(a,myMap.get(a)+1);  // 이미 있으면 + 1 시켜서 put
            }else{
                myMap.put(a,1);  // 없으면 put
            }
        }

        for(String a : myMap.keySet()){
            if(myMap.get(a)==1){
                answer.put(a,myMap.get(a));
            }
        }

        // String not_completed = myMap.KeySet();
        String not_completed = String.join("", answer.keySet());
        return not_completed;
    }
}