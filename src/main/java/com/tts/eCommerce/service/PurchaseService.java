package com.tts.eCommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tts.eCommerce.model.Purchase;
import com.tts.eCommerce.repository.PurchaseRepository;

@Service
public class PurchaseService {
	
	@Autowired
	private PurchaseRepository purchaseRepository; public PurchaseRepository getPurchaseRepository() {
		return purchaseRepository;
	}
	public void setPurchaseRepository(PurchaseRepository purchaseRepository) {
		this.purchaseRepository = purchaseRepository;
}
	public <S extends Purchase> S save(S entity) {
		return purchaseRepository.save(entity);
	}
	public <S extends Purchase> Iterable<S> saveAll(Iterable<S> entities) {
		return purchaseRepository.saveAll(entities);
	}
	public Optional<Purchase> findById(Long id) {
		return purchaseRepository.findById(id);
	}
	public boolean existsById(Long id) {
		return purchaseRepository.existsById(id);
	}
	public Iterable<Purchase> findAll() {
		return purchaseRepository.findAll();
	}
	public Iterable<Purchase> findAllById(Iterable<Long> ids) {
		return purchaseRepository.findAllById(ids);
	}
	public long count() {
		return purchaseRepository.count();
	}
	public void deleteById(Long id) {
		purchaseRepository.deleteById(id);
	}
	public void delete(Purchase entity) {
		purchaseRepository.delete(entity);
	}
	public void deleteAll(Iterable<? extends Purchase> entities) {
		purchaseRepository.deleteAll(entities);
	}
	public void deleteAll() {
		purchaseRepository.deleteAll();
	}
	}
