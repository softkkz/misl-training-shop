package it.training.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.training.shop.model.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, Integer> {

}
