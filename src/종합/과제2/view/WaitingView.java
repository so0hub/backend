package 종합.과제2.view;

import 종합.과제2.controller.WaitingController;
import 종합.과제2.model.dto.WaitingDto;

import java.util.ArrayList;
import java.util.Scanner;

public class WaitingView {
    private WaitingView() {
    }

    private static final WaitingView instance = new WaitingView();

    public static WaitingView getInstance() {
        return instance;
    }

    // [*] controller 싱글톤 호출
    private WaitingController wc = WaitingController.getInstance();

    // *) 메인 화면
    public void indexView() {
        for (; ; ) {
            System.out.println("===========맛집 대기 시스템==========");
            System.out.println("1.대기 등록 2.대기 현황");
            System.out.println("=================================");
            System.out.println("선택>");
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();
            if (ch == 1) {
                writeView();
            } // 만약에 1번을 입력하면 쓰기 페이지로 이동
            else if (ch == 2) {
                printView();
            } // 2번 입력하면 전체 조회 페이지로 이동
        }
    }

    // [*] 입력객체는 모든 메소드에서 사용할 예정 이므로 지역변수 말고 메소드 밖에서 선언하자
    private Scanner scan = new Scanner(System.in);

    // 1) 등록 입출력 화면
    public void writeView(){
        System.out.print("전화번호 : ");  String phone = scan.nextLine();
        System.out.print("인원수 : "); int count = scan.nextInt();
        // 1.컨트롤러에게 입력받은 phone , count 전달하여 결과 받아오기
        boolean result = wc.doPost( phone , count );
        // 2. 받은 결과에 따른 화면 출력해주기
        if( result ){ System.out.println("[안내] 대기 등록 완료"); }
        else{ System.out.println("[안내] 대기 등록 실패");  }
    } // m END

    // 2) 전체 조회 입출력 화면
    public void printView(){
        // 1. 컨트롤러에게 모든 게시물 요청하고 결과를 받는다.
        ArrayList<WaitingDto> waitings =  wc.doGet();

        // 2. 받은 결과를 모두 출력한다. // ArrayList는 가변(저장된요소만)길이라서 null 체크를 안 한다.
        for(WaitingDto waiting : waitings){
            System.out.printf("번호 : %d , 연락처 : %s , 인원 : %s \n" , waiting.getNo() , waiting.getPhone() , waiting.getCount() );
        }
    } // m END
} // class END





