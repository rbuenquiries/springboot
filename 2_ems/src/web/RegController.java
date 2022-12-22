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
import org.springframework.web.servlet.mvc.Controller;

public class RegController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
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
		}
		Map<String, List<Employee>> model=new HashMap<String, List<Employee>>();
		model.put("list", emp);
		ModelAndView mav=new ModelAndView("employeedata",model );//output page name and ouput data
		return mav;
	}

}
