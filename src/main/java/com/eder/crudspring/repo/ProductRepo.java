package com.eder.crudspring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eder.crudspring.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
  
}
