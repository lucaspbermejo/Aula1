package br.aula.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CAD_USUARIO")
public class Usuario {
	@Id
	@GeneratedValue
	@Column(name = "usu_id")
	private Long idUsuario;
	
	@Column(name = "usu_username", nullable = true, length = 45)
	private String username;
	
	@Column(name = "usu_email", nullable = true, length = 45)
	private String email;

	@Column(name = "usu_password", nullable = true, length = 45)
	private String password;

	@OneToMany(mappedBy = "emprestimo")
	private List<Emprestimo> Emprestimo = new ArrayList<>();
	

	@OneToMany(mappedBy = "review")
	private List<Usuario> usuario = new ArrayList<>();
	
	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	public List<Emprestimo> getEmprestimo() {
		return Emprestimo;
	}

	public void setEmprestimo(List<Emprestimo> emprestimo) {
		Emprestimo = emprestimo;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
