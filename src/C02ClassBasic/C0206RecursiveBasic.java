package C02ClassBasic;

public class C0206RecursiveBasic {
    public static void main(String[] args) {
//        // for문으로 1~10까지 누적합계
//        int total = 0;
//        for(int i=0; i<10; i++){
//            total += i;
//        }
//        System.out.println(total);
//        System.out.println(addAcc(10));

        // 피보나치 수열 : 100번째 피보나치 수열
        int first = 1;
        int second = 2;
        for(int i = 2; i<100; i++){
            int temp = first;
            first = second;
            second = temp + first;
        }
        System.out.println(second);
        System.out.println(addAcc(100));

        //System.out.println(fibonacci(100));
    }

    static int fibonacci(int n){
        if(n <= 2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
        // 중복연산이 너무 많으므로 메모이제이션 필요
    }


    static int addAcc(int n){
        if(n==1){
            return 1;
        }
        return n + addAcc(n-1); // 10 + addAcc(9) + ... +
    }
}
