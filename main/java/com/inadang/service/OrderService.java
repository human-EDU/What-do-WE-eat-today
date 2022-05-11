package com.inadang.service;

import java.util.List;

import com.inadang.domain.Order;

public interface OrderService {
	public List<Order> getList ();
	
	public Order get(String ono);
	
	public int insert(Order no);
	
	public boolean update(Order no);
	
	public boolean delete(String ono);
}
