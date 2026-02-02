package 종합.콘솔기반도서관리시스템.model.dto;

public class MemberDto {
    // [7-1] DTO 구성한다.
    // 1. 멤버변수 = 속성 = 테이블 샘플 참고
    private int mno;
    private String mid;
    private String mpw;
    private String mname;
    private String mpn;

    // 2. 생성자 : 기본 생성자와 전체생성자는 관례적으로 생성.
    public MemberDto(){} // 빈(기본)생성자

    // 전체 생성자 (마우스 우클릭)
    public MemberDto(int mno, String mid, String mpw, String mname, String mpn) {
        this.mno = mno;
        this.mid = mid;
        this.mpw = mpw;
        this.mname = mname;
        this.mpn = mpn;
    }

    // 3. 메소드 : private 멤버변수에 대해 getter and setter 지원


    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMpw() {
        return mpw;
    }

    public void setMpw(String mpw) {
        this.mpw = mpw;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMpn() {
        return mpn;
    }

    public void setMpn(String mpn) {
        this.mpn = mpn;
    }

    // toString
    @Override
    public String toString() {
        return "MemberDto{" +
                "mno=" + mno +
                ", mid='" + mid + '\'' +
                ", mpw='" + mpw + '\'' +
                ", mname='" + mname + '\'' +
                ", mpn='" + mpn + '\'' +
                '}';
    }
}
