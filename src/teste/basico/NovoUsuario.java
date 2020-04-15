package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
	
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario user1 = new Usuario("Alexandre", "junior@teste.com.br");
		Usuario user2= new Usuario("Vitor", "vitor@teste.com.br");
		Usuario user3 = new Usuario("Tathi Crush", "tathi@teste.com.br");
		
		em.getTransaction().begin();
		em.persist(user1);
		em.persist(user2);
		em.persist(user3);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}

}
