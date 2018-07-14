package com.lts.login.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lts.login.domain.Login;

public interface LoginDao extends JpaRepository<Login, Long> {
	
	List<Login> findByUsername(String username);
	
	Page<Login> findByUsername(String username, Pageable pageable);
	
	Login findByRol(String rol);

}
