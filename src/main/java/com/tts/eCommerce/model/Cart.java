package com.tts.eCommerce.model;

import java.util.HashMap;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private List<HashMap<Product, Integer>> cartItems;
	private Double subtotal;

	public Cart() {}

	public Cart(List<HashMap<Product, Integer>> cartItems, Double subtotal) {
		super();
		this.cartItems = cartItems;
		this.subtotal = subtotal;
	}

	public List<HashMap<Product, Integer>> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<HashMap<Product, Integer>> cartItems) {
		this.cartItems = cartItems;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Long getId() {
		return id;
	}

}
