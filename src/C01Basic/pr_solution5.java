package C01Basic;

import java.util.HashMap;
import java.util.Map;

class pr_solution5 {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map <String, Integer> clothesMap = new HashMap<>();
        for(int i = 0; i < clothes.length; i++) {
            if(clothesMap.containsKey(clothes[i][1])) {
                // 2번째 요소가 옷 종류
                clothesMap.put(clothes[i][1], clothesMap.get(clothes[i][1]) + 1);
            }else{
                clothesMap.put(clothes[i][1], 1);
            }
        }

        int n = 0;
        for(String c : clothesMap.keySet()) {
            n = clothesMap.get(c);
            answer *= (n+1);
        }
        return answer -1;
    }
}