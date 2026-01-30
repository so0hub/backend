package 종합.회원제중고거래시스템with교수님.model.dao;

import day07.package1.A;
import 종합.회원제중고거래시스템with교수님.controller.MemberController;
import 종합.회원제중고거래시스템with교수님.model.dto.MemberDto;

import java.util.ArrayList;

public class MemberDao {
    private MemberDao(){}
    private static final MemberDao instance = new MemberDao();
    public static MemberDao getInstance(){return instance;}

    private ArrayList<MemberDto> members = new ArrayList<>();


    // [*] 자동회원번호 부여하기 위한 최신 회원번호
    private int currentMno = 1;
    // [1] 회원가입
    public boolean signup(String mid , String mpw , String mname, String mphone){

        // 1. 객체[DTO] 생성한다.
        MemberDto memberDto = new MemberDto(currentMno,mid,mpw,mname,mphone);

        // 2. 회원객체를 리스트에 저장한다.
        boolean result = members.add(memberDto);

        // [*] 성공시 회원번호 1증가
        if(result){currentMno++;}

        // 3. 저장성공여부를 반환한다.
        return result;
    }


    // [2] 로그인( 현재 정보와 기존 정보를 비교 하는 작업 )
    public int login( String mid , String mpw ){
        System.out.println("MemberDao.login");
        System.out.println("mid = " + mid + ", mpw = " + mpw);
        for( int index = 0 ; index <= members.size()-1 ; index++ ) {// 1. 리스트(배열) 0부터 마지막 인덱스까지 반복한다.
            MemberDto memberDto = members.get( index ); // 2. index번째 회원객체를 꺼낸다.
            // 3. 만약에 index번째 회원객체내 아이디 와 비밀번호가 입력받은 아이디/비밀번호 같다면
            if( memberDto.getMid().equals( mid ) && memberDto.getMpw().equals( mpw ) ){
                return memberDto.getMno(); // 4. 로그인 성공하면 회원번호 반환
            }
        } // for end
        return 0; // 5. 반복문 중에 동일항 정보가 없다면 로그인 실패 0
    } // m end

    // [3] 회원번호로 닉네임 조회하기
    public String findMname(int mno){
        for(int index=0 ; index <= members.size()-1; index++){
            if(members.get(index).getMno()==mno){
                // 만약에 index번째 회원번호가 조회한 회원번호 같다면
                return members.get(index).getMname(); // 찾은 회원번호 반환
            }
        }
        return null; // 없으면 null 반환
    }
}
