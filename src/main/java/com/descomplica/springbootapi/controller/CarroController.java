package com.descomplica.springbootapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.descomplica.springbootapi.entity.Carro;
import com.descomplica.springbootapi.repository.CarroRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/carro")
public class CarroController {
	
	@Autowired
	private CarroRepository carroRepository;
	
//	@GetMapping
//	public String hello() {
//		return "Atividade Pratica 03";
//	}
	
	@GetMapping
	public List<Carro> getAllCarros(){
		return carroRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Carro saveCarro(@RequestBody Carro carro) {
		return carroRepository.save(carro);
	}
	
	@GetMapping (path = {"/{id}"})
	public Carro getCarroById(@PathVariable Long id) {
		return carroRepository.findById(id).get();
	}

	@DeleteMapping(path = {"/{id}"})
	public void deleteCarro(@PathVariable Long id) {
		carroRepository.deleteById(id); 
	}

}
