package com.prime.oms.customer.service;

import java.util.List;

import com.prime.oms.customer.domain.CustomerEntity;

public interface CustomerService {

	public CustomerEntity getCustomerNameById(Long id);

	public void create(CustomerEntity customer);

	public void update(Long id, CustomerEntity customer);

	public void delete(Long id);

	public List<CustomerEntity> getAll();


}
