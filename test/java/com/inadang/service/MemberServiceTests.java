package com.inadang.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inadang.domain.MemberVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/security-context.xml"
})
public class MemberServiceTests {
	@Setter @Autowired
	private MemberService service;
	@Setter @Autowired
	private PasswordEncoder encoder;
	
	@Test
	public void testExist(){
		assertNotNull(service);
		log.info(service);
	}
	
	/*@Test
	public void testInsertMember() {
		MemberVO vo = new MemberVO();
		vo.setId("woong3");
		vo.setPassword(encoder.encode("1234"));
		vo.setName("웅3");
		vo.setTel("010-1112-1112");
		vo.setEmail("woong3@naver.com");
		vo.setNickName("웅3");
		vo.setBossName("김승종");
		service.insertMember(vo);
		log.info(vo);
	}*/
	
	/*@Test
	public void testGet() {
		log.info(service.get("woong2"));
		
	}*/
}
