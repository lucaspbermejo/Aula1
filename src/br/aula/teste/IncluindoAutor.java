package br.aula.teste;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.aula.db.HibernateFactory;
import br.aula.model.Autor;

public class IncluindoAutor {

	public static void main(String[] args) {

		Session s = HibernateFactory
					.configureSessionFactory()
					.openSession();

		Autor autor = new Autor();
		autor.setNome("Paulo Coelho");

		Transaction t = s.beginTransaction();
		s.save(autor);
		t.commit();
	}
}
