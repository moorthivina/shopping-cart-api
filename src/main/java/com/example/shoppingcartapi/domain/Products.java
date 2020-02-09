package com.example.shoppingcartapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "products")
public class Products {

	@Id
	@Column(name = "product_id")
	private Long productId;
	
	@Column(name = "product_name")
	private String product_name;
	
	@Column(name = "product_price")
	private Long productPrice;
}
