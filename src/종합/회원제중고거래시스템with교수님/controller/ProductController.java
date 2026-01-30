package 종합.회원제중고거래시스템with교수님.controller;

import 종합.회원제중고거래시스템with교수님.model.dao.MemberDao;
import 종합.회원제중고거래시스템with교수님.model.dao.ProductDao;
import 종합.회원제중고거래시스템with교수님.model.dto.ProductDto;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    private ProductController() {
    }

    private static final ProductController instance = new ProductController();

    public static ProductController getInstance() {
        return instance;
    }
    private ProductDao pd = ProductDao.getInstance();


    // [1] 제품등록
    public boolean add( String pname , int pprice ,String pcommnet){
        System.out.println("ProductController.add"); // soutm
        System.out.println("pname = " + pname + ", pprice = " + pprice + ", pcommnet = " + pcommnet); // soutp
        // ++ 로그인중인 회원번호 가져오기( 다른 controller 에서 저장중 )
        int loginMno = MemberController.getInstance().getLoginSession();
        boolean result = pd.add( pname , pprice , pcommnet , loginMno );
        return result;
    }


    // [2] 제품전체조회
    public ArrayList<ProductDto> findAll(){
        ArrayList<ProductDto> result = pd.findALl();
        // * 조회된 제품 목록에서 제품 등록한 회원번호로 닉네임 찾기
        for(int index=0;index<=result.size()-1;index++){
            ProductDto productDto = result.get(index);
         String mname = MemberDao.getInstance().findMname(productDto.getMno()); // index 번째의 회원닉네임 찾기
        productDto.setMname(mname); // 반환된 닉네임을 저장한다.
        }
        return result;
    }

}
