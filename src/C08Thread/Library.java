package C08Thread;

public class Library {
    static int bookCount = 100;
//    public static void borrow() {
    // syncronized 키워드를 통해서 해당 메서드에 한해서 lock 걸도록 설정
    public synchronized static void borrow() {
        if(bookCount > 0){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            bookCount -= 1;
            System.out.println("대출완료");
            System.out.println("남아있는 책 수량은 " + bookCount);
        }else{
            System.out.println("대출불가");
        }
    }
}
