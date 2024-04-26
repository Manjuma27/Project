package com.Project.project.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.project.Model.Count;

public interface CountRepository extends JpaRepository<Count,Serializable> {

}
