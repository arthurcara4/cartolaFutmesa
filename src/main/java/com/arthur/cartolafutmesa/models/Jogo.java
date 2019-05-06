package com.arthur.cartolafutmesa.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Jogo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ManyToOne
    @JoinColumn
    private Rodada rodada;
	
	@ManyToOne
    @JoinColumn
    private Equipe equipeMandante;
	
	@ManyToOne
    @JoinColumn
    private Equipe equipeVisitante;
	
	private int pontuacaoMandante;
	private int pontuacaoVisitante;

	
	
	public Jogo(){
	}
	
	public Jogo(Equipe equipeMandante, Equipe equipeVisitante, Rodada rodada){
		this.equipeMandante = equipeMandante;
		this.equipeVisitante = equipeVisitante;
		this.rodada = rodada;
	}
	
	public Jogo(Equipe equipeMandante, Equipe equipeVisitante, Rodada rodada, int pontuacaoMandante, int pontuacaoVisitante){
		this.equipeMandante = equipeMandante;
		this.equipeVisitante = equipeVisitante;
		this.rodada = rodada;
		this.pontuacaoMandante = pontuacaoMandante;
		this.pontuacaoVisitante = pontuacaoVisitante;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Rodada getRodada() {
		return rodada;
	}

	public void setRodada(Rodada rodada) {
		this.rodada = rodada;
	}

	public Equipe getEquipeMandante() {
		return equipeMandante;
	}

	public void setEquipeMandante(Equipe equipeMandante) {
		this.equipeMandante = equipeMandante;
	}

	public Equipe getEquipeVisitante() {
		return equipeVisitante;
	}

	public void setEquipeVisitante(Equipe equipeVisitante) {
		this.equipeVisitante = equipeVisitante;
	}

	public int getPontuacaoMandante() {
		return pontuacaoMandante;
	}

	public void setPontuacaoMandante(int pontuacaoMandante) {
		this.pontuacaoMandante = pontuacaoMandante;
	}

	public int getPontuacaoVisitante() {
		return pontuacaoVisitante;
	}

	public void setPontuacaoVisitante(int pontuacaoVisitante) {
		this.pontuacaoVisitante = pontuacaoVisitante;
	}
	


}
