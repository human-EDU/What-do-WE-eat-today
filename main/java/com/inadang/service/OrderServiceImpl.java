package com.inadang.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inadang.domain.Order;
import com.inadang.mapper.OrderMapper;

import lombok.AllArgsConstructor;

@Service @AllArgsConstructor 
public class OrderServiceImpl implements OrderService{
	OrderMapper orderMapper;
	
	public List<Order> getList() {
		return orderMapper.getList();
	}

	@Override
	public Order get(String ono) {
		return orderMapper.get(ono);
	}

	@Override
	public int insert(Order no) {
		return orderMapper.insert(no);
	}

	@Override
	public boolean update(Order no) {
		return orderMapper.update(no) > 0;
	}

	@Override
	public boolean delete(String ono) {
		return orderMapper.delete(ono) > 0 ;
	}
}
