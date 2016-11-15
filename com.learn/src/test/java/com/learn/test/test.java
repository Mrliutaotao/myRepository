package com.learn.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.services.facade.ServicesFacade;
import com.services.user.UserServices;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/config.xml"})
public class test {
	
	@Autowired
	UserServices userServices;
	
	@Autowired
	ServicesFacade servicesFacade;
	
	@Test
	public void testa(){
		userServices.testServices();
	}
	
	@Test
	public void testFacade(){
		servicesFacade.test();
	}

	
}