package javaspringexamples.springJPA.ExceptionTranslating;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */

@Repository
public class PersonDAOImpl implements PersonDAO {

	@PersistenceUnit
	private EntityManagerFactory emf;

	public void save(Person p) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(p);
		transaction.commit();
		em.close();
	}
}
