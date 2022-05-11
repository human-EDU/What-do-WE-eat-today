package com.inadang.domain;

import lombok.Data;

//주문번호 확인하고 아이디랑 일치여부 확인하는곳
@Data
public class Order {
	private String ono; //주문번호 PK
	private String id; //회원아이디 FK
	private boolean pickup; //포장/배달
	private String orderDate; //주문날짜
	private String name; //가게 FK
	private int amount;//총가격
	private String status; //주문상태
}
