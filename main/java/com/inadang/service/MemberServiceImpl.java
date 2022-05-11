package com.inadang.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.inadang.domain.AuthVO;
import com.inadang.domain.MemberVO;
import com.inadang.mapper.MemberMapper;

import lombok.AllArgsConstructor;

@Service @AllArgsConstructor
public class MemberServiceImpl implements MemberService{
	private MemberMapper mapper;
	private PasswordEncoder encoder;

	@Override
	public void join(MemberVO vo) {
		vo.setPassword(encoder.encode(vo.getPassword()));
		mapper.insertMember(vo);
		AuthVO authVO = new AuthVO();
		authVO.setAuth("ROLE_MEMBER");
		authVO.setId(vo.getId());
		mapper.insertAuth(authVO);
	}

	@Override
	public MemberVO get(String id) {
		return mapper.get(id);
	}

	@Override
	public int idCheck(String id) {
		return mapper.idCheck(id);
	}
	

	@Override
	public void updateSno(String id, Long sno) {
		mapper.updateSno(id, sno);
	}

	
	


	
	
	
	
}
