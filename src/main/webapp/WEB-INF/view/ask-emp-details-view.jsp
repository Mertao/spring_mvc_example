<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h2>Dear Employee, Please enter your details</h2>
	<form:form action="showDetails" modelAttribute="employee">
	Name <form:input path="name" />
		<form:errors path="name" />
		<br>
		<br>
	Surname <form:input path="surname" />
		<form:errors path="surname" />
		<br>
		<br>
	Salary <form:input path="salary" />
		<form:errors path="salary" />
		<br>
		<br>
	Department <form:select path="department">
			<form:options items="${employee.departments }" />
		</form:select>
		<br>
		<br>
	Gender 
	<form:radiobuttons path="gender" items="${employee.genders }" />
		<br>
		<br>
	Phone Number <form:input path="phoneNumber" />
		<form:errors path="phoneNumber" />
		<br>
		<br>
	Email <form:input path="email" />
		<form:errors path="email" />
		<br>
		<br>
		<input type="submit" value="OK">
	</form:form>
</body>
</html>
