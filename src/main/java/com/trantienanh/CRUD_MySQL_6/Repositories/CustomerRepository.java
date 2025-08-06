package com.trantienanh.CRUD_MySQL_6.Repositories;

import com.trantienanh.CRUD_MySQL_6.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
