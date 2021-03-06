package com.dio.msspring.repository;

import com.dio.msspring.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findByName(String name);
}
