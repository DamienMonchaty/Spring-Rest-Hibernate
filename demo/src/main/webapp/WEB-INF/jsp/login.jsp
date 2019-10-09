<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

 <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
<style>
.container{
margin-top:80px
}
</style>
<title>Login</title>
</head>
<body class="text-center">

    <div class="container text-center">
    <h1>Login User</h1>
    <hr>
    <form class="form-horizontal" method="POST" action="/login-user">

    	
    		<div class="form-group">
    		<label class="control-label">Email</label>
    		
    			<input type="text" class="form-control" name="email" value="${user.email}" required/> 
    		
    	</div>
    		<div class="form-group">
    		<label class="control-label">Mot de passe</label>
    		
    			<input type="password" class="form-control" name="motdepasse" value="${user.motdepasse}" required/> 
    		
    	</div>
    	<div class="form-group">
    		
    			<input type="submit" class="btn btn-primary"value="Login"/> 
    			<a class="nav-link" href="/register">Registration</a>
			</div>
    </form>
  </div>


</body>
</html>