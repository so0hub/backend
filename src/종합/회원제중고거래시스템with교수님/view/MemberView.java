package 종합.회원제중고거래시스템with교수님.view;

import 종합.회원제중고거래시스템with교수님.controller.MemberController;

import java.util.Scanner;

public class MemberView {
    private MemberView(){}
    private static final MemberView instance = new MemberView();
    public static MemberView getInstance(){return instance;}

    private MemberController mc = MemberController.getInstance();
    private ProductView pv = ProductView.getInstance();


    private Scanner scan = new Scanner(System.in); // 입력 객체

    //[ *] 메인페이지
    // index 메소드 정의한다.
    public void index(){

        for(;;){
            System.out.print("1.회원가입 2.로그인 선택>");
            int ch = scan.nextInt();
            if(ch==1){signup();}
            else if(ch==2){login();}
        }
    }
    // [1] 회원가입 페이지
    public void signup(){
        System.out.print("아이디:");   String mid = scan.next();
        System.out.print("비밀번호:");  String mpw =  scan.next();
        System.out.print("닉네임:");   String mname = scan.next();
        System.out.print("연락처:");   String mphone = scan.next();

        boolean result = mc.signup(mid,mpw,mname,mphone);
        // boolean result = true; // 위에 지우고 임시로 이렇게 true값 넣어서 테스트해보기
        if(result==true){
            System.out.println("회원가입 성공");
        }else {
            System.out.println("회원가입 실패");
        }
    }

    // [2] 로그인 페이지
    public void login(){
        System.out.print("아이디:");   String mid = scan.next();
        System.out.print("비밀번호:");  String mpw =  scan.next();
        boolean result = true;
        if(result==true){
            System.out.println("로그인 성공");
            pv.index(); // 로그인 성공시 제품 index 페이지 실행
        }
            else{
                System.out.println("로그인 실패");
            }
        }
    }

