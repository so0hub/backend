package day02; // 클래스가 위치한 폴더/패키지 명 < 식별 >
// 같은 패키지에서는 동일한 이름의 클래스가 존재할 수 없다.
public class Exam1 { // class START
    public static void main(String[] args) { // main START

        // [1] 타입 = 자료형 = 분류 = 자료들을 분류/나누는 방법
        // (1) 자동 타입 변환/캐스팅 (묵시적 : 개발자가 따로 할 게 없다 자동이라는 뜻) , 손실이 없다.
        // 캐스팅을 하는 이유 : 다형성 ! : 다양한 형태 / 모양 근데 본질은 안 바꾸는 것.
        // byte -> short -> int -> long -> float -> double ( 작은 상자 -> 큰 상자 )
        byte byteValue = 10; // 10 자료를 byte 타입으로 분류했다.      // 자료는 10이지만
        short shortValue = byteValue; // byte 타입 -> short 타입 변환     // 껍데기(타입/형식) 바꾸기 = 다형성
        int intValue = shortValue; // short 타입 -> int 타입 변환
        long longValue = intValue; // int 타입 -> long 타입 변환
        float floatValue = longValue; // long 타입 -> float 타입 변환
        double doubleValue = floatValue; // float 타입 -> double 타입 변환

        // (2) 연산 중 (자동) 타입변환
        // byte + byte = int ,  byte + short = int , int + int = int , ★int 이하 피연산자들은 연산하면 int로 결과가 나온다.
        // long , float , double 들은 피연산자 중에 더 큰 타입으로 결과가 나온다.
        byte b1 = 10; byte b2 = 20; short s1 = 30; int i1= 40; long l1 = 50L; float f1 = 3.14F; double d1 = 41.25;
        int result1 = b1 + b2; // byte + byte = int
        int result2 = b1 + s1; // byte + short = int
        int result3 = i1 + i1; // int + int = int
        long result4 = i1 + l1; // int + long = long
        float result5 = i1 + f1; // int + float = float
        double result6 = i1 + d1; // int + double = double

        // (3) 강제 타입 변환 ( 명시적 : 개발자가 변환할 타입 작성 )
        // double -> float -> long -> int -> short -> byte , 자료의 손실이 있다. ( 큰 상자 -> 작은 상자 )
        double dvalue = 3.14;
        float fvalue = (float)dvalue; // (새로운타입)기존값
        long lvalue = (long)fvalue; // float -> long
        int ivalue = (int)lvalue;
        short svalue = (short)ivalue;
        byte bvalue = (byte)svalue; // bvalue에는 3 자료가 들어있다. 손실 발생.

    } // main END
} // class END
