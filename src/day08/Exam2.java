package day08;

public class Exam2 {
    public static void main(String[] args) {

        // [1] 싱글톤 : 프로그램내 단 하나의 인스턴스(객체) 갖는 설계 구조

        // [2] 싱글톤 생성

        // [3] 다른 클래스에서 싱글톤 호출, 클래스명.getInstance();
        Controller.getInstance();
        // 보통 객체는 필요할 때마다 new로 계속 만듦. Controller c1 = new Controller(); 이렇게 만든다. 혹은 c1.doSomerthing();
        // 그런데 싱글톤은 new를 못 쓰게 막아둠. 미리 만들어둔 딱 하나를 공유함. 그래서 Controller 클래스한테 유일한 객체인 Instance 좀 빌려달라고 말하는 거임



    } // main END
} // class END

class Controller{
    // 해당 클래스의 싱글톤 패턴 적용하기
    // 1. 생성자를 private 한다.(잠근다) : 다른 클래스에서 new Controller() 못 한다. -> 객체 생성 불가능.
    private Controller(){};

    // 2. 단 하나의 객체 생성하여 상수( static final )에 저장한다. -> 싱글톤 생성
    private static final Controller instance = new Controller();

    // 3. 해당 싱글톤(객체)를 다른 클래스에서 간접 사용(공유) 하도록 getter 만든다.
    // 유일한 통로 만들기! 밖에서 이 객체가 필요하면 "이 메서드를 통해서만 가져가" 라고 길을 열어준 거임
    public static Controller getInstance(){
        return instance; // 2번에서 생성한 싱글톤(객체) 반환한다.
    }
}