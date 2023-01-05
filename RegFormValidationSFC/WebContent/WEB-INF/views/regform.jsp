<%@taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<html:form commandName="RF">
<div style="color: red;">
<html:errors></html:errors>
</div>

<pre>
NAME:		<html:input path="name"/>
EMAIL:		<html:input path="email"/>
ADDRESS:	<html:textarea path="address"/>
			<input type="submit" value="Register"/>
</pre>
</html:form>