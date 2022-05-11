package com.inadang.service;

import java.util.List;

import com.inadang.domain.CriteriaScroll;
import com.inadang.domain.Store;
import com.inadang.domain.StoreAttach;

public interface StoreService {
	List<Store> list(Long category, CriteriaScroll cri, String condition); // 가게 목록 조회
	
	List<Store> list(Long category, CriteriaScroll cri);
	
	List<Store> listAd(Long category);
	
	StoreAttach getLogo(Long sno);
	
	Store get(Long sno); // 특정 가게 상세조회
	
	int register(Store store);
	
	Store getStoreById(String id);
}
