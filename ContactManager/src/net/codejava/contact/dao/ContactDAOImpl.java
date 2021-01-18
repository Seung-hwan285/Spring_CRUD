package net.codejava.contact.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import net.codejava.contact.model.Contact;

public class ContactDAOImpl implements ContactDAO {

	
	//jdbc 템플릿
	private JdbcTemplate jdbcTemplate;
	
	
	public ContactDAOImpl(DataSource dataSource) {
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}
	
	
	public int save(Contact contact) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	public int update(Contact contact) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Contact get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Contact> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
