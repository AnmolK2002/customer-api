package com.prime.oms.customer.service;

import com.prime.oms.customer.domain.CustomerEntity;

public interface CustomerService {

	public CustomerEntity getCustomerNameById(Long id);

	public void create(CustomerEntity customer);

	public void update(Long id, CustomerEntity customer);

	public void delete(Long id);

}
