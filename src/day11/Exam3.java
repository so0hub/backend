package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam3 {
    public static void main(String[] args) {

        // [JDBC] : 자바 데이터베이스 연동 라이브러리
        // mysql-connector-j-9.6.0.jar 파일 준비한다.
        // 준비된 .jar 파일을 프로젝트 폴더에 넣어준다.
        // .jar 파일 오른쪽 클릭 -> 하단에 [ 라이브러리 추가 ] * 프로젝트마다 1번만 실행.
        // [ 연동1 ] Class.forName("패키지명.JDBC클래스명); * SQL 회사마다 상이하기 때문에 암기 ㄴㄴ * 일반예외 발생
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // 해당 클래스가 존재하면 동적으로 객체를 생성(눈에 안 보임)
        // [ 연동 2 ] DB서버 계정정보
            // String url = "jdbc:mysql://ip주소:port번호/데이터베이스명";
            // String user = "계정명"
            // String password = "계정비밀번호"; // 띄어쓰기 주의
            String url = "jdbc:mysql://localhost:3306/mydb0205";
            String user = "root";
            String password = "1234";

        // [ 연동3 ] 계정정보를 이용해서 연동 인터페이스 구현하기
            // Connection( I )  : 인터페이스! java.sql 이걸로 선택
            // DriverManager.getConnection( C ) : 클래스! 구현(객)체
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("================연동 성공===============");

        // [ 연동 이후 DML ( select insert update delete ) 실행하기 ]
            String sql = "insert into buy values(NULL,'BLK','지갑',NULL,30,2)"; // 실행할 sql 문법을 문자열로 작성한다.
            // CTRL  + ENTER 대신에 실행 메소드 사용
            PreparedStatement ps = conn.prepareStatement(sql); // SQL 기재
            int count = ps.executeUpdate(); // 기재된 sql 실행 후 반영된 레코드 수 반환
            System.out.println("등록된 레코드는 : "+ count + "개 입니다.");


            }catch (ClassNotFoundException e){
            System.out.println("JDBC 클래스 호출 실패"); // 드라이버 클래스 연동 실패
            }catch ( SQLException e ){
             System.out.println("등록된 DB 서버로 실제 연동 실패"+ e);
            }

    } // main END
} // class END
