package com.lts.login.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;

@Data
@Entity
public class Login {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Long id;
	
	@Column(unique=true, nullable=false)
	private String username;
	
	private String clave;
	
	private String rol;
}
