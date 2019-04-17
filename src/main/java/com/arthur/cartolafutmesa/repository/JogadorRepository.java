package com.arthur.cartolafutmesa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthur.cartolafutmesa.models.Equipe;
import com.arthur.cartolafutmesa.models.Jogador;

public interface JogadorRepository extends JpaRepository<Jogador, Long>{
	
	Jogador findById(long Id);
	List<Jogador> findByEquipe(Equipe equipe);

}
