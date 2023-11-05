package org.generation.blogPessoal.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_postagem")
public class Postagem {
	
	@OneToMany(mappedBy = "postagem", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties({"postagem"})
	private List<Comentario> comentario;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	@NotNull
	@Size(max = 1000)
	private String texto;

	@NotNull
	@Size(max = 200)
	private String titulo;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;
	
	public List<Comentario> getComentario() {
		return comentario;
	}
	
	public Date getData() {
		return data;
	}
	
	public long getId() {
		return id;
	}
	
	public Tema getTema() {
		return tema;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setComentario(List<Comentario> comentario) {
		this.comentario = comentario;
	}
	
	public void setData(Date data) {
		this.data = data;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
