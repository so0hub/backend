package 종합.과제2.model.dto;

public class WaitingDto {

    // 1. 멤버변수 = 속성 = 테이블(표) 일치 권장*
    private int no;
    private String phone;
    private int count;

    // 2. 생성자 : 관례적으로 기본 생성자 + 풀생성자
    public WaitingDto(){}
    public WaitingDto(int no,String phone,int count){
        this.no = no;
        this.phone = phone;
        this.count = count;
    }

    // 3. 메소드 : 관례적으로 private 멤버변수에 대해 setter/getter 제공한다.
    public int getNo() {return no;}
    public void setNo(int no) {this.no = no;}

    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}

    public int getCount() {return count;}
    public void setCount(int count) {this.count = count;}

    @Override
    public String toString() {
        return "WaitingDto{" +
                "no=" + no +
                ", phone='" + phone + '\'' +
                ", count=" + count +
                '}';
    }
}



