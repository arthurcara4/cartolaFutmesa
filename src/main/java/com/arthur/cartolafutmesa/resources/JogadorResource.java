package com.arthur.cartolafutmesa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.arthur.cartolafutmesa.models.Equipe;
import com.arthur.cartolafutmesa.models.Jogador;
import com.arthur.cartolafutmesa.repository.EquipeRepository;
import com.arthur.cartolafutmesa.repository.JogadorRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/cartola")
public class JogadorResource {
	
	@Autowired
	JogadorRepository jogadorRepository;
	
	@GetMapping("/jogadores")
	public List<Jogador> listaEquipes(){
		return jogadorRepository.findAll();
	}
	
	@GetMapping("/jogador/{id}")
	public Jogador listaJogadorUnico(@PathVariable(value="id")long id){
		return jogadorRepository.findById(id);
	}
	
	@GetMapping("/equipe/{equipe_id}/jogadores")
	public List<Jogador> listaJogadoresDaEquipe(@PathVariable(value="equipe_id")Equipe equipe){
		return jogadorRepository.findByEquipe(equipe);
	}
	
	@PostMapping("/jogador")
	public Jogador salvaJogador(@RequestBody Jogador jogador){
		return jogadorRepository.save(jogador);
	}
	
	@DeleteMapping("/jogador")
	public void deletaJogador(@RequestBody Jogador jogador){
		jogadorRepository.delete(jogador);
	}
	
	@PutMapping("/jogador")
	public Jogador atualizaJogador(@RequestBody Jogador jogador){
		return jogadorRepository.save(jogador);
	}

}
