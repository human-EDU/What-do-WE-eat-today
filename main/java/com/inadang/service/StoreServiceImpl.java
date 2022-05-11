package com.inadang.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inadang.domain.CriteriaScroll;
import com.inadang.domain.Store;
import com.inadang.domain.StoreAttach;
import com.inadang.mapper.MemberMapper;
import com.inadang.mapper.StoreAttachMapper;
import com.inadang.mapper.StoreMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
@Service @AllArgsConstructor @Log4j
public class StoreServiceImpl implements StoreService{
	@Autowired @Setter
	StoreMapper mapper;
	
	private StoreMapper storeMapper;
	private StoreAttachMapper storeAttachMapper;
	private MemberMapper memberMapper;
	
	
	@Override
	public List<Store> list(Long category, CriteriaScroll cri, String condition) {
		return mapper.selectAllByCategory(category, cri, condition);
	}
	
	@Override
	public List<Store> list(Long category, CriteriaScroll cri) {
		return mapper.selectAllByCategory(category, cri, "");
	}
	


	@Override
	public StoreAttach getLogo(Long sno) {
		return mapper.selectLogo(sno);
	}



	
	@Override
	public Store get(Long sno) {
		// TODO Auto-generated method stub
//		storeAttachMapper.findBy(sno);
		return storeMapper.read(sno);
	}
	
	@Transactional
	public int register(Store store) {
		log.info("register("+ store +")");

		int result = storeMapper.insertSelectKey(store);
		
		store.getAttachs().forEach((attach) -> {
			attach.setSno(store.getSno());
			storeAttachMapper.insert(attach);
		} );
		
		// boardVO.bno == null
		return result;
	}



	@Override
	public Store getStoreById(String id) {
		Store result = storeMapper.read(memberMapper.getSno(id));
		return result;
	}



	@Override
	public List<Store> listAd(Long category) {
		return storeMapper.selectAd(category);
	}



	
}
