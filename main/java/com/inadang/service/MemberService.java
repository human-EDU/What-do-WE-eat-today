package com.inadang.service;

import com.inadang.domain.MemberVO;

public interface MemberService {

	void join(MemberVO vo);
	
	MemberVO get(String id);
	
	int idCheck(String id);
	
	void updateSno(String id, Long sno);
	

}
