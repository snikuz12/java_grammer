package C07ExceptionFileParsing.AuthorException;

import java.util.*;

public class AuthorRepository {
    List<Author> authorList;
    AuthorRepository() {
        authorList = new ArrayList<>();
    }
    // author add하거나 조회할 때만 사용
    void register(Author author) {
        // Author 객체 authorList에 add함.
        this.authorList.add(author);
    }

    List<Author> getAuthorList() {
        // List 리턴
        return this.authorList;
    }

//    // 회원가입 시 authorList에 동일한 email이 있는지 확인하는 메서드
//    boolean isExist(String authorEmail){
//        boolean found = this.authorList.stream().anyMatch(a -> a.getEmail().equals(authorEmail));
//        return found;
//    }

//    String findPassword(String authorEmail) {
//        return this.authorList.stream().filter(a -> a.getEmail().equals(authorEmail)).findFirst().get().getPassword();
//    }

}
