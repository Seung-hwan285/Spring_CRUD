package net.codejava.contact.dao;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import net.codejava.contact.model.Contact;

class ContactDAOTest {

	
	private DriverManagerDataSource dataSource;
	
	private ContactDAO dao;
	
	
	@BeforeEach
	void setupBeforeEach() {
		dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb?useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("6216sj");
		
		
		dao=new ContactDAOImpl(dataSource);
	
	}
	
	@Test
	void testSave() {
		Contact contact=new Contact("Bill Gates","bill@naver.com","Random,WA","010-334-556");
		int result =dao.save(contact);
		assertTrue(result >0);
	}

	@Test
	void testUpdate() {
		Contact contact=new Contact(4,"Bill Gates","bill@naet.com","Random,WA","010-334-556");
		int result=dao.update(contact);
		
		assertTrue(result>0);
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
