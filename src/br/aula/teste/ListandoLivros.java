package br.aula.teste;

import org.hibernate.Session;

import br.aula.db.HibernateFactory;
import br.aula.model.Livro;

public class ListandoLivros {

	public static void main(String[] args) {

		Session s = HibernateFactory
					.configureSessionFactory()
					.openSession();

		Livro livro = (Livro) s.get(Livro.class, 1l);
		System.out.println(livro.getTitulo()
				+ " : " + livro.getAutor().getNome());
	}
}
