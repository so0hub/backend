package 종합.회원제중고거래시스템with교수님.model.dto;

public class ProductDto {
    private int pno;
    private String pname;
    private int pprice;
    private String pcomment;
    private int mno;
    private String mname; // 닉네임 , 조회시 출력할 내용 // + 조회시 필요한 속성
    // * 조회시 필요한 속성
    private String 판매자;

    // 오른쪽 클릭해서 getter setter 추가
    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public ProductDto(){} // 빈생성자

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPprice() {
        return pprice;
    }

    public void setPprice(int pprice) {
        this.pprice = pprice;
    }

    public String getPcomment() {
        return pcomment;
    }

    public void setpcomment(String pcomment) {
        this.pcomment = pcomment;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }


    @Override
    public String toString() {
        return "ProductDto{" +
                "pno=" + pno +
                ", pname='" + pname + '\'' +
                ", pprice=" + pprice +
                ", pcomment='" + pcomment + '\'' +
                ", mno=" + mno +
                ", mname='" + mname + '\'' +
                ", 판매자='" + 판매자 + '\'' +
                '}';
    }

    // 1. 5개짜리 생성자 (Dao의 add 메서드용)
    public ProductDto(int pno, String pname, int pprice, String pcomment, int mno) {
        this.pno = pno;
        this.pname = pname;
        this.pprice = pprice;
        this.pcomment = pcomment; // 필드명 확인!
        this.mno = mno;
    }

    // 2. 6개짜리 생성자 (전체 조회용)
    public ProductDto(int pno, String pname, int pprice, String pcomment, int mno, String 판매자) {
        this.pno = pno;
        this.pname = pname;
        this.pprice = pprice;
        this.pcomment = pcomment;
        this.mno = mno;
        this.판매자 = 판매자;
    }


}
