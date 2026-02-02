package 종합.콘솔기반도서관리시스템.view;

import 종합.콘솔기반도서관리시스템.controller.MemberController;

import java.util.Scanner;

public class MemberView {
    // 1) view 싱글톤 생성
    private MemberView(){}
    private static final MemberView instance = new MemberView();
    public static MemberView getInstance(){return instance;}

    // 2) 싱글톤 호출(사용)
    private MemberController mc = MemberController.getInstance();

    // [8-2] index 메소드 정의한다.
    private Scanner scan = new Scanner(System.in); // 입력객체
    // [*] 메인페이지
    public void index(){
        for(;;){
            System.out.print("1.회원가입 2.로그인 선택>");
            int ch = scan.nextInt();
            if(ch==1){signup();}
            if(ch==2){login();}
        }
    }

    // [1] 회원가입 페이지
    public void signup(){
        System.out.print("아이디 : ");     String mid = scan.next();
        System.out.print("비밀번호 : ");   String mpw = scan.next();
        System.out.print("이름 : ");      String mname = scan.next();
        System.out.print("연락처 : ");     String mpn = scan.next();

        boolean result = mc.signup(mid,mpw,mname,mpn);
        if(result==true){
            System.out.println("회원가입 성공");}
        else{
            System.out.println("회원가입 실패");
        }
    }

    // [2] 로그인 페이지
    private BookView bv = BookView.getInstance();
    public void login(){
        System.out.println("아이디 : ");   String mid = scan.next();
        System.out.println("비밀번호 : ");  String mpw = scan.next();
        boolean result = mc.login(mid,mpw);
        if(result==true){
            System.out.println("로그인 성공");
        bv.index(); // 로그인성공시 도서 index 페이지 실행
        }
        else{
            System.out.println("로그인 실패");
        }
    }

} // class END
