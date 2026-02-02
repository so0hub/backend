package 종합.콘솔기반도서관리시스템;

import 종합.콘솔기반도서관리시스템.view.MemberView;

public class Appstart {

    // [8-1] 처음 실행할 view 호출한다.
    public static void main(String[] args) {
        MemberView.getInstance().index();
    }
}
