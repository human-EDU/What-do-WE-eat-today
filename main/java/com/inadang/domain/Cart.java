package com.inadang.domain;

import java.util.Date;

/*"가게에 들어가 마음에 드는 메뉴를 선택하고 수량 및 옵션을 설정 후 장바구니에 담는다.
※ 만약 장바구니에 담은 후 다른 가게의 메뉴를 담을 시 이전 가게의 메뉴는 삭제되고 새로운 가게의 메뉴만 담긴다."
장바구니에 담은 메뉴들의 이름, 수량, 개별가격, 총 가격을 조회한다.
"장바구니에 담아둔 메뉴의 수량 조절 시 개별합산가격과 총 가격도 함께 변한다.
(0개는 불가)"
"장바구니에 담았던 메뉴를 삭제한다. 
삭제 시 장바구니에 담아둔 메뉴의 이름, 수량, 개별가격, 총 가격 리스트가 함께 변한다."*/
public class Cart {
	private Long cno;
	private Long mno;
	private int count;
	private Date regDate;
	private String id;
}

