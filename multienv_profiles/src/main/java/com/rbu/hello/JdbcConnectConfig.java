package com.rbu.hello;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JdbcConnectConfig {
	@Value("${url}")
	private String dburl;
	@Value("${driver-class-name}")
	private String dbdriver;
	@Value("${dbuser}")
	private String dbusername;
	@Value("${password}")
	private String dbpassword;

	@Bean
	public Connection cerateCon() {
		try {
			Class.forName(dbdriver);
			Connection con = DriverManager.getConnection(dburl, dbusername, dbpassword);
			System.out.println(con);
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
