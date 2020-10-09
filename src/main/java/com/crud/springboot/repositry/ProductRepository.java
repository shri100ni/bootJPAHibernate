package com.crud.springboot.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.springboot.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
