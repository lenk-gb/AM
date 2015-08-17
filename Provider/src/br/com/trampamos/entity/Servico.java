package br.com.trampamos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "HRL_SERVICO")
@SequenceGenerator(name = "seq_servico", sequenceName = "SQ_HRL_SERVICO", allocationSize = 1)
public class Servico {
	
	@Id
	@Column(name = "cd_servico")
	private int codigoServico;
	
	@Column(name = "cd_pessoa")
	private int codigoPessoa; 
	
	@Column(name ="ds_servico", nullable = false, length = 100)
	private String servico;

	
	
	public int getCodigoServico() {
		return codigoServico;
	}

	public void setCodigoServico(int codigoServico) {
		this.codigoServico = codigoServico;
	}

	public int getCodigoPessoa() {
		return codigoPessoa;
	}

	public void setCodigoPessoa(int codigoPessoa) {
		this.codigoPessoa = codigoPessoa;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}
	
	
	
	

}
