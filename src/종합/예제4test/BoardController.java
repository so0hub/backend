package 종합.예제4test;

public class BoardController {

    Board[] boards = new Board[100];

    // 등록 메소드
    boolean doPost(String content,String writer){
        Board board = new Board(); // 객체 생성
        board.content = content;
        board.writer = writer;
        for(int index=0 ; index <= boards.length-1 ; index++){
            if(boards[index]==null){
                boards[index] = board;
                return true;
            }


        } // for END
        return false;
    } // method END

    // 조회 메소드
    Board[] doGet(){
        return boards;
    }
} // class END
