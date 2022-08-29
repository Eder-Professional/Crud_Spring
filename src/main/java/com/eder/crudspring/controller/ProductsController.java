package com.eder.crudspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eder.crudspring.model.Product;
import com.eder.crudspring.repo.ProductRepo;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/projects")
@AllArgsConstructor
public class ProductsController {

  private final ProductRepo productRepo;
  
  @GetMapping
  public List<Product> list() {

    return productRepo.findAll();
  }
}
