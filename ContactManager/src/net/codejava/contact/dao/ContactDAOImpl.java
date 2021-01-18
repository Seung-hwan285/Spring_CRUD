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
	
	
	public int save(Contact c) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO Contact (name,email,address,phone) VALUES (?,?,?,?)";
		
		return jdbcTemplate.update(sql,c.getName(),c.getEmail(),c.getAddress(),c.getPhone());
		
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
