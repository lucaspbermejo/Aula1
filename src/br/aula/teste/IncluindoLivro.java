package br.aula.teste;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.aula.db.HibernateFactory;
import br.aula.model.Autor;
import br.aula.model.Livro;

public class IncluindoLivro {

	public static void main(String[] args) {

		Session s = HibernateFactory
					.configureSessionFactory()
					.openSession();

		Autor autor = (Autor) s.get(Autor.class, 3l);
		Livro livro = new Livro();
		livro.setTitulo("Redes de computadores");
		livro.setAutor(autor);

		Transaction t = s.beginTransaction();
		s.save(livro);
		t.commit();
	}
}
