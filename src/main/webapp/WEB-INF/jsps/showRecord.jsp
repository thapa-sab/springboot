<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administration Records</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Student Records</h2>
  
  <table class="table table-dark table-hover">
    <thead>
      <tr>
      	<th>Student ID</th>
        <th>Student Name</th>
        <th>Student Address</th>
        <th>Student Phone</th>
        <th>Student Email</th>
        <th>Student Password</th>
        <th>Action</th>
        
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${listOfStudentDto}" var ="std">
      	<tr>
      		<td>${std.studentId } </td>
      		<td>${std.studentName } </td>
      		<td>${std.studentAdd } </td>
      		<td>${std.studentPhone } </td>
      		<td>${std.studentEmail } </td>
      		<td>${std.studentPwd } </td>
      		<td>
        		<a href="updateForm?id=${std.studentId }"> UPDATE </a> 
        		&nbsp; / &nbsp;       
        		<a href="deleteRecord?id=${std.studentId }"> DELETE </a>
      		</td>    	
      	</tr>
      </c:forEach>
    </tbody>
  </table>
</div>

</body>
</html>