package com.dataprogramming.productService.repository;

import com.dataprogramming.productService.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
