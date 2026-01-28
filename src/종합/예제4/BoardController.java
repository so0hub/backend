package 종합.예제4;
// -게시물 객체 설계클래스
public class BoardController {
    // 속성 : 멤버변수
    Board[] boards = new Board[100];

    // 기능1 : 저장 메소드
    public boolean doPost(String content, String writer) {
        Board board = new Board(); // 1. 객체 생성
        board.content = content; // 2. 매개변수로 받은 값을 객체에 대입
        board.writer = writer;

        for (int index = 0; index <= boards.length - 1; index++) {
            if (boards[index] == null) { // 3. 만약에 index 번째 요소가 비어있으면
                boards[index] = board; // 배열에 새로운 객체 저장
                return true; // 함수 종료 뜻함, true 반환했으므로 리턴타입은 boolean
            }
        } // for END
        return false; // for문 끝났음에도 저장 못했으면 false 반환
    } // method END


    // 기능2 : 조회 메소드
    public Board[] doGet(){
        return boards; // boards 반환했으므로 리턴타입은 boards 변수의 타입은 Board[] 배열이다.
    } // method END
} // class END
