package day10;

public class Exam2 {
    public static void main(String[] args) {

    // [1] 인터페이스 타입은 객체 생성 불가능하다.
    // new 키보드(); // 인터페이스 타입은 생성자가 없기 때문에.
    // [2] 인터페이스 타입의 변수 선언
        키보드 myKeyBoard; // 변수 생성
        // myKeyBoard.akey(); // 추상메소드는 실행 안 된다.
    // [3] 추상메소드 구현하기 = 클래스에서 오버라이딩
    // [4] 구현(객)체 : 해당 인터페이스 구현한 클래스로 객체 생성
    myKeyBoard = new 격투게임(); // <--키보드에 격투게임 연결
    myKeyBoard.akey(); // [공격]
    myKeyBoard.akey(); // [공격]
    myKeyBoard.bkey(3,2); // [방어]

        System.out.println("=============게임교체===============");
    // [5] 다향성 - 게임교체
    myKeyBoard = new 축구게임(); // <---키보드에 축구게임 연결
    myKeyBoard.akey(); // [슈팅]
    myKeyBoard.akey(); // [슈팅]
    myKeyBoard.bkey(3,2); // [태클]

    // [6] 구현체 없이 자체적으로 구현 == 익명(이름없는) 구현체          ( 이름이 없이 : 클래스 없이 )
    // new 인터페이스명(){ 오버라이딩 };
    myKeyBoard = new 키보드(){
        @Override
        public void akey() {
            System.out.println("[박진감 밥먹이기]");
        }

        @Override
        public int bkey(int x, int y){
            System.out.println("[박진감 엉덩이 뽀뽀하기]");
        return x+y;
        }
    };
    myKeyBoard.akey(); // [박진감 밥먹이기]

    } // main END
} // class END

class 격투게임 implements 키보드{
    // implements 란 ? 해당 인터페이스 내 추상메소드를 구현하는 것.
    @Override
    public void akey(){
        System.out.println("[공격]");}
    @Override
    public int bkey(int x,int y){
        System.out.println("[방어]");
    return x+y;}
}

class 축구게임 implements 키보드{
    // 구현체는 오버라이딩 필수이다.
    @Override public void akey(){
        System.out.println("[슈팅]");}
    @Override public int bkey(int x , int y){
        System.out.println("[태클]");
    return x+y;
    }
}
