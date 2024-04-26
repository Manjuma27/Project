package com.Project.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.project.Model.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
