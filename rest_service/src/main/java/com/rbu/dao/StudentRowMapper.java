package com.rbu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.rbu.entities.Student;

public class StudentRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student=new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setEmail(rs.getString(3));
		student.setAddress(rs.getString(4));
		return student;
	}

}
