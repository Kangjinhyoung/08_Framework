package com.kh.test.customer.service;

import com.kh.test.customer.dto.Customer;

public interface CustomerService {
	/**
	 * 
	 * @param customer
	 * @return
	 */
  int insertCustomer(Customer customer);
}
