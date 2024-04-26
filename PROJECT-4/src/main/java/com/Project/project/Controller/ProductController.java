package com.Project.project.Controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Project.project.Model.Product;
import com.Project.project.Service.ProductServiceImpl;

@Controller
public class ProductController {
	
	@Autowired
	ProductServiceImpl service;
	
	@GetMapping("/")
	public String frontpage() {
		
		return "front page";
	}
	
	@GetMapping("/index")
	public String index() {
		
		return "index";
	}
	
	@GetMapping("/home")
	public String home() {
		
		return "home";
			
			
		}
	
	@GetMapping("/book/log")
	public String book() {
		
		return "booking";
	}
	
	
	@GetMapping("/products")
	private ModelAndView getAllUsers(@Param("keyword") String keyword) {
		
		ModelAndView modelandview=new ModelAndView();
		
		//String keyword="apple";
		
		List<Product> products=service.getAllUser(keyword);
		modelandview.addObject("products",products);
		modelandview.setViewName("view");

		return modelandview;
		
		
		/*List<Product> products=service.getAllUser(keyword);
		model.addAttribute("products",products);
		return "view";*/
		
	}
	
	@GetMapping("/products/create")
	private ModelAndView createProduct() {
		
		ModelAndView modelandview=new ModelAndView();
		modelandview.setViewName("CreateProduct");
		
		return modelandview;
		
	}
	
    @GetMapping("/login")
	private ModelAndView Productsave(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("brand") String brand,@RequestParam("category") String category,@RequestParam("price") double price)
	
	{
		
		service.usersave(id, name, brand, category, price);

		
		ModelAndView modelandview=new ModelAndView();
		
		modelandview.setViewName("saveProduct");
		
		Product chlogin=new Product();
		
		chlogin.setId(id);
		chlogin.setName(name);
		chlogin.setBrand(brand);
		chlogin.setCategory(category);
		chlogin.setPrice(price);
		
		modelandview.addObject("save",chlogin);
		
		return modelandview;

	}
    
    @GetMapping("/products/edit{id}")
    
    private ModelAndView editProduct(@RequestParam("id") int id) {
    	
		ModelAndView modelandview=new ModelAndView();
		
		modelandview.setViewName("editProduct");
		
		Product login=service.Edit(id);
		modelandview.addObject("edit",login);
		
		return modelandview;
    	
    }
    
    @GetMapping("/products/delete{id}")
    
    private ModelAndView deleteProduct(@RequestParam("id") int id) {
    	
		ModelAndView modelandview=new ModelAndView();
		
		modelandview.setViewName("deleteProduct");
		
		Product Prlogin=service.delete(id);
		modelandview.addObject("delete",Prlogin);
		
		return modelandview;

    	
    	
    }
    
    
}

		
	
	


