package com.example.shoppingcartapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.shoppingcartapi.domain.Orders;

@Component
public interface OrdersRepositories extends CrudRepository<Orders, Long> {

}
