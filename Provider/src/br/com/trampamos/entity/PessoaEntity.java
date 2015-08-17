package br.com.trampamos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "HRL_PESSOA")
@SequenceGenerator(name = "seq_pessoa", sequenceName = "SQ_HRL_PESSOA", allocationSize = 1)
public class PessoaEntity {
	
	@Id
	@Column(name = "cd_pessoa")
	private int codigo;
	
	@Column(name = "nm_nome", nullable = false, length = 40)
	private String nome;
	
	@Column(name = "nm_sobrenome", nullable = false, length = 40)
	private String sobrenome;
	
	@Column(name = "ds_email", nullable = false, length = 100)
	private String email;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
