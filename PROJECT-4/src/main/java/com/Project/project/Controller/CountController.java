package com.Project.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.Project.project.Service.CountServiceImpl;

@Controller
public class CountController {

	@Autowired
	CountServiceImpl Service;
	
	@GetMapping("/list")
	public long countEntities() {
		long count = Service.getCountOfEntities();
		return count;
	}

}
