package com.inadang.mapper;

import org.apache.ibatis.annotations.Param;

import com.inadang.domain.AuthVO;
import com.inadang.domain.MemberVO;

public interface MemberMapper {

	int insertMember(MemberVO vo);

	int insertAuth(AuthVO vo);

	int idCheck(String id);

	MemberVO get(String id);
	
	int updateMember(MemberVO vo);
	
	int updateAuth(AuthVO vo);

	int updateSno(@Param("id") String id,@Param("sno") Long sno);

	int deleteMember(String id);
	
	int deleteAuth(String id);
	
	long getSno(String id);
	
}
