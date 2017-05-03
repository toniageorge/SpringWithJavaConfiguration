package com.melvin.tonia.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.melvin.tonia.tutorial.model.Customer;
import com.melvin.tonia.tutorial.repo.CustomerRepository;
import com.melvin.tonia.tutorial.repo.HibernateCustomerRepositoryImpl;

@Service("customerService")
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerServiceImpl implements CustomerService {

	CustomerRepository customrepo ;
	
	@Value("${dbUsername}")
	private String dbUsername;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customrepo = customerRepository;
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.melvin.tonia.tutorial.service.CustomerService#getAll()
	 */
	@Override
	public List<Customer> getAll(){
		System.out.println("the db user name is :" +dbUsername );
		return customrepo.getAll();
		
	}

	@Autowired
	public void setCustomrepo(CustomerRepository customrepo) {
		this.customrepo = customrepo;
	}
	
}
