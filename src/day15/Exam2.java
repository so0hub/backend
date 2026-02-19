package day15;

import java.util.*;

public class Exam2 {
    public static void main(String[] args) {
        
        // [1] 컬렉션(수집) 프레임(틀) 워크(일)
        // 1. 정의 : 자료들을 수집/저장하는 방법들을 미리 만들어둔 인터페이스/클래스
        // 2. 목적 : 복잡한 자료구조를 제공받아 편리한 데이터 관리
            // 자료구조란? 컴퓨터가 자료들을 효율적으로 저장하는 방법/구조 , ex] 리스트/해시/큐/스택/트리/ 등
        // 3. 종류 : 인터페이스란? 서로 다른 클래스/타입 들을 기능 통합
        /*
                인터페이스          구현체
                List       ->     ArrayList, Vector, LinkedList, Stack 등
                Set        ->     HashSet , TreeSet 등
                Map        ->     HashMap , HashTable , TreeMap 등 
         */
        
        // [2] List 타입
        ArrayList<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>(); // 어레이리스트 빼고 걍 이렇게 써도 됨!!!!!!
        
        // List 주요 메소드

        // 1) .add( ) : 삽입 , 추가
        list2.add("유재석"); // add 저장
        list2.add("유재석"); // 중복 허용
        list2.add(0,"강호동"); // 특정 인덱스에 추가도 가능
        
        System.out.println("list2 = " + list2);
        
        // 2) .set( ) : 수정
        list2.set(0,"강호동2"); // 수정
        System.out.println("list2 = " + list2);

        // 3) .get( ) : 호출
        System.out.println("list2.get(1) = " + list2.get(1)); // 유재석

        // 4) .size( )
        System.out.println("list2.size() = " + list2.size()); // 3

        // 5) .contains( ) : 없으면 불리언 있으면 true  , .indexOf( ) : 없으면 -1 있으면 인덱스번호
        boolean result1 = list2.contains("강호동2");
        int result2 = list2.indexOf("강호동2");

        // 6) .remove( ) : 삭제
        list2.remove("강호동2");
        System.out.println("list2 = " + list2);

        // 7) .isEmpty( ) : 비어있는지 확인
        System.out.println("list2.isEmpty() = " + list2.isEmpty());

        // 8) .clear( ) : 전체 삭제
        // list2.clear();

        // ======================================================================================
        // list 타입 과 반복문
        // 1) 일반 for문
        for(int index = 0 ; index <= list2.size() - 1 ; index++ ){
            System.out.println(list2.get(index));
        } // for END

        // 2) 향상된 for문
        for(String str : list2){
            System.out.println(str);
        }

        // 3) forEach문 * ( 실무에서 자주 사용 )
        // 리스트내 요소(값) 들을 하나씩 순서대로 반복변수에 대입하여 반복실행한다.
        // 변수명.forEach( (반복변수) -> { 실행문; } ); // 람다식
        list2.forEach( (str ) -> {System.out.println(str);});


        // List 구현체들 , 구현체란 ?  인터페이스의 추상메소드를 구현(오버라이딩)한 클래스/객체
        List< Integer > list; // 인터페이스 타입

        // 공통 : 여러 요소(값)들을 순서대로(인덱스) 저장하는 <배열> 구조
        list = new ArrayList<>();   // + 싱글스레드 사용 , 비동기화 메소드
        list.add(0,50); // 0번 인덱스에 50 대입

        list = new Vector<>();      // + 멀티스레드 사용 , 동기화(Synchronized) 메소드
        list = new LinkedList<>();  // + 싱글스레드 사용 .

        list.add( 0, 100); // 0번 인덱스에 100 대입

        // ArrayList 중간 삽입/삭제시 다른 데이터들 이동 발생 함
        // 중간 삽입/삭제가 느리다. 뒤에 추가 빠르다.


        // vs

        // LinkedList 중간 삽입 삭제시 다른 데이터들의 이동발생 안 함
        // 중간 삽입/삭제가 빠르다. 뒤에 추가 느리다.


        Stack<String> stack = new Stack<>();
        stack.push("유재석"); // 값 추가 : push
        stack.push("강호동"); // 값 추가 : push
        System.out.println( stack.pop() ); // 값 제거 : pop
        System.out.println( stack.pop() ); // 값 제거 : pop
        // Stack 스택 자료 구조란? // 입구와 출구가 하나라서 먼저 들어온 값이 더 나중에 나간다.
        // LIFO(Last In First Out)
        // 예 : 프링글스통 생각하면 됨.

    }
}
