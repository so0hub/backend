
// 한 줄 주석
/* 여러 줄 주석 */

package day01; // 패키지(폴더) 이면서 클래스의 위치를 식별해줌
public class Exam1 {
// public : 공개용
// class : 자바는 코드의 최소 실행 단위, 즉] 자바는 클래스가 필수로 필요함!
// Exam1 : 클래스명은 무조건 첫 글자를 대문자
// { : 중괄호가 열리면 클래스 내부 시작
// } : 중괄호가 닫히면 클래스 내부 종료, 즉 클래스 {} 밖에서 작성한 코드는 실행 안 됨!!!
// [1] 클래스 내부에서는 선언만 가능하다.
    int a = 10; // 세미콜론 필수!

// [2] 함수 실행은 main(미리 만들어진) 함수 안에서만 가능하다.
//    System.out.print("안녕!"); 출력  안 됨
public static void main(String[] args) { // main  + ENTER
    System.out.println("자바안녕!"); // sout + ENTER : 자동완성
}
 }

// int b =10; // 클래스 밖의 선언이라 실행 안 됨!
