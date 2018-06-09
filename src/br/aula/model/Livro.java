package br.aula.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "CAD_LIVRO")
public class Livro {

	@Id
	@GeneratedValue
	@Column(name = "liv_id")
	private Long idLivro;
	
	@Column(name = "liv_titulo", nullable = true, length = 45)
	private String titulo;
	
	@Column(name = "liv_foto", nullable = true, length = 200)
	private String foto;
	
	@Column(name = "liv_quantidade")
	private int quantidade;
	
	@ManyToOne
	@JoinColumn(name = "id_autor")
	private Autor autor;
	
	@ManyToOne
	@JoinColumn(name = "id_emprestimo")
	private Emprestimo emprestimo;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Long getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(Long idLivro) {
		this.idLivro = idLivro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
