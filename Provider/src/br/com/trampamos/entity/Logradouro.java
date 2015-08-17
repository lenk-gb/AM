package br.com.trampamos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "HRL_LOGRADOURO")
@SequenceGenerator(name = "seq_logradouro", sequenceName = "SQ_HRL_LOGRADOURO", allocationSize = 1)
public class Logradouro {
	
	@Id
	@Column(name = "cd_logradouro")
	private int codigoLogradouro;
	
	@Column(name = "ds_logradouro", nullable = false, length = 100)
	private String logradouro;
	
	@Column(name = "cd_bairro", nullable = false)
	private Bairro bairro;

	public int getCodigoLogradouro() {
		return codigoLogradouro;
	}

	public void setCodigoLogradouro(int codigoLogradouro) {
		this.codigoLogradouro = codigoLogradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	
	

}
