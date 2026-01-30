package 종합.태현소영과제.model.dao;

import 종합.태현소영과제.model.dto.TradeDto;

import java.util.ArrayList; // ALT ENTER

public class TradeDao {
    private TradeDao(){}
    private static final TradeDao instance = new TradeDao();
    public static TradeDao getInstance(){return instance;}
    // [*] 데이터베이스 역할하는 ArrayList <추후 삭제 예정>
    private static int currentNo = 1; // 초기값 1
    // 저장소 생성
    private static final ArrayList<TradeDto> tradeList = new ArrayList<>();

        // 로그인
        // 1) 등록 처리 : controller가 dao에게 id와 pw를 전달하여 등록 요청한다.
        public boolean doLogin(String id , String pw){
        // 2. .contains(찾을값) : 찾을 값이 존재하면 true,없으면 false 반환한다.
        boolean result = tradeList.contains(id);
        System.out.println("result = " + result);

        // 3. 로그인 성공 여부를 controller에게 반환한다.
        return result;
    } // m END
}



