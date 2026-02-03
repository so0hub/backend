package 종합.콘솔기반도서관리시스템.model.dao;

import 종합.콘솔기반도서관리시스템.model.dto.BookDto;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;

public class BookDao {
    // BookDao 싱글톤 생성
    private BookDao(){}
    private static final BookDao instance = new BookDao();
    public static BookDao getInstance(){return instance;}

    private ArrayList<BookDto>BookDtos = new ArrayList<>();


    private int currentBno = 1;
    // [1] 도서 등록,loginMno(판매자 회원번호 == 로그인중 회원번호)
    public boolean add(String bname, String aname, String pname,int loginMno){
        BookDto bookDto = new BookDto(currentBno,bname,aname,pname,loginMno); // 1.도서 객체 생성한다.
    boolean result = BookDtos.add(bookDto); // 2. 리스트에 도서 객체 저장
        if(result){currentBno++;} // * 도서 등록 성공시 도서 번호 1증가한다.
        return result; // 3. 성공 여부 반환
    }
}
