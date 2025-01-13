package com.prime.oms.customer.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prime.oms.customer.domain.CustomerEntity;
import com.prime.oms.customer.service.CustomerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class CustomerController {
	
	private final CustomerService customerService;
	
	@GetMapping("/customer/{id}")
	public CustomerEntity get(@PathVariable Long id) {
		return customerService.getCustomerNameById(id);
	}
	
	@PostMapping("/customer")
	public void create(@RequestBody CustomerEntity customer) {
		customerService.create(customer);
	}
	
	@PatchMapping("/customer/{id}")
	public void create(@PathVariable Long id, @RequestBody CustomerEntity customer) {
		customerService.update(id, customer);
	}
		
	@DeleteMapping("/customer/{id}")
	public void delete(@PathVariable Long id) {
		customerService.delete(id);
	}
	
}
