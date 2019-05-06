package com.arthur.cartolafutmesa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthur.cartolafutmesa.models.Rodada;

public interface RodadaRepository extends JpaRepository<Rodada, Long>{
	
	Rodada findById(long Id);

}
