package com.j_gcp.gcp_service.repository;

import com.j_gcp.gcp_service.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestResource(path = "customers")
public interface CustomerRepository extends JpaRepository<Customer, Long> {}
