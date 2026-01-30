package 종합.태현소영과제.controller;

import 종합.태현소영과제.model.dao.TradeDao;

public class TradeController {
    // 1. 잠그기
    private TradeController(){}
    // 2. 상수 만들기. 인스턴스.
    private static final TradeController instance = new TradeController();
    // 3. 인스턴스 반환
    public static TradeController getInstance(){
        return instance;
    }

    // [*] dao 싱글톤 호출
    private TradeDao td = TradeDao.getInstance();


    // 1) 등록제어 : view에게 입력받은 id , pw 받아서 dao에게 요청 후 결과를 view에게 전달
    public boolean doLogin(String id , String pw){
        boolean result = td.doLogin(id,pw);
        return result;
    }
}

