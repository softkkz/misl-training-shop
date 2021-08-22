package it.training.shop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.training.shop.model.ProductModel;
import it.training.shop.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public List<ProductModel> getAll(){
		return productRepository.findAll();
	}
	
	public ProductModel getById(int id) {
		Optional<ProductModel> modelOpt = productRepository.findById(id);
		
		if(modelOpt.isPresent()) {
			return modelOpt.get();
		}else {
			return null;
		}
		
	}
	
	public ProductModel addProduct(ProductModel product) {
		return productRepository.save(product);
	}
	
	public ProductModel updateProduct(ProductModel product) {
		return productRepository.save(product);
	}
	
	public boolean deleteProduct(ProductModel product) {
		productRepository.delete(product);
		return true;
	}
	
}
