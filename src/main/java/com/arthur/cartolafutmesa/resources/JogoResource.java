package com.arthur.cartolafutmesa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arthur.cartolafutmesa.models.Equipe;
import com.arthur.cartolafutmesa.models.Jogador;
import com.arthur.cartolafutmesa.models.Jogo;
import com.arthur.cartolafutmesa.models.Rodada;
import com.arthur.cartolafutmesa.repository.JogadorRepository;
import com.arthur.cartolafutmesa.repository.JogoRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/cartola")
public class JogoResource {
	
	@Autowired
	JogoRepository jogoRepository;
	
	@GetMapping("/jogos")
	public List<Jogo> listaEquipes(){
		return jogoRepository.findAll();
	}
	
	@GetMapping("/jogo/{id}")
	public Jogo listaJogoUnico(@PathVariable(value="id")long id){
		return jogoRepository.findById(id);
	}
	
	@GetMapping("/rodada/{rodada_id}/jogos")
	public List<Jogo> listaJogosDaRodada(@PathVariable(value="rodada_id")Rodada rodada){
		return jogoRepository.findByRodada(rodada);
	}
	
	@GetMapping("/equipe/{equipe_id}/jogos")
	public List<Jogo> listaJogosDaEquipe(@PathVariable(value="equipe_id")Equipe equipeMandante){
		return jogoRepository.findByEquipe(equipeMandante);
	}
	
	@PostMapping("/jogo")
	public Jogo salvaJogo(@RequestBody Jogo jogo){
		return jogoRepository.save(jogo);
	}
	
	@DeleteMapping("/jogo")
	public void deletaJogo(@RequestBody Jogo jogo){
		jogoRepository.delete(jogo);
	}
	
	@PutMapping("/jogo")
	public Jogo atualizaJogo(@RequestBody Jogo jogo){
		return jogoRepository.save(jogo);
	}

}
