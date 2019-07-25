package com.arthur.cartolafutmesa.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Rodada implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private Date dataRodada;
	
	public Rodada(Date dataRodada){
		this.dataRodada = dataRodada;
	}	
	
	public Rodada(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDataRodada() {
		return dataRodada;
	}

	public void setDataRodada(Date dataRodada) {
		this.dataRodada = dataRodada;
	}

}
