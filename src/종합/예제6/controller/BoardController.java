package 종합.예제6.controller;

import 종합.예제6.model.dao.BoardDao;
import 종합.예제6.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardController {
    private BoardController(){}; // 문 잠그기(생성자 차단) / private가 붙어서 외부에서  new BoardController 못 만들게 막음
    private static final BoardController instance = new BoardController(); // 유일한 인스턴스 생성하기 final이 붙어서 이 매니저는 절대 안 바뀜
    public static BoardController getInstance(){ // 매니저 부르는 벨(Getter) / 외부에서 이 컨트롤러가 필요할 때 BoardController.getInstance()라고 부르면 생성해둔 인스턴스를 빌려줌
        return instance;
    }

    // [*] MVC 패턴 호출의 dao 싱글톤 호출
    private BoardDao bd = BoardDao.getInstance();

    // 다양한 유효성검사 / 자료의 타입 확인 등등
    // 1) 등록 제어 : view에게 입력받은 content,writer 받아서 dao 에게 요청 후 결과를 view에게 전달
    public boolean doPost(String content , String writer){
        boolean result = bd.doPost(content,writer); // 1. DAO에게 content와 writer 전달하고 결과 받기

        return result; // 2. DAO에게 받은 결과를 VIEW에게 전달
    }

    // 2) 전체 조회 처리 : view에게 모든 게시물들을 요청받아 Dao에게 재요청하여 결과를 view에게 전달한다.
    public ArrayList<BoardDto> doGet(){
        return bd.doGet();
    }
}
