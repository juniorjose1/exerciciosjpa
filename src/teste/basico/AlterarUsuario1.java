package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuarioAlterado = em.find(Usuario.class, 1L);
		usuarioAlterado.setNome("Alexandre Junqueira");
		usuarioAlterado.setEmail("junqueira_26@hotmail.com");
		
		em.merge(usuarioAlterado);
		
		em.getTransaction().commit();
		
		emf.close();
		em.close();
		
	}

}
