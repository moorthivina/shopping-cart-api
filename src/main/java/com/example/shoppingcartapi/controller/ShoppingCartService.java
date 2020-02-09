package com.example.shoppingcartapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoppingcartapi.domain.OrderDetails;
import com.example.shoppingcartapi.domain.Orders;
import com.example.shoppingcartapi.entity.OrderRequest;
import com.example.shoppingcartapi.repositories.OrdersRepositories;

@Service
public class ShoppingCartService {

	private static int orderDeatilsId = 1;
	@Autowired
	private OrdersRepositories ordersRepositories;
	
	public void submitOrder(OrderRequest request) {
		Orders orders = new Orders();
		orders.setOrderId(request.getOrderId());
		orders.setTotalPrice(request.getOrderTotal());
		List<OrderDetails> orderDetails = new ArrayList<>();
		
		request.getOrderDetails().forEach(a -> {
			OrderDetails detail = new OrderDetails();
			detail.setId(new Long(orderDeatilsId++));
			detail.setProductId(a.getProductId());
			detail.setProductPrice(a.getProductPrice());
			detail.setOrders(orders);
			orderDetails.add(detail);
		});
		
		orders.setOrderDetails(orderDetails);
		ordersRepositories.save(orders);
	}
}
