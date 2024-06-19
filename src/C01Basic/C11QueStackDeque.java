package C01Basic;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueStackDeque {
    public static void main(String[] args) {
//        //Queue -> Deque -> LinkedList
//        Queue<Integer> myQue = new LinkedList<Integer>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        System.out.println(myQue.peek()); //10
//        System.out.println(myQue);//[10, 20, 30]
//        System.out.println(myQue.poll()); //10 (아예 꺼내고 return)
//        System.out.println(myQue); // [20, 30]

//        // LinkedList와 ArrayList 비교
//        // LinkedList의 add
//        LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis(); // 밀리초 까지 숫자값으로 변환
//        for(int i = 0; i < 10000; i++){
//            list1.add(0,10);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("linkedList의 중간삽입 : " +(endTime - startTime)); //277
//

//        // ArrayList의 add
//        ArrayList<Integer> list2 = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis(); // 밀리초 까지 숫자값으로 변환
//        for(int i = 0; i < 10000; i++){
//            list2.add(0,10);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("ArrayList의 중간삽입 : " +(endTime2 - startTime2)); // 261047

//        // LinkedList와 ArrayList 비교
//        // LinkedList의 조회
//
//        long startTime3 = System.currentTimeMillis(); // 밀리초 까지 숫자값으로 변환
//        for(int i = 0; i < 10000; i++){
//            list1.get(i);
//        }
//        long endTime3 = System.currentTimeMillis();
//        System.out.println("linkedList의 조회 : " +(endTime3 - startTime3));
//
//        // ArrayList의 add
//        long startTime4 = System.currentTimeMillis(); // 밀리초 까지 숫자값으로 변환
//        for(int i = 0; i < 10000; i++){
//            list2.get(i);
//        }
//        long endTime4 = System.currentTimeMillis();
//        System.out.println("ArrayList의 조회 : " +(endTime4 - startTime4));
//
//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        while (!myQue.isEmpty()) {
//            System.out.println(myQue.poll());
//        }
        // ArrayBlockQueue : 길이제한 있는 큐
//        Queue<String> queue = new ArrayBlockingQueue<>(3);
//        // add를 사용하면 길이제한 초과시 예외 발생
//        queue.add("10");
//        queue.add("20");
//        queue.add("30");
//        queue.add("40");
//        System.out.println(queue);

//        queue.offer("10");
//        queue.offer("20");
//        queue.offer("30");
//        queue.offer("40");
//        System.out.println(queue);
//
//        // 우선순위 큐 : 데이터를 꺼낼 때 정렬된 데이터 pop
//        Queue<Integer> pq = new PriorityQueue<>(); // () : comparator 자리, 기본 오름차순
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        // poll할 때 정렬됨
//        // pq는 전체 정렬이 아니다.
//        // 요소를 꺼내는 시점에 가장 작은 값을 꺼내오는 것 (최소값 찾아오기 : logN)
//        // poll을 N번 하면 -> NlogN
//        System.out.println(pq);
//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll()); //O(NlogN)
//        }
        // pq하나 poll할 때마다 O(logN)
        // 프로그래머스 : 더 맵게
        // 특정 숫자들을 꺼내서 재조립해서 다시 집어놓고, 그 다음 가장 작은 값을 꺼내고..
        // array.sort하면 성능저하가 너무 심함
        // pq를 사용하면 데이터가 계속 변하는 상황에서 성능의 저하를 막을 수 있음
        // 마지막 1개 남으면 2번 poll하면 에러나니까 마지막 값 check(peek 이용)
//        int[] scoville = {1, 2, 3, 9, 10, 12};
//        int k = 7;
        // int temp1 = pq.poll;, int temp2 = pq.poll;, int newTemp = xxx, pa.add(newTemp)

//        // stack
//        Stack<Integer> st1 = new Stack<>();
//        st1.push(10);
//        st1.push(20);
//        st1.push(30);
//
//        // pop : 스택에서 요소제거 후 해당 요소 반환
//        System.out.println(st1.pop());
//
//        // peek : 스택 최상단 요소 확인
//        System.out.println(st1.peek()); //20
//
//        // size()
//        System.out.println(st1.size());
//
//        // isEmpty()
//        System.out.println(st1.isEmpty());

//        // String 객체 5개 정도 Stack에 추가 후에 while문을 통해 출력
//        Stack<String> st2 = new Stack<>();
//        st2.push("Hello");
//        st2.push("World");
//        st2.push("Java");
//        st2.push("Python");
//        st2.push("JavaScript");
//        while(!st2.isEmpty()) {
//            System.out.println(st2.pop());
//        }

//        // 프로그래머스 : 같은 숫자는 싫어
//        int []arr = {1,1,3,3,0,1,1};
//        // 스택사용 (강사님 코드)
//        Stack<Integer> stack = new Stack<>();
//        for(int a :arr){
//            if(stack.isEmpty()){
//                stack.push(a);
//            }else{
//                if(stack.peek() != a){
//                    stack.push(a); // 최상단의 값이 a와 다르면 push
//                }
//            }
//            int[] answer = new int[stack.size()];
//            for(int i = answer.length;i > 0;i--){
//                answer[i-1] = stack.pop();
//            }
//            System.out.println(answer);
//        }
//
//        // 리스트 사용
//        List<Integer> myList = new ArrayList<>();
//        for(int i=0; i<arr.length; i++){
//            if(i==0 || arr[i-1] != arr[i]){
//                myList.add(arr[i]);
//            }
//        }
//        System.out.println(myList);

        // 내 코드
//        Stack<Integer> st = new Stack<>();
//        ArrayList<Integer> answer = new ArrayList<>();
//        for(int i : arr){
//            if(st.isEmpty()){
//                st.push(i);
//            }else{
//                if(st.peek() != i){
//                    st.push(i);
//                }
//            }
//
//        }
//        while(!st.isEmpty()){
//            for(int i = st.peek(); i > 0; i--){
//                answer.add(st.pop());
//            }
//        }
//
//        System.out.println(answer);

        // 올바른 괄호
        // 스택, Deque
        String s = ")()("; // false
        boolean answer = true;
        // 문자열을 스택에 모두 넣고 empty할 때까지 pop하기 시작한다.
        // pop했을 때 ( 열린괄호가 나오면 answer = false
        // pop했을 때 ) 닫힌괄호가 나오면 answer = true로 변경한다.
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            st.push(s.charAt(i));
        }

        while(!st.isEmpty()){
            if(st.pop().equals('(')){
                answer = false;
            }
            else if(st.pop().equals(')')){
                answer = true;
            }
        }
        System.out.println(answer);

//        // Deque
//        Deque<Integer> d1 = new ArrayDeque<>();
//        d1.addLast(10);
//        d1.addLast(20);
//        System.out.println(d1); // [10, 20]
//        d1.addFirst(30);
//        System.out.println(d1); // [30, 10, 20]
//
//        System.out.println(d1.peekFirst()); // 30
//        System.out.println(d1.peekLast()); // 20
//        System.out.println(d1.pollFirst()); //poll 30
//        System.out.println(d1.pollLast()); //pop 20

        // 관련문제 : 다리를 지나는 트럭


    }
}
