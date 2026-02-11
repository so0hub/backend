package day13;

import day07.package1.A;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Random;

public class Exam3 {
    public static void main(String[] args) {

        // [난수 클래스]
        // [1] 랜덤 객체 생성
        Random random = new Random();
        // 1) 0 ~ 9 사이의 난수 생성 , .nextXXX( 개수 )
        int val1 = random.nextInt(); // INT 타입 허용 범위 내 난수를 랜덤으로 생성함
        System.out.println("val1 = " + val1); //
        int val2 = random.nextInt( 10 );
        System.out.println("val2 = " + val2); // 0~9까지 난수가 생성됨
        // 2) 1 ~ 10 사이의 난수 생성, nextXXX( 개수 ) + 시작값
        int val3 = random.nextInt(10)+1;
        System.out.println("val3 = " + val3); // 1~10까지 난수가 생성됨
        // 3) 0 ~ 1 사이의 실수 난수 생성
        double val4 = random.nextDouble();
        System.out.println("val4 = " + val4);
        // 4) true,false 난수 생성
        boolean val5 = random.nextBoolean();
        System.out.println("val5 = " + val5);

        // 활용처1 : 특정 목록에서 하나의 항목을 랜덤으로 선택
        ArrayList<String> list = new ArrayList<>();
        list.add("유재석"); list.add("강호동"); list.add("박진감");
        int index = random.nextInt(list.size()); // 리스트 내 항목개수 만큼 난수 생성
        System.out.println("list.get(index) = " + list.get(index));

        // 활용처2 : 인증코드/임시비밀번호 생성
        String code = ""; // 인증코드 6자리 저장하는 변수
        for(int i = 1 ; i <= 6 ; i++ ){ // 총 6번 반복
            int rand = random.nextInt( 26 ) + 97; // 97 ~ 122 사이의 난수 생성
            char ch = (char)rand; // 97 ~ 122 --> 문자 타입 변환
            code += ch; // 인증코드에 연결
        }
        System.out.println("code = " + code);

        // 활용처 3 : 주사위/추첨번호 생성


    } // main END
} // class END
