package com.inadang.controller;

import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
	"file:src/main/webapp/WEB-INF/spring/root-context.xml"
})
@WebAppConfiguration
@Log4j
public class OrderControllerTests {
	
	@Autowired @Setter
	private WebApplicationContext ctx;
	private MockMvc mvc;
	
	@Before
	public void setUp(){
		this.mvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void testExist(){
		log.info(mvc);
		assertNotNull(mvc);
	}
	
	@Test
	public void testGets() throws Exception{
		ModelAndView mav = mvc.perform(MockMvcRequestBuilders
				.get("orders/payments?ono=ORD1651351086995"))
				.andReturn()
				.getModelAndView();
		
		Map<String, Object> map = mav.getModel();
		@SuppressWarnings("unchecked")
		List<Object> list = (List<Object>) map.get("payment");
		list.forEach(log::info);
	}
}
