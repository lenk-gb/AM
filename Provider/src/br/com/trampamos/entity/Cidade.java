package br.com.trampamos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "HRL_CIDADE")
@SequenceGenerator(name = "seq_cidade", sequenceName = "SQ_HRL_CIDADE", allocationSize = 1)
public class Cidade {

	@Id
	@Column(name = "cd_cidade")
	private int codigoCidade;

	@Column(name = "ds_cidade", nullable = false, length = 50)
	private String cidade;
	
	@Column(name = "cd_estado", nullable = false)
	private Estado estado;

	public int getCodigoCidade() {
		return codigoCidade;
	}

	public void setCodigoCidade(int codigoCidade) {
		this.codigoCidade = codigoCidade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	
	
}
