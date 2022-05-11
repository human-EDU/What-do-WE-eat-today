package com.inadang.mapper;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inadang.domain.AuthVO;
import com.inadang.domain.MemberVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/security-context.xml"
})
@Log4j
public class MemberMapperTests {
	@Setter @Autowired
	private MemberMapper mapper;
//	private PasswordEncoder encoder;
	
	
	@Test
	public void testExist() {
		assertNotNull(mapper);
		log.info(mapper);
	}
	
//	@Test
//	public void testInsertMember() {
//		MemberVO vo = new MemberVO();
//		vo.setId("woong3");
//		vo.setPassword(encoder.encode("1234"));
//		vo.setName("웅3");
//		vo.setTel("010-0000-0000");
//		vo.setEmail("woong3.naver.com");
//		vo.setNickName("웅3");
//		vo.setBossName("김치형");
//		
//		log.info(vo);
//		
//		mapper.insertMember(vo);
//	}

	@Test
	public void testInsertAuth() {
		AuthVO vo = new AuthVO();
		vo.setId("sang");
		vo.setAuth("ROLE_MEMBER");
		mapper.insertAuth(vo);
		log.info(vo);
	}
	
	@Test
	public void IdChk() {
		String id = "woong2";
		String id2 = "woong4";
		mapper.idCheck(id);
		mapper.idCheck(id2);
	}
	
	
	@Test
	public void testGet() {
		log.info(mapper.get("woong2"));
	}
	
	/*@Test
	public void testUpdateMember() {
		MemberVO vo = new MemberVO();
		vo.setId("woong1");
		vo.setPassword(encoder.encode("1234"));
		vo.setName("웅이아버지1");
		vo.setTel("010-1112-1112");
		vo.setEmail("woong12@naver.com");
		vo.setNickName("웅이아버지");
		mapper.updateMember(vo);
		log.info(vo);
	}*/
	
	@Test
	public void testUpdateAuth() {
		AuthVO vo = new AuthVO();
		vo.setId("woong1");
		vo.setAuth("ROLE_MANAGER");
		mapper.updateAuth(vo);
		log.info(vo);
	}
	@Test
	public void testDeleteAuth() {
		mapper.deleteAuth("woong");
	}
	
	@Test
	public void testDeleteMember() {
		mapper.deleteMember("woong");
	}
	
	@Test
	public void testGetSno(){
		log.info(mapper.getSno("woong2"));
		
	}
	
}
