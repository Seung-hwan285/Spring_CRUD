package net.codejava.contact.dao;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import net.codejava.contact.model.Contact;

class ContactDAOTest {

	
	private DriverManagerDataSource dataSource;
	
	private ContactDAO dao;
	
	@Test
	void testSave() {
		dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb");
		dataSource.setUsername("root");
		dataSource.setPassword("6216sj");
		
		
		dao=new ContactDAOImpl(dataSource);
		
		Contact contact=new Contact("Steve Jobs","steve@apple.com","Cupertino,CA","010-123-456");
		int result =dao.save(contact);
		assertTrue(result >0);
		
	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testGet() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testList() {
		fail("Not yet implemented");
	}

}
