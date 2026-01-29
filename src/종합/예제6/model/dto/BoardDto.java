package 종합.예제6.model.dto;

public class BoardDto {

    // 1. 멤버변수 = 속성 = 테이블(표) 일치 권장*
    private int no;
    private String content;
    private String writer;

    // 2. 생성자 : 관례적으로 기본생성자 + 풀생성자
    public BoardDto(){}

    public BoardDto(int no, String content, String writer) {
        this.writer = writer;
        this.content = content;
        this.no = no;
    } // 오른쪽 누르고 생성자 하고 shift누르면 다 선택 가능함!!! 까먹 ㄴㄴ



    // 3. 메소드
    public int getNo() {
        return no;}
    public String getContent() {
        return content;}
    public String getWriter() {
        return writer;}

    @Override
    public String toString() {
        return "BoardDto{" +
                "no=" + no +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }




}
