package 종합.예제5;

import java.text.BreakIterator;

public class BoardController {

    // [1] private : 외부접근차단, static : 우선할당(객체없이), final(수정금지)
    private static final Board[] boards = new Board[100];

    // [2] 기능1 : 저장 기능 , public : 모든 프로젝트에서 호출 가능 뜻
    public static boolean doPost(String content,String writer){

        // 1. 생성자를 이용한 객체 생성
        Board board = new Board(content,writer);

        // 2. 인덱스 0부터 마지막 인덱스 이하까지 1씩 증가하여 빈(null) 찾기
        for(int index = 0 ; index <= boards.length-1 ; index++ ){
            if(boards[index] == null){
                boards[index] = board;
                return true; // 성공시 true
            }
        } // for END
        return false; // 실패시 false
    }

    // [3] 기능2 : 조회 기능 , boards가 리턴값이므로 반환타입은 boards의 타입인 Board[]
    public static Board[] doGet(){
        return boards;
    }

} // class END
