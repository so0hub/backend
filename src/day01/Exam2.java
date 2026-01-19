package day01; // 패키지(폴더)로써 클래스가 위치한 폴더명


public class Exam2 { // class S
    // public class : 공개용 클래스를 선언. 한다는 뜻을 갖는 키워드
    // Exam2 : 임의의 클래스명을 정의한다. 첫 글자 대문자!
    // [1] m + 엔터 : main 함수
    // 자바에서 최초로 실행 흐름(스레드)을 갖는 (미리 만들어진)함수
    public static void main(String[] args) { // main S

    // [2] 리터럴 : 상수 이면서 키보드로 입력가능한 자료들
    // ex : 3, 3.14, 'a' , true , false
        System.out.println(3); // JS의 console.log() 과 동일한 기능
        System.out.println(3.14); // sout + 엔터 : System.out.println(출력하고 싶은 자료);
        System.out.println("박진감"); // 선언 또는 함수실행 뒤에 ; 세미콜론 작성한다.
        System.out.println("박진감엉덩이"); // 문자열 처리할 때는 "" 큰 따옴표 사용

    // [3] 자료형/타입(분류) : 자료들을 효율적으로 사용하기 위한 분류 방법
    // 바이트란? bit(0 혹은 1)---> 01010101(8bit/bit 8개) 1바이트 -> 1024byte
    // 효율이란? 내가 시계를 선물하기 위해서 다이소에서 시계 크기에 맞는 적당(효율)한 상자를 고른다.   ☆저는 잘 몰라요? int랑 double 쓰면 됨.
    // 정수 : byte( 1 , -128 ~ 127 ) , short( 2 , +-3만 정도 ) ,
    //       int( 4 , +-21억 정도 ★정수기본타입★ ) , long( 8 , +-21억 이상 )
    // 실수 : float( 4 , 소수점8자리 ) , double( 8 , 소수점17자리 표현 ★실수기본타입★ )
    // 문자 : char( 2 , '' 작은 따옴표로 감싼다. ) , 문자열 : String( 문자열클래스 , "" 큰 따옴표로 감싼다. )
    // 논리 : boolean( 1 , true/false )

    // ================================================================================> 8가지+String

    // 1. boolean : true 또는 false 저장하는 타입
    boolean bool1 = true; // [JAVA] 자료형 변수명 = 값; [JS] let bool1 = true;)
    boolean bool2 = false; // 변수명은 카멜표기법 권장, 숫자시작./일부특수/띄어쓰기 안 됨
    // boolean bool1 = 3 ; // [오류] boolean은 3 저장할 수 없다.
        System.out.println(bool1);
        System.out.println(bool2);

    // 2. char : '' 작은 따옴표로 감싼 문자 1개 저장하는 타입
        char ch1 = 'A';
        //char ch2 = 'ABC'; // [오류] 문자 여러개 불가능
        //char ch3 = "ABC"; // [오류] 큰 따옴표 불가능
        System.out.println(ch1);

    // 3. String : " " 큰 따옴표로 감싼 문자 여러개 저장하는 (클래스)타입
    String str1 = "ABC";
        System.out.println(str1);

    // 4. byte : -128 ~ +127
        byte b1 = 100;
        //byte b2 = 300; // [오류]
        System.out.println(b1);

    // 5. short : +- 3만 정도
        short s1 = 32000;
        //short s2 = 40000; // [오류]
        System.out.println(s1);

    // 6. int : +- 21억 정도 , 정수의 리터럴 기본타입, 즉] 키보드로부터 입력받은 값들은 int 타입이다.
        int i1 = 2100000000; // 21억 가능
        System.out.println(i1);
        //int i2 = 30000000000; // [오류] 30억 불가능

    // 7. long : +- 21억 이상 , 리터럴 뒤에 L/l 붙인다.
        long l1 = 300000000000l; // 300000000000 리터럴값은 INT라서 뒤에 l을 붙여 리터럴을 long으로 바꾸는 것.
        System.out.println(l1);

    // 8. double : 소수점 포함한 17자리까지 표현 , 그 이상으로 가면 오차 발생할 수 있다. , 실수의 리터럴 기본타입
        double d1 = 0.123456789123456789;
        System.out.println(d1);

    // 9. float : 소수점 포함한 8자리까지 표현 , 리터럴 뒤에 대문자 F/f 붙인다.
        float f1 = 0.123456789123456789F;
        System.out.println(f1);
        // + 소수점 오차가 발생하거나 표현 한계로 실무에서 사용 제약 : 그래서 String ,BingDecimal 등 사용한다.


    } // main E
} // class E

/*
----------------코드 작성--------------         -------------코드 (처리)실행----------------
JS : console.log("자바");                      브라우저
JAVA : print("자바");                          main / c언어

 */
