package br.com.trampamos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "HRL_BADGE")
@SequenceGenerator(name = "seq_badge", sequenceName = "SQ_HRL_BADGE", allocationSize = 1)
public class Badge {
	
	@Id
	@Column(name = "cd_badge")
	private int codigoBadge;
	
	@Column(name = "cd_pessoa", nullable = false)
	private PessoaEntity pessoa;
	
	@Column(name = "ds_badge", nullable = false, length = 100)
	private String badge;

	public int getCodigoBadge() {
		return codigoBadge;
	}

	public void setCodigoBadge(int codigoBadge) {
		this.codigoBadge = codigoBadge;
	}

	public PessoaEntity getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaEntity pessoa) {
		this.pessoa = pessoa;
	}

	public String getBadge() {
		return badge;
	}

	public void setBadge(String badge) {
		this.badge = badge;
	}

	
	
}
