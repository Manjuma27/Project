package com.Project.project.Repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Project.project.Model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
	
	@Query("SELECT p FROM Product p WHERE p.name LIKE %?1%"
			+ "OR p.brand LIKE %?1%"
			+ "OR p.category LIKE %?1%")
	public List<Product> findAll(String keyword);
}
