package com.inadang.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inadang.domain.OrderMenu;
import com.inadang.mapper.OrderMenuMapper;

import lombok.AllArgsConstructor;

@Service @AllArgsConstructor
public class OrderMenuServiceImpl implements OrderMenuService{
	private OrderMenuMapper mapper;

	@Override
	public List<OrderMenu> getList() {
		return mapper.getList();
	}

	@Override
	public int insert(OrderMenu om) {
		return mapper.insert(om);
	}

	@Override
	public List<OrderMenu> findBy(String ono) {
		return mapper.findBy(ono);
	}

	@Override
	public boolean delete(Long mno) {
		return mapper.delete(mno) > 0;
	}

	@Override
	public List<OrderMenu> deleteAll(String ono) {
		return mapper.deleteAll(ono);
	}
}
