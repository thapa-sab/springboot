<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>

<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  
</head>
<body>

<div class="container">
  <h1> STUDENT REGISTRATION UPDATE FORM</h1>
  	<form action="update" method="post">
  	
  		<div class="form-group">
      		<label ></label>
      		<input type="hidden" class="form-control" name="studentId" value="${studentDto.studentId }">
    	</div>
    	
    	<div class="form-group">
      		<label >Student Name:</label>
      		<input type="text" class="form-control" name="studentName" value="${studentDto.studentName }">
    	</div>
    
    	<div class="form-group">
      		<label >Student Address:</label>
      		<input type="text" class="form-control" name="studentAdd" value="${studentDto.studentAdd }">
   		</div>
    
    	<div class="form-group">
      		<label >Student Phone: </label>
      		<input type="text" class="form-control" name="studentPhone" value="${studentDto.studentPhone }">
    	</div>
    
    	<div class="form-group">
      		<label >Student Email: </label>
      		<input type="email" class="form-control" name="studentEmail" value="${studentDto.studentEmail }">
    	</div>
    
    	<div class="form-group">
      		<label >Student Password</label>
      		<input type="password" class="form-control" name="studentPwd" value="${studentDto.studentPwd }">
    	</div>
   
    	<button type="submit" class="btn btn-primary">Update</button>
  </form>
</div>

</body>
</html>