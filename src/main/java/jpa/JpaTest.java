package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManager manager = EntityManagerHelper.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();


		try {
			Person p = new Person();
			p.setFirstname("Arthur");
			manager.persist(p);

		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();


		manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		//		factory.close();
	}


}
