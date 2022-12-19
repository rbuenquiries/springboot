package com.rbu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	Connection con;
	@Value("${driver}")
	private String driver;
	@Value("${url}")
	private String url;
	@Value("${user}")
	private String user;
	@Value("${password}")
	private String password;

	public StudentDao() {
		System.out.println("StudentDao object step1");
	}

	@PostConstruct
	public void conInit() throws Exception {
		System.out.println("afterPropertiesSet  step3");
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);
	}

	public void saveStudent(int id, String name, String email, String address) {
		// crate table in your database
		// for oracle
		// create table SB_NAVEEN_STUDENTS(id number, name varchar2(500),email
		// varchar2(500),address varchar2(500));
		// for mysql
		// create table SB_NAVEEN_STUDENTS(id integer, name varchar(500),email
		// varchar(500),address varchar(500));

		try {
			Statement statement = con.createStatement();
			statement.executeUpdate("insert into SB_NAVEEN_STUDENTS values(" + id + ",'" + name + "','" + email + "','"
					+ address + "')");
			System.out.println("user request completed");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@PreDestroy
	public void conDestroy() throws Exception {
		System.out.println("during application close/shutdown");
		con.close();

	}

}
