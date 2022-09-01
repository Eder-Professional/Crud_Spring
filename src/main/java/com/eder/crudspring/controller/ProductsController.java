package com.eder.crudspring.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.eder.crudspring.model.Product;
import com.eder.crudspring.repo.ProductRepo;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductsController {

  private final ProductRepo productRepo;
  
  @GetMapping
  public @ResponseBody List<Product> list() {

    return productRepo.findAll();
  }

  @PostMapping
  @ResponseStatus(code = HttpStatus.CREATED)
  public Product create(@RequestBody Product product){
    
    return productRepo.save(product);

  }

}
