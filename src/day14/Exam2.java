package day14;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.TreeMap;

public class Exam2 {
    public static void main(String[] args) {

        // ****** 스레드(물의 줄기)가 여태까지 한 줄이었다면 지금은 main,시계,타이머해서 세 줄임.


        // [ Main Thread -> 시계 Thread 만들기 ] // 메인스레드가 시계 스레드를 생성하고
        시계스레드 시계스레드 = new 시계스레드();
        Thread thread1 = new Thread( 시계스레드 );
        thread1.start(); // 시계스레드 시작 // 1초에 한 번씩 실행 // 메인스레드가 시계 스레드를 실행해줌 걍 원래 메인 혼자 노동하다가 시계,타이머 노동자 두 명 더 생성한 거

        // [ Main Thread -> 타이머 Thread 만들기 ]
        타이머스레드 타이머스레드 = new 타이머스레드();
        타이머스레드.start(); // 타이머스레드 시작

        // [ Main Thread 입력 ]
        for(;;){
            System.out.println(" 타이머 : 1)ON    2)OFF :  ");
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();
            if(ch == 1){
                타이머스레드 = new 타이머스레드();
                타이머스레드.state = true;
                타이머스레드.start();
            }
            else if ( ch == 2) {
                if( 타이머스레드 != null ) {
                    // 타이머스레드.stop(); // 가능하지만 비권장
                    타이머스레드.state = false; // 멤버변수로 상태 관리하는 걸 권장
                }
            }
        }

    } // main END
} // class END


class 시계스레드 implements Runnable{
    @Override
    public void run() { // run 정의
        for(;;){ // 무한루프
            System.out.println(LocalTime.now()); // 현재시간
            try{Thread.sleep(998);} // main 스레드가 아닌 현재 작업 스레드를 1초간 일시정지
        catch (Exception e){}
        } // for END
    } // m END
} // class END


class 타이머스레드 extends Thread {
    boolean state = false; // 타이머 실행 상태
    @Override
    public void run(){
        int second = 0; // 타이머가 계산하는 초
        for(;;){
            if( state == false )break; // 타이머 종료
            second++; // 1초 증가
            System.out.printf("[타이머] : %d초\n" , second );
            try{Thread.sleep(998);} // main 스레드가 아닌 현재 작업 스레드를 1초간 일시정지
            catch (Exception e){}
        } // for END
    } // run END
} // class END

