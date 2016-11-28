package com.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.services.facade.ServicesFacade;
import com.services.user.UserServices;



public class ServicesFacadeImpl implements ServicesFacade{
	
	@Autowired
	UserServices userServices;
	public void test() {
		userServices.testServices();
		//System.out.println("lala");		
	}
	
	
	
	
}
