package C01Basic;
// 프로그래머스 : 특정 문자 제거하기
class pr_solution1 {
    public String solution(String my_string, String letter) {
        String answer = "";
//        for (int i = 0; i < my_string.length(); i++) {
//            if (my_string.charAt(i) != letter.charAt(0)) {
//                answer += my_string.substring(i, i + 1);
//            }
//        }
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.substring(i, i+1).equals(letter)) {
                answer += my_string.substring(i, i+1);
            }
        }

        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.substring(i, i+1).equals(letter)) {
                //answer += my_string.substring(i, i+1);
                continue;
            }
            else{
                answer += my_string.substring(i, i+1);
            }
        }



        return answer;
    }
}