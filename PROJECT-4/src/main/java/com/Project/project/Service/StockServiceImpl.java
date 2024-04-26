package com.Project.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.project.Model.Stock;
import com.Project.project.Repository.StockRepository;

@Service
public class StockServiceImpl {
	
	@Autowired
	StockRepository repository;

	public String checkservice(String name, String brand) {
		
		Stock list=findbyDetails(name,brand);
		
		return list.getCategory();
		
		
		
	}

	public Stock findbyDetails(String name,String brand) {
		
		return repository.findbyname(name,brand);
		
		
	}

}
