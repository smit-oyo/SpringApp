package com.DemoApp.SpringApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.DemoApp.SpringApp.entity.customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<customer, Integer> {
}
