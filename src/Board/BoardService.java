package Board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {

    private static int authorIdCounter = 1;
    private static int postIdCounter = 1;

    public static void main(String[] args) {
        List<Author> authors = new ArrayList<>(); // 작성자 리스트
        List<Post> posts = new ArrayList<>(); // 게시글 리스트

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("무슨 서비스를 이용하시겠습니까? 1. 회원가입 2. 회원 전체 목록 조회 3. 회원 상세 조회 4. 게시글 작성 5. 게시글 목록 조회 6. 게시글 상세 조회");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    // 회원가입
                    System.out.println("이름을 입력하세요: ");
                    String name = sc.next();
                    System.out.println("이메일을 입력하세요: ");
                    String email = sc.next();
                    System.out.println("비밀번호를 입력하세요: ");
                    String password = sc.next();

                    Author author = new Author(authorIdCounter++, name, email, password);
                    authors.add(author);
                    System.out.println("회원가입이 완료되었습니다.");
                    break;

                case 2:
                    // 회원 전체 목록 조회
                    System.out.println("회원 전체 목록:");
                    for (Author a : authors) {
                        System.out.println("ID: " + a.getId() + ", Email: " + a.getEmail());
                    }
                    break;

                case 3:
                    // 회원 상세 조회
                    System.out.println("조회할 회원의 ID를 입력하세요: ");
                    long id = sc.nextLong();
                    Author foundAuthor = findAuthorById(authors, id);
                    if (foundAuthor != null) {
                        System.out.println("ID: " + foundAuthor.getId() + ", Name: " + foundAuthor.getName() + ", Email: " + foundAuthor.getEmail() + ", Password: " + foundAuthor.getPassword());
                    } else {
                        System.out.println("해당 ID를 가진 회원이 없습니다.");
                    }
                    break;

                case 4:
                    // 게시글 작성
                    System.out.println("제목을 입력하세요: ");
                    String title = sc.next();
                    System.out.println("내용을 입력하세요: ");
                    String contents = sc.next();
                    System.out.println("작성자 이메일을 입력하세요: ");
                    email = sc.next();
                    Author postAuthor = findAuthorByEmail(authors, email);
                    if (postAuthor != null) {
                        Post post = new Post(postIdCounter++, title, contents, postAuthor);
                        posts.add(post);
                        System.out.println("게시글이 작성되었습니다.");
                    } else {
                        System.out.println("해당 이메일을 가진 회원이 없습니다.");
                    }
                    break;

                case 5:
                    // 게시글 목록 조회
                    System.out.println("게시글 목록:");
                    for (Post p : posts) {
                        System.out.println("ID: " + p.getId() + ", Title: " + p.getTitle());
                    }
                    break;

                case 6:
                    // 게시글 상세 조회
                    System.out.println("조회할 게시글 ID를 입력하세요: ");
                    long postId = sc.nextLong();
                    Post foundPost = findPostById(posts, postId);
                    if (foundPost != null) {
                        System.out.println("ID: " + foundPost.getId() + ", Title: " + foundPost.getTitle() + ", Contents: " + foundPost.getContents() + ", Author Email: " + foundPost.getAuthor().getEmail());
                    } else {
                        System.out.println("해당 ID를 가진 게시글이 없습니다.");
                    }
                    break;
            }
        }
    }

    //회원상세조회 by id
    private static Author findAuthorById(List<Author> authors, long id) {
        for (Author author : authors) {
            if (author.getId() == id) {
                return author;
            }
        }
        return null;
    }
    //게시글 작성 시 email로 작성자 find
    private static Author findAuthorByEmail(List<Author> authors, String email) {
        for (Author author : authors) {
            if (author.getEmail().equals(email)) {
                return author;
            }
        }
        return null;
    }
    //게시글 상세조회 by id
    private static Post findPostById(List<Post> posts, long id) {
        for (Post post : posts) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }
}
