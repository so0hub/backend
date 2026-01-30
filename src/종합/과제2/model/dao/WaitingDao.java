package 종합.과제2.model.dao;

import 종합.과제2.model.dto.WaitingDto;
import 종합.예제6.model.dto.BoardDto;

import java.util.ArrayList;

public class WaitingDao {
    private WaitingDao(){}
    private static final WaitingDao instance = new WaitingDao();
    public static WaitingDao getInstance(){
        return instance;
    }
    // [*] 데이터베이스 역할하는 ArrayList < 추후 삭제 예정 >
    private final ArrayList<WaitingDto> waitings = new ArrayList<>();

    // [*] 전역변수 최신 게시물번호 저장 <식별키 생성 목적 : 추후에 삭제 예정>
    private static int currentNo = 1; // 초기값 1

    // 1) 등록 처리 : controller 가 dao에게 phone과 count 전달하여 등록 요청한다.
    public boolean doPost(String phone,int count) {
        // 1. 매개변수에 따른 객체를 만든다. + 대기번호 자동생성
        WaitingDto waitingDto = new WaitingDto(currentNo, phone, count);
        // 2. add(새로운 값) : 추가하면 true 실패하면 false 반환하는 기능/메소드
        boolean result = waitings.add(waitingDto);
        currentNo++; // 다음 저장할 게시물의 번호를 1 증가 한다.
        // 3. 저장 성공 여부를 controller 에게 반환한다.
        return result;
    } // method END

    // 2) 전체 조회 처리 : controller 가 dao에게 모든 게시물들을 요청한다.
    public ArrayList<WaitingDto> doGet(){
        return waitings; // 개별 조회 1개 반환타입 WaitingDto vs 전체 조회 N개 반환타입 ArrayList<WaitingDto>
    }
}








