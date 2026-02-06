package 종합.예제7.model.dao;

import 종합.예제7.controller.BoardController;

import java.sql.Connection;
import java.sql.DriverManager;

public class BoardDao {
    // 싱글톤 생성
    private BoardDao(){connect();} // 생성자  private / dao 생성자에서 연동 함수 실행
    private static final BoardDao instance = new BoardDao(); // 현재 객체를 new해서 instance 하나만듦 글구 private로 막음

    public BoardDao getInstance(){ return instance; } // public으로 해서 행당하는 instance를 반환함


    // ================ 데이터베이스 연동 =============== //
        // 1) 연동할 db서버의 정보
    private String url = "jdbc:mysql://localhost:3306/boardservice7";
    private String user = "root";
    private String password = "1234";

        // 2) 연동 인터페이스 변수 선언
    private Connection conn;
        // 3) 연동 함수 정의 , dao 생성자에서 실행 ( dao 싱글톤이 생성되면서 db 연동 실행 )
    private void connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // mysql 라이브러리 객체 메모리 할당/불러오기
            conn = DriverManager.getConnection( url , user , password ); // mysql 구현체로 db연동 후 연동 인터페이스에 반환
            System.out.println("[시스템 준비] 데이터베이스 연동을 성공하였습니다.");
        }catch ( Exception e ){
            System.out.println("[시스템 경고] DB 연동 실패 : 관리자에게 문의하십시오.");}
        }
} // class END
