package com.tts.eCommerce.repository;

import javax.persistence.criteria.Order;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
