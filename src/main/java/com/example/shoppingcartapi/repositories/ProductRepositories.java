package com.example.shoppingcartapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.shoppingcartapi.domain.Products;

@Component
public interface ProductRepositories extends CrudRepository<Products, Long>{

}
