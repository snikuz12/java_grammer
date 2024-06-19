package C07ExceptionFileParsing.AuthorException;
import java.util.*;

// Controller : 입출력, try catch
// Service : 핵심로직, 예외처리
// Repository : list.add

public class Author {
    static Long staticId = 0L; // id (auto_increment)
    private Long id;
    private String name;
    private String email;
    private String password;

    // Author 생성자
    Author(String name, String email, String password) {
        staticId += 1; // author 증가할 때마다 id값 auto_increment
        this.id = staticId;
        this.email = email; // email이 unique한 요소이므로 email 받아서 사용자 구분
        this.name = name;
        this.password = password;
    }

    public static Long getStatic_id() {
        return staticId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}

