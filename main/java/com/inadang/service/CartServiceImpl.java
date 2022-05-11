package com.inadang.service;

import org.springframework.stereotype.Service;

import com.inadang.mapper.CartMapper;

import lombok.AllArgsConstructor;

@Service @AllArgsConstructor
public class CartServiceImpl implements CartService{
	
	private CartMapper mapper;
	
	@Override
	public void addCart(Long mno, int count, String id) {
		mapper.insertCart(mno, count, id);
	}

	@Override
	public void deleteCart(Long mno, String id) {
		mapper.delete(mno, id);
	}

	@Override
	public void dropCart(String id) {
		mapper.drop(id);
	}

	@Override
	public int checkCart(Long mno, String id) {
		return mapper.checkCart(mno, id);
	}
	
	

}
