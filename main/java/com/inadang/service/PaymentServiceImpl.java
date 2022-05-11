package com.inadang.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inadang.domain.Payment;
import com.inadang.mapper.PaymentMapper;

import lombok.AllArgsConstructor;

@Service @AllArgsConstructor 
public class PaymentServiceImpl implements PaymentService{
	
	private PaymentMapper mapper;
	
	@Override
	public int insert(Payment payments) {
		return mapper.insert(payments);
	}

	@Override
	public List<Payment> getList() {
		return mapper.getList();
	}


	@Override
	public Payment findSpecific(String ono, String id) {
		return mapper.findSpecific(ono, id);
	}

	@Override
	public Payment select(String ono) {
		return mapper.select(ono);
	}

	@Override
	public List<Payment> get(String id) {
		return mapper.get(id);
	}

	@Override
	public int updateState(String status, String id) {
		return mapper.updateState(status);
	}
	
	@Override
	public int remove(String ono) {
		return mapper.remove(ono);
	}
}
