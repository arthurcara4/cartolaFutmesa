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

import com.arthur.cartolafutmesa.models.Rodada;
import com.arthur.cartolafutmesa.repository.RodadaRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/cartola")
public class RodadaResource {
	
	@Autowired
	RodadaRepository rodadaRepository;
	
	@GetMapping("/rodadas")
	public List<Rodada> listaEquipes(){
		return rodadaRepository.findAll();
	}
	
	@GetMapping("/rodada/{id}")
	public Rodada listaRodadaUnica(@PathVariable(value="id")long id){
		return rodadaRepository.findById(id);
	}
	
	@PostMapping("/rodada")
	public Rodada salvaEquipe(@RequestBody Rodada rodada){
		return rodadaRepository.save(rodada);
	}
	
	@DeleteMapping("/rodada")
	public void deletaRodada(@RequestBody Rodada rodada){
		rodadaRepository.delete(rodada);
	}
	
	@PutMapping("/rodada")
	public Rodada atualizaEquipe(@RequestBody Rodada rodada){
		return rodadaRepository.save(rodada);
	}

}
