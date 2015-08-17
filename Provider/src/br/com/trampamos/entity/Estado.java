package br.com.trampamos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "HRL_ESTADO")
@SequenceGenerator(name = "seq_estado", sequenceName = "SQ_HRL_ESTADO", allocationSize = 1)
public class Estado {
	
	@Id
	@Column(name = "cd_estado")
	private int codigoEstado;
	
	@Column(name = "ds_estado", nullable = false, length = 30)
	private String estado;
	
	@Column(name = "ds_sigla", nullable = false, length = 2)
	private String sigla;

	public int getCodigoEstado() {
		return codigoEstado;
	}

	public void setCodigoEstado(int codigoEstado) {
		this.codigoEstado = codigoEstado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	

}
