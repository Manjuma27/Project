package com.Project.project.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.Project.project.Model.Product;
import com.Project.project.Repository.ProductRepository;

@Service
public class ProductServiceImpl {
	
	@Autowired
	ProductRepository repository;
	
	public List<Product>getAllUser(String keyword){
		
		if(keyword!= null) {
			
			return repository.findAll(keyword);
		}
		
		
		
		return repository.findAll();
				
	}
	
	
	
	public Product usersave(int id,String name,String brand,String category,double price) {
		
		Product log=new Product();
		log.setId(id);
		log.setName(name);
		log.setBrand(brand);
		log.setCategory(category);
		log.setPrice(price);
		
		return repository.save(log);
		
	}
	
	public Product Edit(int id) {
		
		return repository.getById(id);
		
		}


	public Product delete(int id) {
		
		
		 repository.deleteById(id);
		 return null;
		
	}
}
	
		
	


