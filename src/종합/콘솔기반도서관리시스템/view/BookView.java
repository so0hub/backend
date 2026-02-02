package 종합.콘솔기반도서관리시스템.view;

import 종합.콘솔기반도서관리시스템.controller.BookController;
import 종합.콘솔기반도서관리시스템.controller.MemberController;

import java.util.Scanner;

public class BookView {
    // BookView 싱글톤 생성
    private BookView(){};
    private static final BookView instance = new BookView();
    public static BookView getInstance(){return instance;}

    // 2. 싱글톤 호출(사용)
    private BookController bc = BookController.getInstance();

    private MemberController mc = MemberController.getInstance();
    private Scanner scan = new Scanner(System.in);
    // [*] 도서 메인페이지
    public void index(){
        for(;;){
            System.out.print("1.도서 등록 2.전체 도서 조회 3.로그아웃 선택>");
            int ch = scan.nextInt();
            if(ch==1){add();}
            else if(ch==2){}
            else if(ch==3){mc.logout(); break;} // 로그아웃 후 반복문 종료
        } // for END
    }

    // [1] 도서 등록 페이지
    public void add(){
        System.out.print("도서명 : "); String bname = scan.next();
        System.out.print("저자명 : "); String aname = scan.next();
        System.out.print("출판사명 : "); String pname = scan.next();
        boolean result = bc.add(bname,aname,pname);
        if(result){
            System.out.println("도서 등록 성공");}
        else{
            System.out.println("도서 등록 실패");
        }
    }
} // class END
