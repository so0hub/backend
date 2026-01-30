package 종합.과제2.controller;

import 종합.과제2.model.dao.WaitingDao;
import 종합.과제2.model.dto.WaitingDto;
import 종합.예제6.model.dto.BoardDto;

import java.util.ArrayList;

public class WaitingController {
    public WaitingController(){};
    private static final WaitingController instance = new WaitingController();
    public static WaitingController getInstance(){
        return instance;
    }
    // [*] dao 싱글톤 호출
    private WaitingDao wd = WaitingDao.getInstance();

    // 다양한 유효성검사 / 자료의 타입 확인 등등
    // 1) 등록 제어 : view에게 입력받은 content,writer 받아서 dao 에게 요청 후 결과를 view에게 전달
    public boolean doPost(String phone , int counter){
        boolean result = wd.doPost(phone,counter); // 1. DAO에게 phone과 counter 전달하고 결과 받기

        return result; // 2. DAO에게 받은 결과를 VIEW에게 전달
    }

    // 2) 전체 조회 처리 : view에게 모든 게시물들을 요청받아 Dao에게 재요청하여 결과를 view에게 전달한다.
    public ArrayList<WaitingDto> doGet(){
        return wd.doGet();
    }
}




