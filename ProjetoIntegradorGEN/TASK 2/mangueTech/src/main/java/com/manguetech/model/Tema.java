package com.manguetech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tema")
public class Tema {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Size(min = 5, max = 255)
	private String descricao;

	@NotNull
	// @Column (name="quantidade_postagens")
	private String quantidadePostagens;

	@NotNull
	// @Column (name="tendencia_semana")
	private String tendenciaSemana;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getQuantidadePostagens() {
		return quantidadePostagens;
	}

	public void setQuantidadePostagens(String quantidadePostagens) {
		this.quantidadePostagens = quantidadePostagens;
	}

	public String getTendenciaSemana() {
		return tendenciaSemana;
	}

	public void setTendenciaSemana(String tendenciaSemana) {
		this.tendenciaSemana = tendenciaSemana;
	}

}
