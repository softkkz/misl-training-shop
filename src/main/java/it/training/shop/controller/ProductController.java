package it.training.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import it.training.shop.model.ProductModel;
import it.training.shop.service.ProductService;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping("/shop")
public class ProductController {

	@Autowired
	public ProductService productService;
	
	@GetMapping("/product")
	public ResponseEntity<List<ProductModel>> getAll(){
		List<ProductModel> result = productService.getAll();
		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<ProductModel> getById(@PathVariable int id){
		ProductModel result = productService.getById(id);
		return ResponseEntity.ok(result);
	}
	
	@PostMapping("/product")
	public ResponseEntity<ProductModel> addProduct(@RequestBody ProductModel product){
		ProductModel result = productService.addProduct(product);
		return ResponseEntity.ok(result);
	}
	
	@PutMapping("/product")
	public ResponseEntity<ProductModel> updateProduct(@RequestBody ProductModel product){
		
		if(product != null) {
			ProductModel model = productService.getById(product.getProductId());
			
			if(model != null) {
				ProductModel result = productService.updateProduct(product);
				return ResponseEntity.ok(result);
			}
		}
		
		return ResponseEntity.badRequest().build();
	}
	
	@DeleteMapping("/product")
	public ResponseEntity<ProductModel> deleteProduct(@RequestBody ProductModel product){
		productService.deleteProduct(product);
		return ResponseEntity.noContent().build();
	}
	
}
