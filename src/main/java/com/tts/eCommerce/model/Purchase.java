package com.tts.eCommerce.model;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private List<HashMap<Product, Integer>> purchaseItems;
	private Double subtotal;
	private Double salesTax;
	private Double shipping;
	private Double grandTotal;
	private User buyer;
	private String deliveryStreetAddress;
	private String deliveryCityState;
	@CreationTimestamp
	private Date createdAt;

	public Purchase() {
	}

	public Purchase(List<HashMap<Product, Integer>> purchaseItems, Double subtotal, Double salesTax, Double shipping,
			Double grandTotal, User buyer, String deliveryStreetAddress, String deliveryCityState, Date createdAt) {
		this.purchaseItems = purchaseItems;
		this.subtotal = subtotal;
		this.salesTax = salesTax;
		this.shipping = shipping;
		this.grandTotal = grandTotal;
		this.buyer = buyer;
		this.deliveryStreetAddress = deliveryStreetAddress;
		this.deliveryCityState = deliveryCityState;
		this.createdAt = createdAt;
	}

	public List<HashMap<Product, Integer>> getPurchaseItems() {
		return purchaseItems;
	}

	public void setPurchaseItems(List<HashMap<Product, Integer>> purchaseItems) {
		this.purchaseItems = purchaseItems;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Double getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(Double salesTax) {
		this.salesTax = salesTax;
	}

	public Double getShipping() {
		return shipping;
	}

	public void setShipping(Double shipping) {
		this.shipping = shipping;
	}

	public Double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public String getDeliveryStreetAddress() {
		return deliveryStreetAddress;
	}

	public void setDeliveryStreetAddress(String deliveryStreetAddress) {
		this.deliveryStreetAddress = deliveryStreetAddress;
	}

	public String getDeliveryCityState() {
		return deliveryCityState;
	}

	public void setDeliveryCityState(String deliveryCityState) {
		this.deliveryCityState = deliveryCityState;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Long getId() {
		return id;
	}

}
