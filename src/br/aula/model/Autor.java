package br.aula.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name = "CAD_AUTOR")
public class Autor {
	@Id
	@GeneratedValue
	@Column(name = "aut_id")
	private Long idAutor;
	
	@Column(name = "aut_nome", nullable = true, length = 45)
	private String nome;
	
	@OneToMany(mappedBy = "autor")
	private List<Livro> livros = new ArrayList<>();
	

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public Long getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(Long idAutor) {
		this.idAutor = idAutor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
