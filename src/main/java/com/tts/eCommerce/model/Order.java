package com.tts.eCommerce.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "orders")

public class Order {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

	 private String status;
	 
	    @OneToMany(mappedBy = "pk.order")
	  
	 private List<Order> orderProduct = new ArrayList<>();
	 
	    public Double getTotalOrderPrice() {
	        double sum = 0D;
	        List<Order> orderProduct = getNumberOfProduct();
	        for (Order op : orderProduct) {
	            sum += op.getTotalOrderPrice();
	        }
	        return sum;
	    }
	 
	   
	    public int getNumberOfProduct() {
	        return this.orderProduct.size();
	    }
	

}
