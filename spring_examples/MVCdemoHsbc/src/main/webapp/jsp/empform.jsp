<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration Form</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>
    <div align="center">
        <h2>Employee Registration</h2>
        <form:form action="/empwebcntrl/empp" method="post" modelAttribute="employee">

            <form:label path="empId">Emp Id:</form:label>
            <form:input path="empId"/><br/>
            <form:errors path="empId" cssClass="error" /><br/>

            <form:label path="empName">Emp name:</form:label>
            <form:input path="empName"/><br/>
            <form:errors path="empName" cssClass="error" /><br/>
             
            <form:label path="empSalary">Emp Salary:</form:label>
            <form:input path="empSalary"/><br/>
            <form:errors path="empSalary" cssClass="error" /><br/>
             
            <form:label path="empJoiningDate">Joining Date (yyyy-mm-dd):</form:label>
            <form:input path="empJoiningDate"/><br/>
            <form:errors path="empJoiningDate" cssClass="error" /><br/>
                 
             
                    
            <form:button>Register Emp</form:button>
        </form:form>
    </div>
</body>
</html>