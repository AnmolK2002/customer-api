package com.prime.oms.customer.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prime.oms.customer.domain.CustomerEntity;
import com.prime.oms.customer.repository.CustomerRepository;
import com.prime.oms.customer.service.CustomerService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

	private final CustomerRepository customerRepository;
	
	@Override
	public CustomerEntity getCustomerNameById(Long id) {
		return customerRepository.findById(id).orElse(null);
	}

	@Override
	public void create(CustomerEntity customer) {
		customerRepository.save(customer);
	}

	@Override
	public void update(Long id, CustomerEntity customer) {
		CustomerEntity updateCustomer = getCustomerNameById(id);
		
		if(customer.getFirstName() != null) {
			updateCustomer.setFirstName(customer.getFirstName());
		}
		if(customer.getAddress() != null) {
			updateCustomer.setAddress(customer.getAddress());
		}
		
		customerRepository.save(updateCustomer);
	}

	@Override
	public void delete(Long id) {
		CustomerEntity customer = getCustomerNameById(id);
		customerRepository.delete(customer);
	}

	@Override
	public List<CustomerEntity> getAll() {
		return customerRepository.findAll();
	}

}
