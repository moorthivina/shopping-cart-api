package com.example.shoppingcartapi.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "orders")
public class Orders {

	@Id
	@Column(name = "order_id")
	private Long orderId;
	
	@Column(name = "total_price")
	private Long totalPrice;
	
	@CreationTimestamp
	@Column(name = "order_date")
	private LocalDateTime orderDate;
	
	@OneToMany(mappedBy = "orders", cascade = CascadeType.ALL)
//	@JoinColumn(name = "order_id")
	private List<OrderDetails> orderDetails;
}
