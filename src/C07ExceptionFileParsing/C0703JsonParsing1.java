package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class C0703JsonParsing1 {
    public static void main(String[] args) throws IOException {
        // json 파일을 read -> NIO / IO 패키지 사용해서 -> 문자열형태로 read -> 역직렬화
        // 직렬화() : 자바객체 -> JSON
        // 역직렬화(parsing) : JSON -> 자바객체
        // objectMapper : json 파싱을 위한 라이브러리 사용
        ObjectMapper objectMapper = new ObjectMapper();
        Path filePath = Paths.get("src/C07ExceptionFileParsing/test_data1.json");
        String jsonString = Files.readString(filePath);
//        System.out.println(jsonString); // 문자열 형태(객체X)
//        {
//            "id" : 1,
//                "name" : "hong1",
//                "classNumber" : "1",
//                "city" : "seoul"
//        }

        // readTree : 트리구조의 JsonNode로 변환
        // 트리구조의 장점은 유연함.
        JsonNode data1 = objectMapper.readTree(jsonString);
        Map<String, String> studentMap = new HashMap<>();

        studentMap.put("id", data1.get("id").asText());
        studentMap.put("name", data1.get("name").asText());
        studentMap.put("classNumber", data1.get("classNumber").asText());
        studentMap.put("city", data1.get("city").asText());
        System.out.println(studentMap); // {city=seoul, name=hong1, id=1, classNumber=1}

        // readValue : 바로 객체로 변환
        Map<String, String> studentMap2 = objectMapper.readValue(jsonString, Map.class);
        System.out.println(studentMap2); // {id=1, name=hong1, classNumber=1, city=seoul}

        // Student 객체 생성 및 toString() 오버라이딩
        Student student3 = objectMapper.readValue(jsonString, Student.class);
        System.out.println(student3); // 이름은 hong1 classNumber는 1 출신도시는 seoul

    }
}
class Student{
    private int id;
    private String name;
    private String classNumber;
    private String city;

    Student(){

    }

    @Override
    public String toString() {
        return "이름은 " + this.name + " classNumber는 " + this.classNumber + " 출신도시는 " + this.city;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getClassNumber() {
        return classNumber;
    }
}
