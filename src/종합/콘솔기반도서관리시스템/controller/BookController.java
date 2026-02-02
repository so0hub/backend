package 종합.콘솔기반도서관리시스템.controller;

import 종합.콘솔기반도서관리시스템.model.dao.BookDao;

public class BookController {
    // 1) BookController 싱글톤 생성
    private BookController(){}
    private static final BookController instance = new BookController();
    public static BookController getInstance(){return instance;}

    // 2) 싱글톤 호출(사용)
    private BookDao bd = BookDao.getInstance();


    // [1] 도서 등록
    public boolean add(String bname,String aname,String pname){
        boolean result = true;
        return result;
    }
}
