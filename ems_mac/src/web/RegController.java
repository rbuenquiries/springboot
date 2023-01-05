package web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class RegController extends MultiActionController {
	
	public ModelAndView regemployeedata(HttpServletRequest req, HttpServletResponse resp) throws Exception {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String address = req.getParameter("address");
		List<Employee> emp = new ArrayList<Employee>();
		try {
			// create table RBUEMPLOYEES(name varchar2(200),email varchar2(300),address
			// varchar2(500),phone varchar2(12));
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			Statement statement = con.createStatement();
			statement.executeUpdate("insert into RBUEMPLOYEES values('" + name + "','" + email + "','" + address + "','"
					+ phone + "')");
			ResultSet rs = statement.executeQuery("select * from RBUEMPLOYEES");
			while (rs.next()) {
				Employee e = new Employee();
				e.setName(rs.getString(1));
				e.setEmail(rs.getString(2));
				e.setAddress(rs.getString(3));
				e.setPhone(rs.getString(4));
				emp.add(e);
			}
			statement.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Map<String, List<Employee>> model = new HashMap<String, List<Employee>>();
		model.put("list", emp);
		ModelAndView mav = new ModelAndView("employeedata", model);// output page name and ouput data
		return mav;

	}

	public ModelAndView regstudentdata(HttpServletRequest req, HttpServletResponse resp) throws Exception {


		String name = req.getParameter("name");
		String course = req.getParameter("course");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String address = req.getParameter("address");
		List<Student> std = new ArrayList<Student>();
		try {
			// create table RBUEMPLOYEES(name varchar2(200),email varchar2(300),address
			// varchar2(500),phone varchar2(12));
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			Statement statement = con.createStatement();
			statement.executeUpdate("insert into RBUSTUDENTS values('" + name + "','" + course + "','" + email
					+ "','" + address + "','" + phone + "')");
			ResultSet rs = statement.executeQuery("select * from RBUSTUDENTS");
			while (rs.next()) {
				Student s = new Student();
				s.setName(rs.getString(1));
				s.setCourse(rs.getString(2));
				s.setEmail(rs.getString(3));
				s.setAddress(rs.getString(5));
				s.setPhone(rs.getString(5));
				std.add(s);
			}
			statement.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Map<String, List<Student>> model = new HashMap<String, List<Student>>();
		model.put("list", std);
		ModelAndView mav = new ModelAndView("studentdata", model);// output page name and ouput data
		return mav;

	
	}

	

}
