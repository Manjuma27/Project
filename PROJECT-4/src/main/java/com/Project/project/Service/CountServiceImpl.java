package com.Project.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.project.Repository.CountRepository;

@Service
public class CountServiceImpl {

	@Autowired
	CountRepository Repository;
	
	public long getCountOfEntities() {

		long count = Repository.count();
		return count;

	
	}

}
