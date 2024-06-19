package C01Basic;

class pr_solution2 {
    public String solution(String s) {
        // 가운데 글자 가져오기 (substring 이용)
        // 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
        // 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
        String answer = "";
        int len = s.length();
        if (len % 2 != 0) {
            answer = s.substring(len / 2, len / 2 + 1);
        }else{
            answer = s.substring(len / 2 - 1,len/2 + 1);
        }
        return answer;
    }
}