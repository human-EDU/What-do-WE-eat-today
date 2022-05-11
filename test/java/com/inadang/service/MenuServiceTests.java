package com.inadang.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inadang.domain.CriteriaScroll;
import com.inadang.domain.Menu;
import com.inadang.domain.MenuAttach;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MenuServiceTests {
	@Setter @Autowired
	MenuService menuService;
	
	@Test
	public void testExist() {
		assertNotNull(menuService);
	}
	
	@Test
	public void testRegister() {
		Menu menu = new Menu(1L, null, "test", 30000L, "testInfo", true, null);
		log.info(menuService.register(menu));
	}
	
	@Test
	public void testAddAtthach() {
		MenuAttach menuAttach = new MenuAttach(null, "test", "test", null, null, 30002L);
		log.info(menuService.addAttach(menuAttach));
	}
	
	@Test
	public void testRemoveAttach() {
		Long mno = 30002L;
		log.info(menuService.removeAttach(mno));
	}
	
	@Test
	public void testGetAttach() {
		Long mno = 30002L;
		log.info(menuService.getAttach(mno));
	}
	
	@Test
	public void testModify() {
		Long mno = 30002L;
		Menu menu = menuService.get(mno);
		log.info(menuService.get(mno));
		menu.setName("modify test");
		menuService.modify(menu);
		log.info(menuService.get(mno));
	}
	
	@Test
	public void testRemove() {
		Long mno = 30002L;
		log.info(menuService.remove(mno));
	}
	
	@Test
	public void testList() {
		Long sno = 1L;
		CriteriaScroll cri = new CriteriaScroll();
		menuService.list(sno, cri).forEach(log::info);
	}
	
	@Test
	public void testGet() {
		Long mno = 13642L;
		log.info(menuService.get(mno));
	}
	
	@Test
	public void testChangeState() {
		Long mno = 13642L;
		menuService.changeState(mno);
		log.info(menuService.get(mno).isState());
		menuService.changeState(mno);
		log.info(menuService.get(mno).isState());
	}
	
	@Test
	public void testRemoveAll() {
		Long sno = 281L;
		log.info(menuService.removeAll(sno));
	}
	
}
