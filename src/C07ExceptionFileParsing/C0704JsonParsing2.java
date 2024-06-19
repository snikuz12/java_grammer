package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class C0704JsonParsing2 {
    public static void main(String[] args) throws IOException {
        // test_data2의 데이터를 student 형태로 출력
        ObjectMapper objectMapper = new ObjectMapper();
        Path filePath = Paths.get("src/C07ExceptionFileParsing/test_data2.json");
        String jsonString = Files.readString(filePath);

        // test_data2의 데이터를 student형태로 출력
        // List<Student>에 담기
        JsonNode jsonList = objectMapper.readTree(jsonString);
        List<Student> studentList = new ArrayList<>();

        for(JsonNode j : jsonList){
            Student tempStudent = objectMapper.readValue(j.toString(), Student.class);
            studentList.add(tempStudent);
            //studentList.add(objectMapper.treeToValue(j, Student.class));
        }
        System.out.println(studentList);
        // [이름은 hong1 classNumber는 1 출신도시는 seoul, 이름은 hong2 classNumber는 2 출신도시는 busan, 이름은 hong3 classNumber는 3 출신도시는 jeju]


//        // readValue : 바로 객체로 변환
//        Map<String, String> studentMap2 = objectMapper.readValue(jsonString, Map.class);
//        System.out.println(studentMap2); // {id=1, name=hong1, classNumber=1, city=seoul}
//
//        // Student 객체 생성 및 toString() 오버라이딩
//        Student student3 = objectMapper.readValue(jsonString, Student.class);
//        System.out.println(student3);



    }
}
