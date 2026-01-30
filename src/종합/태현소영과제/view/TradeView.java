package 종합.태현소영과제.view;

import 종합.태현소영과제.controller.TradeController;
import 종합.태현소영과제.model.dto.TradeDto;

import java.util.ArrayList;
import java.util.Scanner;

public class TradeView {
    // 싱글톤
    // 1. 잠그기
    private TradeView(){}
    // 2. 상수 , 인스턴스
    private static final TradeView instance = new TradeView();
    // 3. 인스턴스 반환
    public static TradeView getInstance(){
        return instance;
    }

    // [*] controller 싱글톤 호출
    private TradeController tc = TradeController.getInstance();

    private Scanner scan = new Scanner(System.in);

    // 1) 대기 등록 입출력 화면
    public void writeView(){
        System.out.println("아이디 : "); String id = scan.nextLine();
        System.out.println("비밀번호 : "); String pw = scan.nextLine();
        // 1. 컨트롤러에게 입력받은 id , pw 전달하여 결과 받아오기
        boolean result = tc.doLogin(id,pw);


        if(result){System.out.printf("[안내] %s 님, 환영합니다.\n",id);
        }
        else{
            System.out.println("[경고] 안 됐어요.");
        }

    }
}
