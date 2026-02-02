package 종합.콘솔기반도서관리시스템.model.dao;

import 종합.콘솔기반도서관리시스템.controller.MemberController;
import 종합.콘솔기반도서관리시스템.model.dto.MemberDto;

import java.util.ArrayList;

public class MemberDao {
    // 1) MemberDao 싱글톤 생성
    private MemberDao(){}
    private static final MemberDao instance = new MemberDao();
    public static MemberDao getInstance(){return instance;}

    // [7-2] DAO에 임시데이터베이스를 ArrayList 구성한다.
    private ArrayList<MemberDto> members = new ArrayList<>();


    private int currentMno = 1; // [*] 자동회원번호 부여하기 위한 최신번호
    // [1] 회원가입
    public boolean signup(String mid , String mpw , String mname, String mpn){
        System.out.println("MemberDao.signup"); // soutm
        System.out.println("mid = " + mid + ", mpw = " + mpw + ", mname = " + mname + ", mpn = " + mpn); // soutp

        // 1. 회원 객체[dto]를 생성한다.
        MemberDto memberDto = new MemberDto(currentMno,mid,mpw,mname,mpn);
        // 2. 회원 객체를 리스트에 저장한다.
        boolean result = members.add(memberDto);
        if(result){currentMno++;} // [*] 저장성공시 회원번호 1 증가
        return result; // 3. 저장 성공 여부를 반환한다.
    }

    // [2] 로그인(현재 정보와 기존 정보를 비교하는 작업)
    public int login(String mid , String mpw ) {
        System.out.println("MemberDao.login");
        System.out.println("mid = " + mid + ", mpw = " + mpw);
        for (int index = 0; index <= members.size() - 1; index++) // 1. 리스트(배열) 0부터 마지막 인덱스까지 반복한다.
        {
            MemberDto memberDto = members.get(index); // 2. index번째 회원객체를 꺼낸다.
            // 3. 만약에 index번째 회원객체 내 아이디와 비밀번호가 입력받은 아이디/비밀번호 같다면
            if (memberDto.getMid().equals(mid) && memberDto.getMpw().equals(mpw)) {
                return memberDto.getMno(); // 4. 로그인 성공하면 회원번호 반환
            }
        } // for END
        return 0; // 5. 반복문 중에 동일한 정보가 없다면 로그인 실패 0
    } // method END
} // class END
