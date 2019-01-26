package br.edu.ifnmg.clindalvo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Servidor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Integer Senha;
	private Integer NumeroSIEPE;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getSenha() {
		return Senha;
	}

	public void setSenha(Integer senha) {
		Senha = senha;
	}

	public Integer getNumeroSIEPE() {
		return NumeroSIEPE;
	}

	public void setNumeroSIEPE(Integer numeroSIEPE) {
		NumeroSIEPE = numeroSIEPE;
	}

}
