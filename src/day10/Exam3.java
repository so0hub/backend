package day10;

public class Exam3 {
    public static void main(String[] args) {

        // [1] 구현체
        Buy buy = new Customer(); // Buy 라는 인터페이스 준비해. 실제로 움직일 기계 (= Customer) 새로 만든다.
        buy.method1(); // [판매] : 추상메소드 호출 가능
        // buy.method6(); // 오류 // 다른 인터페이스에 있는 건 불가능. buy,sell 형제끼리는 불가능.

        // [2] 디폴트 메소드 실행 가능
        buy.method2( 2 ); // 디폴트 메소드는 오버라이드가 아니더라도 사용 가능

        // [3] static(정적) 메소드 실행 가능
        Buy.method3(); // 첫 글자 대문자로 // 정적 메소드는 구현체가 없더라도 사용 가능

        // [4] private 메소드 실행 불가능
        // Buy.method4(); // 오류 //
        // Buy.method5(); // 오류 // private는 내부에서만 쓰는 것임
        // Sell sell = buy; // 형제끼리는 변경 불가능
        Customer customer = (Customer) buy; // buy에는 method6이 없고 sell에 있어서 buy에서 sell 메소드 호출(다른 인터페이스의 메소드) 불가능함
        Sell sell = customer; // buy를 customer로 갔다가 customer에서 sell로 이동하면
        sell.method6(); // 가능 // sell에서는 method6을 호출 가능 .태생이 customer라서 가능

    } // main END
} // class END

interface Buy{
    // *) 상수
    // 1) 추상메소드 : 선언부만 존재 , 구현부 { } 없는 메소드 , ** 구현체가 구현할 대상 **
    public abstract void method1();
    // 2) 디폴트메소드 : 인터페이스가 구현한 메소드
    public default int method2( int x ){ return x; };
    // 3) 정적메소드 : 인터페이스 내 정적 구현 메소드
    public static void method3(){
        System.out.println("정적구현메소드"); }
    // 4) private 메소드 : 현재 인터페이스 내에서만 사용하는 메소드 , 오버라이딩 불가능
    private void method4(){ }
    private static void method5(){ }

} // interface END

interface Sell{void method6();} // inter END

class Customer extends Object implements Buy , Sell { // 상속extends은 1개의 클래스 , 구현implements는 여러 개 인터페이스 가능
    // extends 은 오버라이딩 선택 !! , implements 은 오버라이딩(추상메소드) 필수!!!!!
    // 오른쪽 클릭 -> 생성 -> 메소드 재정의  ( 이거 할 때 CTRL 누르고 마우스로 buy랑 sell 선택
    @Override public void method1() {System.out.println("[판매]");}
    @Override public void method6() {System.out.println("[구매]");}
}