package com.inadang.domain;

import lombok.Data;

//ex02에서 가져옴 

@Data
public class CriteriaReview {
	int amount = 10;
	Long lastRno = 10000000000L; //있고 없고에 따라 널값처리가 달라짐
	//저 기본값 없으면 if로 널체크 해줘야함
}
