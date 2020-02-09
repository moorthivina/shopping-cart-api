package com.example.shoppingcartapi.entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {

	private Long orderId;
	private Long orderTotal;
	private List<OrderedProducts> orderDetails;
	
}
