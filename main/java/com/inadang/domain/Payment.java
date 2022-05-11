package com.inadang.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

/*가게고유번호, 주문번호(단, 사용자 인증완료 후에는 재사용 불가), 
 * 사용자id, 결제요청유형, 결제금액, 결제 한 건에 대한 고유번호, 
 * 결제 준비 API가 성공적으로 호출되면 발급되는 코드(20자리), 
 * 결제완료여부auth, 결제시간(timeStamp)
 * */
@Data 
public class Payment {
	
	private Long pno; //결제시퀀스
	
//	@SerializedName("apply_num") 
	@JsonProperty("apply_num")
	private String ono; //주문번호

	@SerializedName("customer_uid")
//	@JsonProperty("customer_uid")
	private String id ; //결제자아이디
//	private String customer_uid ; //결제자아이디

    @SerializedName("amount")
    private int amount; //결제금액

    private String name; //가게명
    
    @SerializedName("buyer_email")
    private String email; //영수메일
    
    @SerializedName("merchant_uid")
    private String impUid; //가게번호

    @SerializedName("pay_method")
    private String payMethod; //결제방식
    
    private int applyNum;//승인번호
    
    @SerializedName("card_quota")
    private int quota; //할부
    
    private String status; //결제상태

    private String timeStamp; //결제일자
    
    private String cancleDate; //취소일자
    
    @SerializedName("buyer_tel")
    private String phoneNumber;
    
    @SerializedName("buyer_postcode")
    private int postCode;
    
    @SerializedName(" buyer_addr")
    private String address;
    
    private String detailAddress;
    
    private String requests;
    
    private Long cardNum;
}
