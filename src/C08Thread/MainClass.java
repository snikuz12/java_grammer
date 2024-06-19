package C08Thread;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
//        // 스레드 생성방법 2가지
//        // 1. 스레드 상속방식
//        Thread1 t1 = new Thread1();
//        // start 메서드가 상속되어있고, 이 메서드를 통해 run 메서드 실행
//        t1.start();
//        Thread1 t2 = new Thread1();
//        t2.start();

//        // 2. Runnable 구현한 객체를 Thread클래스에 주입한 방식
//        Thread t3 = new Thread(new Thread2());
//        t3.start();
//        new Thread(new Thread2()).start();
//        new Thread(()-> System.out.println("익명Runnable객체 주입 후 Thread")).start();

//        // Thread 동시성 이슈 해결방법 2가지
//        // syncronized, join()

//        // 도서관 100권 : 단일 스레드 (동시성이슈X 동기화O syncronized)
//        for (int i = 0; i < 1000; i++) {
//            Library.borrow();
//        }
//        System.out.println("최종적으로 남은 수량" + Library.bookCount);

        // 멀티 스레드 (동시성이슈X 비동기화 unsyncronized)
        // 10000명이 동시에 들어와서 borrow를 해감
        for (int i = 0; i < 1000; i++) {
            Thread t1 = new Thread(()-> Library.borrow());
            t1.start();

            // 동시성 이슈 해결방법 첫번째 .join() 메서드 사용
            // join() : 다른 스레드의 완료전까지 새로운 스레드가 실행되지 않음
//             t1.join();

        }


        System.out.println("최종적으로 남은 수량" + Library.bookCount);
    }
}
