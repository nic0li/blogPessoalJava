package org.generation.blogPessoal.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioLogin {
	
	private long id;

	private String nome;

	private String nomeDeUsuario;

	private String senha;

	private String foto;
	
	private String tipo;
	
	private String token;

}
