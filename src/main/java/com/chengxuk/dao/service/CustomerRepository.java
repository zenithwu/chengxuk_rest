package com.chengxuk.dao.service;

import com.chengxuk.dao.entity.Customer;
import com.chengxuk.dao.entity.User;
import org.springframework.data.repository.CrudRepository;



// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}