package com.arthur.cartolafutmesa.models;

import java.io.Serializable;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Equipe implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nome;
	
	@OneToMany(mappedBy = "equipe", cascade = CascadeType.ALL)
    private Set<Jogador> jogadores;
	
	public Equipe(String nome, Jogador... jogadores) {
        this.nome = nome;
        this.jogadores = Stream.of(jogadores).collect(Collectors.toSet());
        this.jogadores.forEach(x -> x.setEquipe(this));
    }
	
	public Equipe(String nome) {
        this.nome = nome;
    }

	public Equipe() {
    }
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
