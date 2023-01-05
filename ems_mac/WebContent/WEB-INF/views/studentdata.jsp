out put jsp file
<%@page import="web.Student"%>
<%@page import="java.util.List"%>
<table border="2"> 
	<tbody>
		<tr>
			<th>NAME</th>
			<th>COURSE</th>
			<th>EMAIL</th>
			<th>ADDRESS</th>
			<th>PHONE</th>
		</tr>

		<%
			List<Student> list = (List<Student>) request.getAttribute("list");
			if (null != list) {
				for (Student s : list) {
		%>
		<tr>
			<td><%=s.getName() %></td>
			<td><%=s.getCourse() %></td>
			<td><%=s.getEmail() %></td>
			<td><%=s.getAddress() %></td>
			<td><%=s.getPhone() %></td>
		</tr>
		
	</tbody>

	<%
		}
		} else {
			out.print("NO DATA");

		}
	%>
</table>