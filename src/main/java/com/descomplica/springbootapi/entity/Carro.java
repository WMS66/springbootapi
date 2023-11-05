package com.descomplica.springbootapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Carro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 public Long id;
	
	 public Integer ano;
	 public String marca;
	 public String modelo;
}
