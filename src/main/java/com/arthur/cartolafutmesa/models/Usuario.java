package com.arthur.cartolafutmesa.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	
	@ManyToMany(fetch = FetchType.EAGER,
	        cascade = {
	                CascadeType.MERGE,
	                CascadeType.REFRESH
	            })
    @JoinTable(name = "usuario_jogador",
            joinColumns = { @JoinColumn(name = "usuario_id") },
            inverseJoinColumns = { @JoinColumn(name = "jogador_id") })
    private Set<Jogador> jogadores = new HashSet<>();
	
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
	public Set<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(Set<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
