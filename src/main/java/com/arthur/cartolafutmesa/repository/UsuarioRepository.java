package com.arthur.cartolafutmesa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthur.cartolafutmesa.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Usuario findById(long id);

}