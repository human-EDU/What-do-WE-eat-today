package com.inadang.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inadang.domain.Order;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class OrderServiceTests {
	@Setter @Autowired
	OrderService orderService;
	
	
	@Test
	public void testExist(){
		assertNotNull(orderService);
		log.info(orderService);
	}
	
	@Test
	public void testGet(){
		Order orders = new Order();
		orders.setOno("ORD1651351086999");
		log.info(orderService.get(orders.getOno()));
	}
	
	@Test
	public void testInsert(){
		Order order = new Order();
		order.setOno("ORD1651351087011");
		order.setId("javaboy");
		order.setName("짠쯔 영등포점");
		order.setAmount(11000);
		
		int exp = 1;
		
		int result = orderService.insert(order);
		
		assertEquals("주문내역추가", exp, result);
		
		log.info(order);
	}
	
	@Test
	public void testDelete(){
		String ono = "ORD1651351087007";
		log.info(ono);
		
		boolean exp = true;
		
		boolean result = orderService.delete(ono);
		
		assertEquals("게시글삭제", exp, result);
	}
	
	@Test
	public void testUpdate(){
		Order order = new Order();
		order.setOno("ORD1651351087005");
		order.setStatus("canceled");
		
		boolean exp = true;
		boolean result = orderService.update(order);
		assertEquals("상태수정완료", exp, result);
	}
	
}
