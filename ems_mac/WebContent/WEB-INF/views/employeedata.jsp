out put jsp file
<%@page import="web.Employee"%>
<%@page import="java.util.List"%>
<table border="2"> 
	<tbody>
		<tr>
			<th>NAME</th>
			<th>EMAIL</th>
			<th>ADDRESS</th>
			<th>PHONE</th>
		</tr>

		<%
			List<Employee> list = (List<Employee>) request.getAttribute("list");
			if (null != list) {
				for (Employee e : list) {
		%>
		<tr>
			<td><%=e.getName() %></td>
			<td><%=e.getEmail() %></td>
			<td><%=e.getAddress() %></td>
			<td><%=e.getPhone() %></td>
		</tr>
		
	</tbody>

	<%
		}
		} else {
			out.print("NO DATA");

		}
	%>
</table>