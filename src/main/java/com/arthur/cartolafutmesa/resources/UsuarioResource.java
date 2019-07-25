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

import com.arthur.cartolafutmesa.models.Usuario;
import com.arthur.cartolafutmesa.repository.UsuarioRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/cartola")
public class UsuarioResource {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuarios")
	public List<Usuario> listaUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/usuario/{id}")
	public Usuario listaUsuarioPorId(@PathVariable(value="id")long id){
		return usuarioRepository.findById(id);
	}
	
	
	@PostMapping("/usuario")
	public Usuario salvaUsuario(@RequestBody Usuario usuario){
		return usuarioRepository.save(usuario);
	}
	
	@DeleteMapping("/usuario")
	public void deletaUsuario(@RequestBody Usuario usuario){
		usuarioRepository.delete(usuario);
	}
	
	@PutMapping("/usuario")
	public Usuario atualizaUsuario(@RequestBody Usuario usuario){
		return usuarioRepository.save(usuario);
	}

}
