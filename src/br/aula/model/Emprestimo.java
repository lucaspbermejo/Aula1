package br.aula.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CAD_EMPRESTIMO")
public class Emprestimo {
	
	@Id
	@GeneratedValue
	@Column(name = "emp_id")
	private int idEmp;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "emp_data", nullable = true)
	private Date dataEmprestimo;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dev_data", nullable = true)
	private Date dataDevolucao;
	
	@OneToMany(mappedBy = "emprestimo")
	private List<Livro> livros = new ArrayList<>();
	
	@OneToMany(mappedBy = "emprestimo")
	private List<Usuario> usuario = new ArrayList<>();
	
	
	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public int getIdEmp() {
		return idEmp;
	}

	public void setIdEmp(int idEmp) {
		this.idEmp = idEmp;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	
}
