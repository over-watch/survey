package com.watch.survey.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDataSource {
	@Test
	public void getConn(){
	
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationcontext_public.xml");
		DataSource ds=(DataSource)ac.getBean("dataSource");
		try {
			System.out.println(ds.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
