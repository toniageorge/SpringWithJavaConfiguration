package com.melvin.tonia.tutorial.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.melvin.tonia.tutorial.service.CustomerService;
import com.melvin.tonia.tutorial.service.CustomerServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ApplicationContext context = new AnnotationConfigApplicationContext(AutowireApp.class);
		CustomerService customerservice = context.getBean("customerService", CustomerService.class);
		
		System.out.println(customerservice.getAll().get(0).getLastName());
		System.out.println(customerservice);
       CustomerService customerservice2 = context.getBean("customerService", CustomerService.class);
		
		System.out.println(customerservice2);
	}

}
