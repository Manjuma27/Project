package com.Project.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.project.Model.Product;
import com.Project.project.Model.User;
import com.Project.project.Repository.UserRepository;

@Service
public class UserServiceImpl {
	
	@Autowired
	UserRepository userrepository;

	public User usersave(int phone, String name, String brand, String product, String address) {
     
		User user=new User();
		user.setPhone(phone);
		user.setName(name);
		user.setProduct(product);
		user.setBrand(brand);
		user.setAddress(address);
		return userrepository.save(user);
		

		
	}

	public List<User> getAllUser() {
		
		return userrepository.findAll();
	}
	
	/*public User Save(int phone,String name,String product,String brand,String address) {
		
		User user=new User();
		return null;*/
		
		
	}
	


