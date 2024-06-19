package C07ExceptionFileParsing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.*;
import java.util.List;
import java.nio.file.Paths;

public class C0702FileParsing {
    public static void main(String[] args) throws IOException {
        // 파일의 형식 : text, json
        // json : 문자열로 이루어진 특수한 형식 (key, value)
        // 콘솔에서 읽기
        // IO패키지 사용
//        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
//        String input = br1.readLine(); // 한줄 읽기
//        System.out.println(input);

//        // 파일에서 읽기
//        BufferedReader br2 = new BufferedReader(new FileReader("src/C07ExceptionFileParsing/test_file.txt"));
////        System.out.println(br2.readLine());
//
////        // br2.readLine() == null일 때까지 readLine
//        String line;
//        while( (line = br2.readLine()) != null) {
//            System.out.println(line);
//        }
//
//        // NIO 패키지 사용한 파일처리
//        Path filePath = Path.get("src/C07ExceptionFileParsing/test_file.txt");
//
//        try{
//            // 문자열 통째로 read
//            String st1 = Files.readString(filePath);
//            // 문자열을 각 라인을 잘라 lsit형태로 read
//            List<String> st2 = Files.readAllLines(filePath);
//            for(String s : st2) {
//                System.out.println(s + "선수");
//            }
//        }catch(IOException e){
//            e.printStackTrace();
//        }

        // 파일 쓰기
        // buffer처리안해도 write, read할 때 알아서 buffer처리한다. (NIO 패키지 -> 성능빠름)
        // append(추가), write(덮어쓰기)
        // create_new(파일 생성)
        Path filePath = Paths.get("src/C07ExceptionFileParsing/test_file.txt");
        // 파일이 있으면 append모드로 가고 없으면 create_new모드로 간다.
        if(Files.exists(filePath)) {
            Files.write(filePath, "홍길동\n".getBytes(), StandardOpenOption.APPEND);
        }else{
            Files.write(filePath, "This is a test file".getBytes(), StandardOpenOption.CREATE_NEW);
        }
    }
}
