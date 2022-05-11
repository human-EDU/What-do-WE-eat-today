package com.inadang.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inadang.domain.OrderMenu;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class OrderMenuServiceTests {
	@Autowired @Setter
	private OrderMenuService menuService;
	
	@Test
	public void testExist(){
		log.info(menuService);
		assertNotNull(menuService);
	}
	
	@Test
	public void testgetList(){
		List<OrderMenu> list = menuService.getList();
		list.forEach(log::info);
	}
	
	@Test
	public void testFindBy(){
		String ono = "ORD1651351087011";
		List<OrderMenu> list = menuService.findBy(ono);
		list.forEach(log::info);
	}
}
