package com.inadang.service;

import java.util.List;

import com.inadang.domain.OrderMenu;

public interface OrderMenuService {
	public List<OrderMenu> getList();
	
	public int insert(OrderMenu om); 
	
	List<OrderMenu> findBy(String ono);
	
	public boolean delete(Long mno);
	
	public List<OrderMenu> deleteAll(String ono);
}
