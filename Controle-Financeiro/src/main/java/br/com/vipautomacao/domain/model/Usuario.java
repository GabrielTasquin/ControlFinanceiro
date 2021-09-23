package br.com.vipautomacao.domain.model;

import java.time.OffsetDateTime;

import lombok.Data;

@Data
public class Usuario {

	private Integer codigo;
	private String nome;
	private String email;
	private String senha;
	private OffsetDateTime dataNascimento;
	private String sexo;
}
