package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class RemoverUsuario {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		Usuario usuarioGerenciado = em.find(Usuario.class, 3L);

		if (usuarioGerenciado != null) {
			em.getTransaction().begin();
			em.remove(usuarioGerenciado);
			em.getTransaction().commit();
		}

		emf.close();
		em.close();

	}

}
