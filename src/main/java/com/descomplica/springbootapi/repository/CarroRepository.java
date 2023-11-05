package com.descomplica.springbootapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.descomplica.springbootapi.entity.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long>{

}
