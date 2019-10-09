<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
   
<style>
.container{
margin-top:80px
}
</style>
<title>List Employee</title>
</head>
<body>
    <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
  <a class="navbar-brand" href="/index">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarsExampleDefault">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href="/logout">Logout</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="/show-users">List User</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/show-contacts">List Contact</a>
      </li>
      <li class="nav-item  active">
        <a class="nav-link" href="/show-employee">List Employee</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/cheesecategorylist">List Cat & Cheese</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="/show-customer">List Customer</a>
      </li>
    </ul>
    
  </div>
</nav>

<main role="main" class="container">

  <div class="container text-center" id="tasksDiv">
    <h1>List Employee</h1>
    <hr>
    <div class="table-responsive">
    	<table class="table table-stripped table-bordered">
    	<thead>
    		<tr>
    		<th>Id</th>
    		<th>Nom</th>
    		<th>Prénom</th>
    		<th>Nom equipe</th>
    		<th>Salaire</th>
    		<th>Téléphone</th>
<th>Id</th>
    		<th>Nom</th>
    		<th>Prénom</th>
    		<th>Nom equipe</th>
    		<th>Salaire</th>
    		<th>Téléphone</th>
    		</tr>
    	</thead>
    	<tbody>
    		<c:forEach var="employee" items="${employees}">
			    	<td>${employee.id}</td>
	    			<td>${employee.firstName}</td>
	    			<td>${employee.lastName}</td>
	    			<td>${employee.email}</td>
	    			<td>${employee.password}</td>



	    			<td>${employee.employeeProfile.phoneNumber}</td>
	    			<td>${employee.employeeProfile.address1}</td>
	    			<td>${employee.employeeProfile.address2}</td>
	    			<td>${employee.employeeProfile.street}</td>
	    			<td>${employee.employeeProfile.city}</td>
	    			<td>${employee.employeeProfile.state}</td>
	    			<td>${employee.employeeProfile.country}</td>
	    			<td>${employee.employeeProfile.zipCode}</td>
	
	    		</tr>
    		
    		</c:forEach>
    	</tbody>
    	</table>
    </div>
    <div class="container text-center">
    <h1>New registration</h1>
    <hr>
    <form class="form-horizontal" method="POST" action="save-employee">
    	<input type="hidden" name="id" value="${employee.id}"/>
    	<div class="form-group">
    		<label class="control-label">Nom</label>
    		
    			<input type="text" class="form-control" name="firstName" value="${employee.firstName}" required/> 
    		
    	</div>
    	<div class="form-group">
    		<label class="control-label">Prenom</label>
    		
    			<input type="text" class="form-control" name="lastName" value="${employee.lastName}" required/> 
    		
    	</div>
    		<div class="form-group">
    		<label class="control-label">Email</label>
    		
    			<input type="email" class="form-control" name="email" value="${employee.email}" required/> 
    		
    	</div>
    		<div class="form-group">
    		<label class="control-label">Mot de passe</label>
    		
    			<input type="text" class="form-control" name="password" value="${employee.password}" required/> 
    		
    	</div>
    	<div class="form-group">
    		<label class="control-label">Email</label>
    		
    			<input type="text" class="form-control" name="phoneNumber" value="${employee.employeeProfile.phoneNumber}" required/> 
    		
    	</div>
    		<div class="form-group">
    		<label class="control-label">Mot de passe</label>
    		
    			<input type="text" class="form-control" name="address1" value="${employee.employeeProfile.address1}" required/> 
    		
    	</div>
    	<div class="form-group">
    		<label class="control-label">Email</label>
    		
    			<input type="text" class="form-control" name="address2" value="${employee.employeeProfile.address2}" required/> 
    		
    	</div>
    		<div class="form-group">
    		<label class="control-label">Mot de passe</label>
    		
    			<input type="text" class="form-control" name="street" value="${employee.employeeProfile.street}" required/> 
    		
    	</div>
    	<div class="form-group">
    		<label class="control-label">Email</label>
    		
    			<input type="text" class="form-control" name="city" value="${employee.employee.employeeProfile.city}" required/> 
    		
    	</div>
    		<div class="form-group">
    		<label class="control-label">Mot de passe</label>
    		
    			<input type="text" class="form-control" name="state" value="${employee.employeeProfile.state}" required/> 
    		
    	</div>
    	<div class="form-group">
    		<label class="control-label">Email</label>
    		
    			<input type="text" class="form-control" name="country" value="${employee.employeeProfile.country}" required/> 
    		
    	</div>
    		<div class="form-group">
    		<label class="control-label">Mot de passe</label>
    		
    			<input type="text" class="form-control" name="zipCode" value="${employee.employeeProfile.zipCode}" required/> 
    		
    	</div>
    	<div class="form-group">
    		
    			<input type="submit" class="btn btn-primary"  value="Register"/> 
</div>
    </form>
    </div>
  </div>

</main><!-- /.container -->

     

</body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</html>