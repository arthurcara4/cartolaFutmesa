package com.arthur.cartolafutmesa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthur.cartolafutmesa.models.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe, Long>{
	
	Equipe findById(long Id);

}
