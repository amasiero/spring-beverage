package com.andreymasiero.beverage.services;

import java.util.List;
import java.util.UUID;

import com.andreymasiero.beverage.model.Customer;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(UUID id);
    Customer save(Customer customer);
}
