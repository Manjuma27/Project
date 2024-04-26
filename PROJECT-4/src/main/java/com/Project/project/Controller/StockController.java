package com.Project.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Project.project.Service.StockServiceImpl;

@Controller
public class StockController {

	@Autowired
	StockServiceImpl service;
	
	@RequestMapping("/check")
	public String stockcheck() {
		
		return "stock";
		
	}

	
	@GetMapping("/stcheck")
	public String check(@RequestParam("name") String name,@RequestParam("brand") String brand,Model model) {
		
		String product=service.checkservice(name,brand);
		
		String page="";
		
		if(product.equals("Computers")) {
			
			page="computer";
		}
		
		else if(product.equals("Mobiles")) {
			
			page="mobile";
		}
		else {
			
			page="error";
		}
		
		return page;

		
		
		/*ModelAndView modelandview=new ModelAndView();
		
		modelandview.addObject("id",id);

		modelandview.setViewName("result");
		
		return modelandview;*/	
	}

	
	}



