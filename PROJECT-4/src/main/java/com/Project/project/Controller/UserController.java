package com.Project.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Project.project.Model.Product;
import com.Project.project.Model.User;
import com.Project.project.Service.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	UserServiceImpl userservice;
	
	@RequestMapping("/book")
	public String order() {
		
		return "order";
	}
	
	
	
    @GetMapping("/order/product")
	private ModelAndView Productsave(@RequestParam("phone") int phone,@RequestParam("name") String name,@RequestParam("brand") String brand,@RequestParam("product") String product,@RequestParam("address") String address)
	
	{
		
		userservice.usersave(phone, name, brand, product, address);

		
		ModelAndView modelandview=new ModelAndView();
		User order=new User();
		
		order.setPhone(phone);
		order.setName(name);
		order.setProduct(product);
		order.setBrand(brand);
		order.setAddress(address);
		
		modelandview.setViewName("orderProduct");
		
		modelandview.addObject("order",order);
		
		return modelandview;	
	}
    
	@GetMapping("/booking/list")
	private ModelAndView getAll() {
		
		ModelAndView modelandview=new ModelAndView();
		modelandview.setViewName("OrderList");
				
		List<User> list=userservice.getAllUser();
		modelandview.addObject("list",list);
		return modelandview;


}
	
	@GetMapping("/contact")
	private ModelAndView Contact() {
		
		ModelAndView modelandview=new ModelAndView();
		modelandview.setViewName("Contact");
		
		return modelandview;


	}
	
	@GetMapping("/homePage")
	private ModelAndView homePage() {
		
		ModelAndView modelandview=new ModelAndView();
		modelandview.setViewName("front page");
		
		return modelandview;


	}

}