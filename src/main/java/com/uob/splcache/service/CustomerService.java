package com.uob.splcache.service;

import com.uob.splcache.model.Customer;
import com.uob.splcache.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("CustomerService")
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @CachePut(value = "CUSTOMER_KEY")
    public Map<String, Object> findAllCustomers(){
        Map<String, Object> map = new HashMap<>();
        List<Customer> customers = customerRepository.findAll();
        map.put("CUSTOMER",customers);
        return map;
    }
}
