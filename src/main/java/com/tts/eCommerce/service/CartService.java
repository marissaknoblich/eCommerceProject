package com.tts.eCommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.eCommerce.model.Product;
import com.tts.eCommerce.repository.ProductRepository;

@Service
public class CartService {
	

	 public ProductRepository getProductRepository() {
		return productRepository;
	}

	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Autowired
	private ProductRepository productRepository;
	 
	 public List<Product> findAll() {
			return productRepository.findAll();
		}

	public Optional<Product> findById(Long id) {
		return productRepository.findById(id);
	}

	public List<Product> findByBrand(String brand) {
		return productRepository.findByBrand(brand);
	}

	public List<Product> findByCatergory(String category) {
		return productRepository.findByCatergory(category);
	}

	public List<Product> findByBrandAndCategory(String brand, String category) {
		return productRepository.findByBrandAndCategory(brand, category);
	}

	public List<String> findDistinctBrands() {
		return productRepository.findDistinctBrands();
	}

	public List<String> findDistinctCategories() {
		return productRepository.findDistinctCategories();
	}

	public <S extends Product> S save(S entity) {
		return productRepository.save(entity);
	}

	public <S extends Product> Iterable<S> saveAll(Iterable<S> entities) {
		return productRepository.saveAll(entities);
	}

	public boolean existsById(Long id) {
		return productRepository.existsById(id);
	}

	public Iterable<Product> findAllById(Iterable<Long> ids) {
		return productRepository.findAllById(ids);
	}

	public long count() {
		return productRepository.count();
	}

	public void deleteById(Long id) {
		productRepository.deleteById(id);
	}

	public void delete(Product entity) {
		productRepository.delete(entity);
	}

	public void deleteAll(Iterable<? extends Product> entities) {
		productRepository.deleteAll(entities);
	}

	public void deleteAll() {
		productRepository.deleteAll();
	}

}
