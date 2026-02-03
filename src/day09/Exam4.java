package day09;

public class Exam4 {
    public static void main(String[] args) {
        // (1) Car 객체 생성
        Car myCar = new Car();
        // myCar.run(); // 오류발생 // "this.tire" is null : 멤버변수(tire)가 null
        myCar.tire = new Tire(); // 멤버변수에 tire 객체 대입
        myCar.run(); // 이제는 null이 아니기 떄문에 : [일반]타이어가 회전

        // (2) 타이어 교체
        myCar.tire = new HanKookTire(); // 멤버변수에 HanKookTire 객체 대입
        myCar.run(); // [한국]타이어가 회전(업그레이드)

        // (2) 타이어 교체
        myCar.tire = new KumhoTire(); // 멤버변수에 KumhoTire 객체 대입
        myCar.run(); // [금호]타이어가 회전(업그레이드)

        // !! : Tire 타입의 멤버변수는 Tire 객체, Htire 객체, Ktire 객체를 모두 대입받을 수 있다.
        // 이유 : 상속관계라서 ,(자동타입변환) 자식타입은 부모타입으로 자동

        System.out.println(myCar.tire instanceof Tire); // true
        System.out.println(myCar.tire instanceof KumhoTire); // true
        System.out.println(myCar.tire instanceof HanKookTire); // false

        // 이유 : KumhoTire 객체가 생성될 때 : KumhoTire , Tire 총 2개 생성
        // 하위타입의 객체를 생성하면 상위타입의 객체도 같이 생성된다.
        // 즉] KumhoTire 객체가 생성될 때 HankookTire 객체는 생성되지 않는다.(형제관계라서)

    }
}

class Car{ // 자동차
    Tire tire;
    void run(){this.tire.roll();}
}

class Tire{ // 타이어
    void roll(){
        System.out.println("[일반]타이어가 회전");
    }
}

class HanKookTire extends Tire{ // 일반타이어로부터 상속받아 한국타이어에서 메소드 재정의
    void roll(){
        System.out.println("[한국]타이어가 회전(업그레이드)");}
}

class KumhoTire extends Tire{ // 일반타이어로부터 상속받아 금호타이어에서 메소드 재정의
    void roll(){
        System.out.println("[금호]타이어가 회전(업그레이드)");}
}