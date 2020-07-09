package com.tts.eCommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.eCommerce.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
	public Order findByAll();

}
