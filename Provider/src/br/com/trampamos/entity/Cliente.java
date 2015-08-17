package br.com.trampamos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "HRL_CLIENTE")
@SequenceGenerator(name = "seq_cliente", sequenceName = "SQ_HRL_CLIENTE", allocationSize = 1)
public class Cliente {
	
	@Column(name = "cd_pessoa")
	private int codigoPessoa;
}
