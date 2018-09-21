package com.inverseli.learning;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.inverseli.learning.controller.HelloController;

/**  
 * @date：2018年9月22日 上午12:20:08    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class ApplicationTest {

	private MockMvc mvc;
	
	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
	}
	
	@Test
	public void testHelloController() throws Exception {
		
		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string(("Hello World")));
	}
}
  
