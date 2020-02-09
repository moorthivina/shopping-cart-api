package com.example.shoppingcartapi.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "order_details")
public class OrderDetails {

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "product_id")
	private Long productId;
	
	@Column(name = "product_price")
	private Long productPrice;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id")
	private Orders orders;
}
