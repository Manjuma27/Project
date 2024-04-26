package com.Project.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Project.project.Model.Stock;

public interface StockRepository extends JpaRepository<Stock,Integer> {

	@Query(value="select * from Product p where p.name=:name and p.brand=:brand",nativeQuery=true)
	public Stock findbyname(String name,String brand);
}
