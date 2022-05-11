package com.inadang.mapper;

import static org.junit.Assert.assertNotNull;

import java.util.List;

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
public class OrderMapperTests {
	
	@Setter @Autowired
	private OrderMapper mapper;
	
	@Test
	public void exist(){
		assertNotNull(mapper);
		log.info(mapper);
	}
	
	
	@Test
	public void testGetList(){
		List<Order> list = mapper.getList();
		log.info(list);
		assertNotNull(list);
	}
	
	@Test
	public void testGet(){
		Order no = mapper.get("ORD1651351086994");
		log.info(no);
	}
	
	@Test
	public void testInsert(){
		//INSERT INTO tbl_orderno (ono, id, name, amount)
//	VALUES('ORD1651351086997', 'woongsan', '육쌈냉면 영등포점', '8000');
		Order no = new Order();
		no.setId("javaboy");
		no.setName("백종원의역전우동&덮밥-신도림역점");
		no.setAmount(100);
		
		
		mapper.insert(no);
		log.info(no);
	}
	
	@Test
	public void testDelete(){
		log.info("DELETE :: " + mapper.delete("ORD1651351086999"));
	}
	
	@Test
	public void testUpdate(){
		Order no = new Order();
		no.setOno("ORD1651351086999");
		no.setStatus("canceled");
		
		mapper.update(no);
		log.info(no);
	}
}
