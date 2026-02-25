package day14;

import java.awt.*;

public class Exam1 {
    public static void main(String[] args) {

        // [ Thread 스레드 ]
        /*
            프로세스 : 프로그램( 명령어 집합)이 실행 중인 흐름 , [CTRL + ALT + DELETE ] 작업관리자 : 현재 프로세스 확인
            멀티 태스킹 : 2가지 이상의 작업을 동시 처리

            멀티 프로세스 : 2가지 이상의 프로세스(프로그램) 동시(병렬) 처리 * 멀티 태스킹 *
            멀티 스레드 : 2가지 이상의 명령어 동시(병렬) 처리 * 멀티 태스킹 *

            스레드 : 하나의 프로세스(프로그램) 내에서 실행되는 작업 단위 , 실행 흐름
                * JS는 자체적인 스레드가 없다( 브라우저 / 크롬 : 스레드 )
                * JAVA/PYTHON/C 는 자체적인 스레드가 있다 (main/c)
                1. 목적 : 코드(명령어)들을 읽어드리고 CPU(컴퓨터 내 연산장치)가 처리한다.
                2. 자바의 스레드
                    public static void main(String[] args) { } 함수가 내장됨

                멀티 스레드 : main 스레드 외 새로운 * 작업 스레드 * 를 생성하여 동시 작업
                    1. 목적 : * 병렬 처리 * , 동시에 여러 작업 처리한다.
                    2. 사용처 : 웹/앱 , 채팅 , 첨부파일  등등
                    3. 구현방법
                        방법 1) 익명구현체
                            Runnable runnable = new Runnable(){ @Override public void run(){작업스레드코드} }
                            Thread thread = new Thread(runnable);
                            thread.start();

                        방법 2) 구현체
                            class 작업클래스 implements Runnable{ @Override public void run(){작업스레드코드} }
                            작업스레드 변수 = new 작업스레드();
                            Thread thread = new Thread( 변수 );
                            thread.start();

                        방법 3) 상속
                            class 작업스레드 extends Threa{ @Override public void run(){작업스레드코드} }
                            작업스레드 변수 = new 작업스레드();
                            변수.start();

                     4. 주요 메소드
                        * Runnable 인터페이스 : run 추상메소드 ,     생성한 작업스레드가 처리할 코드집합
                        * Thread 클래스 : start 메소드 ,    구현된 run 메소드 실행 메소드

         */

        Toolkit toolkit = Toolkit.getDefaultToolkit(); // 자바의 UI 제공하는 클래스

        // [1] 단일(싱글) 스레드  :  에서는 '띵' 소리와 '띵' 출력 기능을 동시에 할 수 없다.
        for(int i = 1 ; i <= 5 ; i++){      // [[ MAIN Thread ]]
            toolkit.beep(); // 띵하는 소리를 내게 하는 메소드
            try{Thread.sleep( 1000 );}catch (Exception e){} // Thread.sleep( 밀리초 ) , 밀리초 만큼 현재 스레드 일시정지
        }
        for( int i = 1 ; i <= 5 ; i++ ){    // [[ MAIN Thread ]]
            System.out.println("띵");
        } // 띵 출력 반복문 5번

        // [2] 멀티 스레드  :  에서는 '띵' 소리와 '띵' 출력 기능을 동시에 할 수 있다.
        Runnable runnable = new Runnable() { // Runnable 인터페이스 익명구현체( 클래스가 추상메소드 구현 )

            @Override
            public void run() { // 추가된 작업스레드가 처리할 코드
                for(int i = 1 ; i <= 5 ; i++){    // [[ Task1 Thread ]]
                    toolkit.beep(); // 띵하는 소리를 내게 하는 메소드
                    try{Thread.sleep( 1000 );}catch (Exception e){} // Thread.sleep( 밀리초 ) , 밀리초 만큼 현재 스레드 일시정지
                }
            }

        }; // 익명 구현체 } 닫기 뒤에 꼭 ; 세미콜론 넣기
        // [[ MAIN Thread ]]

        Thread thread1 = new Thread( runnable ); // 3) 익명구현체 인터페이스를 Thread 객체 대입
        // [[ MAIN Thread -----> Task1 Thread  ]]
        thread1.start(); // 4) 스레드 객체가 start() 메소드를 호출하면 구현한 run 메소드가 실행된다.

        for( int i = 1 ; i <= 5 ; i++ ){    // [[ MAIN Thread ]]
            System.out.println("띵");
            try{Thread.sleep( 1000 );}catch (Exception e){}
        }

        // [3] 멀티 스레드2
        // [[ MAIN Thread ]]
        SoundBeep soundBeep = new SoundBeep();
        Thread thread2 = new Thread(soundBeep);
        thread2.start(); //  [[ MAIN Thread -----> Task Thread  ]]

        for( int i = 1 ; i <= 5 ; i++ ){    // [[ MAIN Thread ]]
            System.out.println("띵");
            try{Thread.sleep( 1000 );}catch (Exception e){}
        }

        // [4] 멀티 스레드3
        SoundBeep2 thread3 = new SoundBeep2();
        thread3.start(); // run이 실행되는 전제조건 : start()

        for( int i = 1 ; i <= 5 ; i++ ){    // [[ MAIN Thread ]]
            System.out.println("띵");
            try{Thread.sleep( 1000 );}catch (Exception e){}
        }


    } // main END
} // class END

class SoundBeep implements Runnable{
    // * Runnable 인터페이스 구현
    // * run 추상메소드 구현 -> 추가 작업스레드가 처리할 코드

    @Override public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 1 ; i <= 5 ; i++) {
            toolkit.beep(); // 띵하는 소리를 내게 하는 메소드
            try {Thread.sleep(1000);} catch (Exception e) {}
        }
    }
}

class SoundBeep2 extends Thread{
    // * Thread클래스로부터 상속
    // * run 메소드 재정의 -> 추가 작업스레드가 처리할 코드

    @Override public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 1 ; i <= 5 ; i++) {
            toolkit.beep(); // 띵하는 소리를 내게 하는 메소드
            try {Thread.sleep(1000);} catch (Exception e) {}
        }
    }
}