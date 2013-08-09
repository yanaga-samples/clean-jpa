package br.com.yanaga.cleanjpa;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.yanaga.cleanjpa.app.Pessoa;
import br.com.yanaga.cleanjpa.config.AppConfig;

@ContextConfiguration(classes = AppConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationContextIT {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Test
	public void testEmf() {
		assertNotNull(entityManagerFactory);
	}

	@Test
	public void testAttributeConverter() {
		Pessoa pessoa = Pessoa.newInstance();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(pessoa);
		entityManager.flush();
		entityManager.getTransaction().commit();
	}
}