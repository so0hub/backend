package 종합.콘솔기반도서관리시스템.model.dto;

public class BookDto {
    private int bno;
    private String bname;
    private String aname;
    private String pname;
    private int mno;



    public BookDto(int bno, String bname, String aname, String pname, int mno) {
        this.bno = bno;
        this.bname = bname;
        this.aname = aname;
        this.pname = pname;
        this.mno = mno;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "bno=" + bno +
                ", bname='" + bname + '\'' +
                ", aname='" + aname + '\'' +
                ", pname='" + pname + '\'' +
                ", mno=" + mno +
                '}';
    }
}
