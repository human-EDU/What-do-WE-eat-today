package com.inadang.mapper;

import static org.junit.Assert.assertNotNull;

import java.util.UUID;

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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MenuMapperTests {
	@Setter @Autowired
	private MenuMapper mapper;
	
	@Test
	public void testExist() {
		assertNotNull(mapper);
	}
	
	@Test
	public void testInsert() {
		Menu menu = new Menu(1L, null, "오늘저녁뭐먹노", 200000L, "메뉴추가테스트", false, null);
		int result = mapper.insert(menu);
		log.info(result);
	}
	
	@Test
	public void testDelete() {
		Long mno = 5860L;
		log.info(mapper.delete(mno));
	}
	
	@Test
	public void testInsertAttach() {
		MenuAttach attach = new MenuAttach(5880L, null, UUID.randomUUID().toString(), "origin", null, null);
		log.info(mapper.insertAttach(attach));
	}
	
	@Test
	public void testSelectAttach() {
		Long mno = 2973L;
		log.info(mapper.selectAttach(mno));
	}
	
	@Test
	public void testDeleteAttach() {
		Long mno = 5880L;
		log.info(mapper.delete(mno));
	}
	
	@Test
	public void testUpdate() {
		Menu menu = new Menu(1L, 5880L, "내일점심뭐먹노", 200000L, "메뉴수정테스트", false, null);
		log.info(mapper.update(menu));
	}
	
	@Test
	public void testSelectAll() {
		Long sno = 1L;
		CriteriaScroll cri = new CriteriaScroll();
		mapper.selectAll(sno, cri).forEach(log::info);
	}
	
	@Test
	public void testSelect() {
		Long mno = 5880L;
		log.info(mapper.select(mno));
	}
	
	@Test
	public void testUpdateState() {
		Long mno = 5880L;
		log.info(mapper.updateState(mno));
	}
	
	@Test
	public void testDeleteAll() {
		Long sno = 1L;
		CriteriaScroll cri = new CriteriaScroll();
		for(Menu menu : mapper.selectAll(sno, cri)) {
			mapper.deleteAttach(menu.getMno());
		}
		log.info(mapper.deleteAll(sno));
	}
	
}
