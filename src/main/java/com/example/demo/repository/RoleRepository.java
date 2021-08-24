package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entirty.Role;
import com.example.demo.entirty.User;

@Repository
public interface RoleRepository  extends JpaRepository<Role, Integer>{
	
//	@Query("select u from Role u where u.name=:name")
	public User findByName( String name);
	
}
