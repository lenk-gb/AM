package br.com.trampamos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "HRL_COMENTARIO")
@SequenceGenerator(name = "seq_comentario", sequenceName = "SQ_HRL_COMENTARIO", allocationSize = 1)
public class ComentarioEntity {

	@Id
	@Column(name = "cd_comentario")
	private int codigoComentario;
	
	@Column(name = "ds_comentario", nullable = false, length = 300)
	private String comentario;
	
	@Column(name = "cd_cliente", nullable = false)
	private PessoaEntity cliente;
	
	@Column(name = "cd_prestador", nullable = false)
	private PessoaEntity prestador;

	public int getCodigoComentario() {
		return codigoComentario;
	}

	public void setCodigoComentario(int codigoComentario) {
		this.codigoComentario = codigoComentario;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public PessoaEntity getCliente() {
		return cliente;
	}

	public void setCliente(PessoaEntity cliente) {
		this.cliente = cliente;
	}

	public PessoaEntity getPrestador() {
		return prestador;
	}

	public void setPrestador(PessoaEntity prestador) {
		this.prestador = prestador;
	}
	
	
	
	
}
