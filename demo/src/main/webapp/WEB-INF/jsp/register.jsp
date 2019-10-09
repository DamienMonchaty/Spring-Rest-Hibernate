<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
   
<title>Register</title>
</head>


<body>
   

<main role="main" class="container">
<c:choose>
<c:when test="${mode== 'MODE_REGISTER'}">
  <div class="container text-center">
    <h1>New registration</h1>
    <hr>
    <form class="form-horizontal" method="POST" action="save-user">
    	<input type="hidden" name="id" value="${user.id}"/>
    	<div class="form-group">
    		<label class="control-label">Nom</label>
    		
    			<input type="text" class="form-control" name="nom" value="${user.nom}" required/> 
    		
    	</div>
    	<div class="form-group">
    		<label class="control-label">Prenom</label>
    		
    			<input type="text" class="form-control" name="prenom" value="${user.prenom}" required/> 
    		
    	</div>
    		<div class="form-group">
    		<label class="control-label">Email</label>
    		
    			<input type="email" class="form-control" name="email" value="${user.email}" required/> 
    		
    	</div>
    		<div class="form-group">
    		<label class="control-label">Mot de passe</label>
    		
    			<input type="password" class="form-control" name="motdepasse" value="${user.motdepasse}" required/> 
    		
    	</div>
    	<div class="form-group">
    		
    			<input type="submit" class="btn btn-primary"  value="Register"/> 
</div>
    </form>
  </div>
</c:when>
<c:when test="${mode== 'MODE_UPDATE'}">
  <div class="container text-center">
    <h1>Update User</h1>
    <hr>
    <form class="form-horizontal" method="POST" action="save-user">
    	<input type="hidden" name="id" value="${user.id}"/>
    	<div class="form-group">
    		<label class="control-label">Nom</label>
    		
    			<input type="text" class="form-control" name="nom" value="${user.nom}"/> 
    		
    	</div>
    	<div class="form-group">
    		<label class="control-label">Prenom</label>
    		
    			<input type="text" class="form-control" name="prenom" value="${user.prenom}"/> 
    		
    	</div>
    		<div class="form-group">
    		<label class="control-label">Email</label>
    		
    			<input type="email" class="form-control" name="email" value="${user.email}"/> 
    		
    	</div>
    		<div class="form-group">
    		<label class="control-label">Mot de passe</label>
    		
    			<input type="password" class="form-control" name="motdepasse" value="${user.motdepasse}"/> 
    		
    	</div>
    	<div class="form-group">
    		
    			<input type="submit" class="btn btn-primary"value="Update"/> 
</div>
    </form>
  </div>
</c:when>
</c:choose>
</main><!-- /.container -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
      <script>window.jQuery || document.write('<script src="/docs/4.3/assets/js/vendor/jquery-slim.min.js"><\/script>')</script><script src="/docs/4.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-xrRywqdh3PHs8keKZN+8zzc5TX0GRTLCcmivcbNJWm2rs5C8PRhcEn3czEjhAO9o" crossorigin="anonymous"></script>

</body>

</html>