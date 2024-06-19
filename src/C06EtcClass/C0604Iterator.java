package C06EtcClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C0604Iterator {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("orange");
        myList.add("banana");

//        // enhance for 문 : 원본변경불가
//        for (String s : myList) {
//            System.out.println(s);
//        }
        // iterator는 참조하고 있는 원본데이터 삭제 가능 -> remove
        Iterator<String> iters1 = myList.iterator();
        while (iters1.hasNext()) {
            System.out.println(iters1.next()); // iterator를 소모하면서 꺼낸다.
        }
        // iters1가 소모되었으므로 다시 iterator를 선언해서(iters2) 사용
        Iterator<String> iters2 = myList.iterator();
        while (iters2.hasNext()) {
            if (iters2.next().equals("orange")) {
                iters2.remove();
            }
        }
        System.out.println(myList);
    }
}
