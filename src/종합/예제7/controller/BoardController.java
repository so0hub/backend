package 종합.예제7.controller;

import day07.package1.B;
import 종합.예제6.model.dao.BoardDao;

public class BoardController {
    // 싱글톤 생성
    private BoardController(){} // 생성자  private
    private static final BoardController instance = new BoardController(); // 현재 객체를 new해서 instance 하나만듦 글구 private로 막음
    public static BoardController getInstance(){ return instance; } // public으로 해서 행당하는 instance를 반환함

    private BoardDao bd = BoardDao.getInstance();
}
