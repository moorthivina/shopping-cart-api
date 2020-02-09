package com.example.shoppingcartapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoppingcartapi.entity.OrderRequest;

@RestController
@RequestMapping("/cart")
public class ShoppingCartController {

	@Autowired
	private ShoppingCartService shoppingCartService;
	
	@PostMapping("/submit")
	public void submitOrder(@RequestBody OrderRequest request) {
		shoppingCartService.submitOrder(request);
	}
}
