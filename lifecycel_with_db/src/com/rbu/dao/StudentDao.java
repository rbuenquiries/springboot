package com.rbu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//public class StudentDao implements InitializingBean, DisposableBean {
public class StudentDao {
	Connection con;
	private String driver;
	private String url;
	private String user;
	private String password;

	public StudentDao() {
		System.out.println("StudentDao object step1");
	}

	public void setDriver(String driver) {
		System.out.println("setDriver  step2");
		this.driver = driver;
	}

	public void setUrl(String url) {
		System.out.println("setUrl  step2");
		this.url = url;
	}

	public void setPassword(String password) {
		System.out.println("setPassword  step2");
		this.password = password;
	}

	public void setUser(String user) {
		System.out.println("setUser  step2");
		this.user = user;
	}

	// init
	//@Override
	//public void afterPropertiesSet() throws Exception {
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

	//@Override
	//public void destroy() throws Exception {
	public void conDestroy() throws Exception {
		System.out.println("during application close/shutdown");
		con.close();

	}

}
