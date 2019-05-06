package com.arthur.cartolafutmesa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arthur.cartolafutmesa.models.Equipe;
import com.arthur.cartolafutmesa.models.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long>{
	
	Jogo findById(long Id);
	
	@Query("SELECT id FROM Jogo where equipe_mandante_id = :equipe or equipe_visitante_id = :equipe") 
	List<Jogo> findByEquipe(@Param("equipe") Equipe equipe);

}