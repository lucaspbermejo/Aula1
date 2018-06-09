package br.aula.teste;

import org.hibernate.Session;

import br.aula.db.HibernateFactory;
import br.aula.model.Autor;

public class CompotamentoPreguicoso {

	
	public static void main(String[] args) {

		Session s = HibernateFactory
					.configureSessionFactory()
					.openSession();

	Autor autor = (Autor) s.get(Autor.class, 3l);
	System.out.println(autor.getNome());
	}
}
