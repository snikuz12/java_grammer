package C09NetWorking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;

//webserver3를 만들어서
//Author 테이블 생성 id, name, email, password pk(id)
//사용자가 localhost8081?id=1 요청시 name, email, password 응답
//사용자가 localhost8081?email=hong@naver.com 요청시 name,email,password 응답
public class C0904Webserver3 {
    public static void main(String[] args) throws IOException, SQLException {

        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("8081 webserver 시작");

        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false";
        String userName = "root";
        String password = "1234";

        Connection con = DriverManager.getConnection(url, userName, password); // DriverManager 를 통해 Connection 의 접속 시도
        System.out.println("DB 연결 성공");

        while(true) {

            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                sb.append(line + "\n");
            }
            String requestString = sb.toString();
            // System.out.println(requestString);
            String firstLine = requestString.split("\n")[0];
            // System.out.println(firstLine);
            String infos = firstLine.split(" ")[1];
            // System.out.println(infos);
            String inputId = "";
            if(infos.contains("?")){
                String st1 = infos.split("\\?")[1];
                String[] stArr = st1.split("&");
                for(String st : stArr){
                    String[] keyValue = st.split("=");
                    if(keyValue[0].equals("id")){
                        inputId = keyValue[1];
                    }
                }
            }

            // statement : 쿼리를 담아 db로 쿼리 전달 하는 객체
            Statement st = con.createStatement();
            String myQuery = "SELECT * FROM author where id = '" + inputId + "'";
            ResultSet rs = st.executeQuery(myQuery); // db 조회 결과값 : java 객체로 나오는게 아니라 ResultSet 으로 나옴
            int id = 0;
            String title = "";
            while (rs.next()) {
                id = rs.getInt("id");
                title = rs.getString("title");
                System.out.println("id는 " + id + " title은 " + title);
            }

        }

    }
}
