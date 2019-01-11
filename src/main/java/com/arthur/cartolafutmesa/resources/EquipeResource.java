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

import com.arthur.cartolafutmesa.models.Equipe;
import com.arthur.cartolafutmesa.repository.EquipeRepository;

@RestController
@RequestMapping(value="/cartola")
public class EquipeResource {
	
	@Autowired
	EquipeRepository equipeRepository;
	
	@GetMapping("/equipes")
	public List<Equipe> listaEquipes(){
		return equipeRepository.findAll();
	}
	
	@GetMapping("/equipe/{id}")
	public Equipe listaEquipeUnica(@PathVariable(value="id")long id){
		return equipeRepository.findById(id);
	}
	
	@PostMapping("/equipe")
	public Equipe salvaEquipe(@RequestBody Equipe equipe){
		return equipeRepository.save(equipe);
	}
	
	@DeleteMapping("/equipe")
	public void deletaEquipe(@RequestBody Equipe equipe){
		equipeRepository.delete(equipe);;
	}
	
	@PutMapping("/equipe")
	public Equipe atualizaEquipe(@RequestBody Equipe equipe){
		return equipeRepository.save(equipe);
	}

}
