package C01Basic;

import java.util.*;

public class C09Mapp {
    public static void main(String[] args) {
//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball", "야구");
//        System.out.println(myMap); // {soccer=축구, basketball=농구, baseball=야구}
//        System.out.println(myMap.get("soccer")); // 축구
//        myMap.put("baseball", "크리켓");
//        // baseball을 map에서 검색하는 복잡도 O(1)
//        System.out.println(myMap.get("baseball")); // 크리켓
//        myMap.remove("baseball");
//        myMap.putIfAbsent("basketball", "배구"); // 만약 비어있으면 put
//        System.out.println(myMap); // {soccer=축구, basketball=농구}
//
//        //getOrDefault : key가 없으면 default값 return
//        System.out.println(myMap.getOrDefault("baseball", "비어있음")); // 비어있음

        //System.out.println(myMap.containsKey("baseball"));

//        String[] arr = {"농구", "농구", "배구", "야구", "배구"};
//
//        // 농구:2, 배구:2, 야구 : 1
//        Map<String, Integer> myMap = new HashMap<>();
//        for(String a:arr){
//            if(myMap.containsKey(a)){
//                myMap.put(a, myMap.get(a)+1); // 이미 있으면 +1 시켜서 put
//            }else{
//                myMap.put(a, 1);
//            }
//            myMap.put(a, myMap.getOrDefault(a, 0) + 1); // 꺼내올 때 없으면 0, 있으면 있는 값 꺼내오기
//        }
//        System.out.println(myMap); // {야구=1, 농구=2, 배구=2}
//
//        // keySet() : 키 목록을 반환
//        // values() : value 목록을 반환
//
//        // enhanced for문을 통해 key값 하나씩 출력할 수 있다.
//        for(String a : myMap.keySet()){
//            System.out.println(a); // key값
//            System.out.println(myMap.get(a)); // value값
//        }
//        // 방법2 .values 사용
//        for (int a : myMap.values()) {
//            System.out.println(a);
//        }
//
//        // iterator를 사용
//        Iterator<String> myIter = myMap.keySet().iterator();
        // next() 메서드는 데이터를 하나씩 소모시키면서 return
//        System.out.println(myIter.next());
//        System.out.println(myIter);

//        // hasNext() : iterator 안에 값이 있는지 없는지 boolean return
//        while (myIter.hasNext()) {
//            System.out.println(myIter.next());
//        }

//        // 프로그래머스 : 완주하지 못한 선수
//        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"eden", "kiki"};
//        Map<String, Integer> partiMap = new HashMap<>();
//        for(String p : participant){
//            partiMap.put(p, partiMap.getOrDefault(p, 0) + 1);
//        }
//        for(String c : completion){
//            if(partiMap.containsKey(c)){
//                if(partiMap.get(c) == 1 ) {
//                    partiMap.remove(c);
//                } else {
//                    partiMap.put(c, partiMap.get(c) - 1);
//                }
//            }
//        }
//        String answer = "";
//        for(String a : partiMap.keySet()){
//            answer = a;
//        }

//        // 의상 : 프로그래머스
//        String[][] clothes =
//                {{"yellow_hat", "headgear"},
//                {"blue_sunglasses", "eyewear"},
//                {"green_turban", "headgear"}};
//        int answer = 0;

//        // LinkedHashMap : 데이터 삽입순서 유지
//        Map<String, Integer> linkedMap = new LinkedHashMap<>(); // 순서유지
//        linkedMap.put("hello5",1);
//        linkedMap.put("hello4",1);
//        linkedMap.put("hello3",1);
//        linkedMap.put("hello2",1);
//        linkedMap.put("hello1",1);
//        System.out.println(linkedMap); // {hello5=1, hello4=1, hello3=1, hello2=1, hello1=1}

//        // TreeMap : key를 통해 데이터를 정렬(최적화 - logN)
//        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("hello5",1);
//        treeMap.put("hello4",1);
//        treeMap.put("hello3",1);
//        treeMap.put("hello2",1);
//        treeMap.put("hello1",1);
//
        // 프로그래머스 : 문자열 내 마음대로 정렬하기
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        Map<String, String> map = new TreeMap<>();
        for (String a : strings) {
            map.put(a.charAt(n)+a, a);
        }
        String[] answer = new String[strings.length];
        int count = 0;
        for (String a : map.values()){
            answer[count] = a;
            count++;
        }


    }
}
