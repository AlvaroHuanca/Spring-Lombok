package com.lts.login.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lts.login.dao.LoginDao;
import com.lts.login.domain.Login;

@RestController
@RequestMapping(value = "/login")
public class LoginCtrl {
	
	@Autowired
	LoginDao loginDao;
	
	@PostMapping
	Login save(@RequestBody Login login) {
		loginDao.save(login);
		return login;
	}
	
	@GetMapping
	Page<Login> get(Pageable pageable){
		Page<Login> login= loginDao.findAll(pageable);
		return login;
	}
	
	@GetMapping(value = "/{rol}")
	Login getOne(
			@PathVariable("rol")String rol) {
		Login login= loginDao.findByRol(rol);
		return login;
	}
	
}
