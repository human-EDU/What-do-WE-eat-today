package com.inadang.service;

public interface CartService {
	
	void addCart(Long mno, int count, String id);
	
	int checkCart(Long mno, String id); // 중복 체크

	
	
	void deleteCart(Long mno, String id);
	
	void dropCart(String id);
	
}
