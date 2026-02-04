package day10;

public interface TestInterface {
    // int a;// * 멤버변수 불가능
    public static final int b = 10; // * 상수 가능
    // * 생성자 불가능
    // * 추상메소드 : 메소드 선언부만 존재하고 , { } 구현부는 없다.
    public abstract void method1();
    void method2(int x); // 매개변수 있는 걸로 생성 / public abstract 생략 가능
}
