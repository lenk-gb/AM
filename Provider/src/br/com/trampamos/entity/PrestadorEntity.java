package br.com.trampamos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "HRL_PRESTADOR")
@SequenceGenerator(name = "seq_prestador", sequenceName = "SQ_HRL_PRESTADOR", allocationSize = 1)
public class PrestadorEntity {
	
	@Column(name = "cd_pessoa")
	private int codigoPessoa;

	@Column(name = "cd_logradouro")
	private int codigoLogradouro;
	
	@Column(name = "ds_cep", nullable = false, length = 11)
	private String cep;
}
