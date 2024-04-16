package com.rai.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rai.example.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByName(String name);

}
