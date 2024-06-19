package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class C0705JsonParsing3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Spring에서는 RestTemplate을 통해 Http 요청하고
        // 여기서는 java에 내장된 http클라이언트 사용:

        // json 데이터를 http 요청을 통해 받아와야 한다.
        // => parsing해서 객체 요청
        // http 클라이언트가 java에 내장
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();

        HttpResponse<String> response =
            client.send(request, HttpResponse.BodyHandlers.ofString());

        String posts = response.body();
        System.out.println(posts);

        // List<Post> 형태로 만들어서 출력
        List<Post> postList = new ArrayList<>();

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(posts);

        for(JsonNode j : jsonNode){
//            postList.add(objectMapper.treeToValue(p, Post.class));
            postList.add(objectMapper.readValue(j.toString(), Post.class));
        }
        System.out.println(postList);

        // 직렬화 : List<Post> 객체를 json으로 직렬화
        String postJson = objectMapper.writeValueAsString(postList);
        System.out.println(postJson);
    }
}
class Post{
    int userId;
    int id;
    String title;
    String body;

    @Override
    public String toString() {
        return "id : " + this.id + " title : " + this.title + "\n";
    }

    Post(){
        // 생성자
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

}

