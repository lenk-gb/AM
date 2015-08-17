package br.com.trampamos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "HRL_BAIRRO")
@SequenceGenerator(name = "seq_bairro", sequenceName = "SQ_HRL_BAIRRO", allocationSize = 1)
public class Bairro {
	
	@Id
	@Column(name = "cd_bairro")
	private int codigoBairro;
	
	@Column(name = "ds_bairro", nullable = false, length = 50)
	private String bairro;
	
	@Column(name = "cd_cidade", nullable = false)
	private Cidade cidade;

	public int getCodigoBairro() {
		return codigoBairro;
	}

	public void setCodigoBairro(int codigoBairro) {
		this.codigoBairro = codigoBairro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	
	

}
