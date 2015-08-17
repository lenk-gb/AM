package br.com.trampamos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name ="HRL_RANKING")
@SequenceGenerator(name = "seq_ranking", sequenceName = "SQ_HRL_RANKING", allocationSize = 1)
public class Ranking {
	
	@Id
	@Column(name = "cd_ranking")
	private int codigoRanking;
	
	@Column(name = "cd_cliente", nullable = false)
	private PessoaEntity cliente;
	
	@Column(name = "cd_prestador", nullable = false)
	private PessoaEntity prestador;
	
	@Column(name = "ds_ranking", nullable = false)
	private short ranking;

	public int getCodigoRanking() {
		return codigoRanking;
	}

	public void setCodigoRanking(int codigoRanking) {
		this.codigoRanking = codigoRanking;
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

	public short getRanking() {
		return ranking;
	}

	public void setRanking(short ranking) {
		this.ranking = ranking;
	}

	
	
}
