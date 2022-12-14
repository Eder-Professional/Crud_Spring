package com.eder.crudspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
@Table(name = "produtos") 
public class Product {
  
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  @JsonProperty("_id")
  private Long id;

  @Column( length = 200, nullable = false )
  private String name;

  @Column( length = 100, nullable = true )
  private String description;

  @Column( length = 20, nullable = false )
  private String price;

  @Column( length = 10, nullable = false )
  private String category;


}
