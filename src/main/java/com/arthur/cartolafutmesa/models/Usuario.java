package com.arthur.cartolafutmesa.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String login;
	private String senha;
	private String nome_time;
	
	@ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="usuario_jogadores", 
               joinColumns=  @JoinColumn( name = "usuario_id"), 
               inverseJoinColumns= @JoinColumn(name = "jogador_id") )
	private Set<Jogador> jogadores = new HashSet<Jogador>(); 
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome_time() {
		return nome_time;
	}
	public void setNome_time(String nome_time) {
		this.nome_time = nome_time;
	}
	

}
