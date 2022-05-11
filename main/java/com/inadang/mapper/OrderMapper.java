package com.inadang.mapper;

import java.util.List;

import com.inadang.domain.Order;

public interface OrderMapper {
	public List<Order> getList();
	
	public Order get(String ono);
	
	public int insert(Order no);
	
	public int delete (String ono);
	
	public int update(Order no);
	
}
