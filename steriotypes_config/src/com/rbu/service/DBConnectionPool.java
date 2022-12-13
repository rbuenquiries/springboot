package com.rbu.service;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBConnectionPool {
	public DBConnectionPool() {
		System.out.println("DBConnectionPool object created");
	}
	
	//<bean class="BasicDataSource">
	//<property name="DriverClassName" value="oracle.jdbc.OracleDriver"/>
	//</bean>
	@Bean
	public BasicDataSource dataSource() {
		System.out.println("BasicDataSource object created");
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("system");
		dataSource.setPassword("admin");
		return dataSource;
	}

}
