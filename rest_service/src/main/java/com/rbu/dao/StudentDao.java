package com.rbu.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rbu.entities.Student;

@Repository
public class StudentDao {
	@Autowired
	DataSource dataSource;// connection pool 15
	@Autowired
	JdbcTemplate jdbcTemplate;
	/*
	 * public Student save(Student student) throws Exception { Connection con =
	 * dataSource.getConnection(); Statement statement = con.createStatement();
	 * ResultSet rs = statement.executeQuery("select max(id) from STUDENT_JDBC");
	 * int maxid = 0; if (rs.next()) { maxid = rs.getInt(1); maxid++; }
	 * student.setId(maxid);
	 * statement.executeUpdate("insert into STUDENT_JDBC values(" + maxid + ",'" +
	 * student.getName() + "','" + student.getEmail() + "','" + student.getAddress()
	 * + "')"); rs.close(); statement.close(); con.close(); return student; }
	 * 
	 * public Student update(Student student) throws Exception { Connection con =
	 * dataSource.getConnection(); Statement statement = con.createStatement();
	 * statement.executeUpdate("update STUDENT_JDBC set name='" + student.getName()
	 * + "',email='" + student.getEmail() + "',address='" + student.getAddress() +
	 * "' where id=" + student.getId()); statement.close(); con.close(); return
	 * student; }
	 * 
	 * public void delete(Integer id) throws Exception { Connection con =
	 * dataSource.getConnection(); Statement statement = con.createStatement();
	 * statement.executeUpdate("delete STUDENT_JDBC where id=" + id);
	 * statement.close(); con.close(); }
	 * 
	 * public Student selectOne(Integer id) throws Exception { Connection con =
	 * dataSource.getConnection(); Statement statement = con.createStatement();
	 * ResultSet rs = statement.executeQuery("select * from STUDENT_JDBC where id="
	 * + id); Student student=new Student(); if(rs.next()) {
	 * student.setId(rs.getInt(1)); student.setName(rs.getString(2));
	 * student.setEmail(rs.getString(3)); student.setAddress(rs.getString(4)); }
	 * rs.close(); statement.close(); con.close(); return student; } public
	 * List<Student> selectAll() throws Exception { Connection con =
	 * dataSource.getConnection(); Statement statement = con.createStatement();
	 * ResultSet rs = statement.executeQuery("select * from STUDENT_JDBC ");
	 * List<Student> students=new ArrayList<Student>(); while(rs.next()) { Student
	 * student=new Student(); student.setId(rs.getInt(1));
	 * student.setName(rs.getString(2)); student.setEmail(rs.getString(3));
	 * student.setAddress(rs.getString(4)); students.add(student); } rs.close();
	 * statement.close(); con.close(); return students; }
	 * 
	 */

	public Student save(Student student) throws Exception {
		int maxid = jdbcTemplate.queryForObject("select max(id) from STUDENT_JDBC", Integer.class);
		maxid++;

		student.setId(maxid);
		jdbcTemplate.update("insert into STUDENT_JDBC values(" + maxid + ",'" + student.getName() + "','"
				+ student.getEmail() + "','" + student.getAddress() + "')");

		return student;
	}

	public Student update(Student student) throws Exception {
		jdbcTemplate.update("update STUDENT_JDBC set name='" + student.getName() + "',email='" + student.getEmail()
				+ "',address='" + student.getAddress() + "' where id=" + student.getId());
		return student;
	}

	public void delete(Integer id) throws Exception {
		jdbcTemplate.update("delete STUDENT_JDBC where id=" + id);
	}

	public Student selectOne(Integer id) throws Exception {

		Student student = (Student) jdbcTemplate.queryForObject("select * from STUDENT_JDBC where id=" + id,
				new StudentRowMapper());

		return student;
	}

	public List<Student> selectAll() throws Exception {
		List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from STUDENT_JDBC ");
		List<Student> studentList = new ArrayList<>();
		for (Map<String, Object> map : list) {
			Student student = new Student();
			student.setId((Integer) map.get("id"));
			student.setName((String) map.get("name"));
			student.setEmail((String) map.get("email"));
			student.setAddress((String) map.get("address"));
			studentList.add(student);
		}

		return studentList;
	}

}
