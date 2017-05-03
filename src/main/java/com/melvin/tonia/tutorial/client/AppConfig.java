package com.melvin.tonia.tutorial.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.melvin.tonia.tutorial.repo.CustomerRepository;
import com.melvin.tonia.tutorial.repo.HibernateCustomerRepositoryImpl;
import com.melvin.tonia.tutorial.service.CustomerService;
import com.melvin.tonia.tutorial.service.CustomerServiceImpl;

@Configuration
public class AppConfig {

	
	//@Bean("customerService")
	//setter based
	/*public CustomerService getCustomerService(){
	 CustomerServiceImpl impl = new CustomerServiceImpl();
	 impl.setCustomrepo(getCustomerRepository());
		return impl;
		
	}
	*/
	@Bean("customrepo")
	public CustomerRepository getCustomerRepository(){
		
		return new HibernateCustomerRepositoryImpl();
	}
	@Bean("customerService")
	public CustomerService getCustomerService(){
		 CustomerServiceImpl impl = new CustomerServiceImpl(getCustomerRepository());
		 //impl.setCustomrepo(getCustomerRepository());
			return impl;
			
		}
		
}
