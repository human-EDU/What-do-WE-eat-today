package com.inadang.domain;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Alias("store")
public class Store {
	private Long category;
	private String address;
	private String tel;
	private String startTime;
	private String endTime;
	private String originInfo;
	private Long minPrice;
	private String delTime;
	private Double scope;
	private Long reviewNum;
	private Long likes;
	private String bno;
	private Long sno;
	private String notice;
	private String delPrice;
	private String name;
	
	private String ad;
	private String replyNum;
	private String logo;
	
	
	private Long rn; // 다양한 조건에 의한 페이징을 위한 필드
	
	List<StoreAttach> attachs = new ArrayList<>();
}
