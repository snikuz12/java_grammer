package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostingService {
    public static void main(String[] args) {
        // 회원 리스트 저장
        List<Author> authorList = new ArrayList<Author>();
        List<Post> postList = new ArrayList<Post>();

        while(true){
            System.out.println("어떤 서비스를 이용하시겠습니까? 번호를 입력해주세요");
            System.out.println("1. 회원가입   2. 회원목록조회   3. 회원상세조회   4. 게시글 작성   5. 게시글 목록조회   6. 게시글 상세조회");
            Scanner sc = new Scanner(System.in); // 스캐너 생성
            int number = Integer.parseInt(sc.nextLine()); // 서비스 번호 입력
            if(number == 1){
                // 1. 회원가입 (이름, 이메일, 패스워드 순으로 입력)
                System.out.println("1. 회원가입");
                System.out.println("회원가입하실 이메일을 입력해주세요");
                String authorEmail = sc.nextLine(); // 이메일 입력

                System.out.println("이름을 입력해주세요");
                String authorName = sc.nextLine(); // 이름 입력

                System.out.println("비밀번호를 입력해주세요");
                Long authorPassword = Long.parseLong(sc.nextLine()); // 비밀번호 입력

                // 회원객체 생성 author
                Author author = new Author(authorEmail, authorName, authorPassword);
                authorList.add(author); // authorList에 생성된 author 객체 추가

                // 생성된 회원의 id 출력 (현재 id가 몇개까지 만들어졌는지 확인)
                System.out.println("회원가입이 완료되었습니다.");
                System.out.println(authorName + " 회원님의 id는 "+Author.static_id+ "입니다.");
            }
            else if(number == 2){
                // 2. 회원전체 목록조회
                // => id, email로 조회
                System.out.println("2. 회원전체 목록조회");
                for(int i = 0; i < authorList.size(); i++){
                    System.out.print("["+authorList.get(i).getId()+"]  "); // 전체회원 id 조회
                    System.out.println(authorList.get(i).getEmail()); // 전체회원 email 조회
                }
            }
            else if(number == 3){
                // 3. 회원상세조회 (by id로 조회)
                // => id, name, email, password 조회
                System.out.println("3. 회원 상세조회");
                System.out.println("조회할 회원의 id를 입력해주세요");
                Long authorId = Long.parseLong(sc.nextLine()); // 조회하고 싶은 회원id
                for(int i = 0; i < authorList.size(); i++){
                    if(authorList.get(i).getId() == authorId){
                        System.out.println("회원 아이디: " +authorList.get(i).getId());
                        System.out.println("회원 이메일: " +authorList.get(i).getEmail());
                        System.out.println("회원 이름: " +authorList.get(i).getName());
                        System.out.println("회원 비밀번호: "+authorList.get(i).getPassword());
                    }
                }
            }
            else if(number == 4){
                // 4. 게시글 작성
                // => id(auto increment), title, contents, email(사용자 이메일을 입력으로 받되 author 객체로 받음)
                System.out.println("4. 게시글 작성");
                System.out.println("회원님의 email을 입력해주세요");
                String authorEmail = sc.nextLine();
                System.out.println("게시글 제목을 입력해주세요");
                String postTitle = sc.nextLine();
                System.out.println("게시글 내용을 입력해주세요");
                String postContents = sc.nextLine();

                Post post = new Post(postTitle,postContents,authorEmail);
                postList.add(post); // postList에 post 객체 추가

                System.out.println("게시글이 추가되었습니다.");
                System.out.println("게시글 id는 "+Post.post_static_id+" 입니다.");

            }
            else if(number == 5){
                // 5. 게시글 목록 조회
                // => id, title
                System.out.println("5. 게시글 목록조회");
                for(int i = 0; i < postList.size(); i++){
                    System.out.print("["+postList.get(i).getPost_id()+"]  "); // 전체게시글 id 조회
                    System.out.println(postList.get(i).getTitle()); // 전체 게시글 제목 조회
                }
            }
            else if(number == 6){
                // 6. 게시글 상세 조회
                // => id, title, contents, 저자(email or name or author_id)
                System.out.println("6. 게시글 상세조회");
                System.out.println("조회하고자 하는 게시글 작성자 email을 입력해주세요");
                String authorEmail = sc.nextLine(); // 조회하고 싶은 게시글작성자 이메일
                for(int i = 0; i < postList.size(); i++){
                    if(postList.get(i).getAuthor_email() == authorEmail){
                        System.out.println("회원 이메일: " +postList.get(i).getAuthor_email());
                        System.out.println("게시글 제목: " +postList.get(i).getTitle());
                        System.out.println("회원 비밀번호: "+postList.get(i).getContent());
                    }
                }
            }
        }

    }
}
// Author 클래스 생성
// =>Author 클래스 : id(auto increment), name, email, password
class Author{
    static Long static_id  = 0L; // auto_increment 되는 id값
    private Long id; // Author의 id값
    private String email;
    private String name;
    private Long password;

    Author(String email, String name, Long password){
        static_id += 1; // author 증가할 때마다 id값 auto_increment
        id = static_id;
        this.email = email; // email이 unique한 요소이므로 email 받아서 사용자 구분
        this.name = name;
        this.password = password;
    }

    public static Long getStatic_id() {
        return static_id;
    }

    public Long getId() {
        return id;
    }

    public Long getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
class Post {
    static Long post_static_id  = 0L; // post 고유id auto_increment
    private Long post_id; // post 고유id
    private String author_email;
    private String title; // 제목
    private String content; // 내용

    Post(String title, String content, String author_email){
        post_static_id += 1;
        post_id = post_static_id;
        this.title = title;
        this.content = content;
        this.author_email = author_email;
    }

    public static Long getPost_static_id() {
        return post_static_id;
    }

    public Long getPost_id() {
        return post_id;
    }

    public String getAuthor_email() {
        return author_email;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}