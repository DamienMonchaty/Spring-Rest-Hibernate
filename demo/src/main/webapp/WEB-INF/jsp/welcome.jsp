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

<title>Home</title>
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
       <li class="nav-item active">
        <a class="nav-link" href="/show-users">List User</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/show-contacts">List Contact</a>
      </li>
            <li class="nav-item">
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
    <h1>List User</h1>
    <hr>
    <div class="table-responsive">
    	<table class="table table-stripped table-bordered">
    	<thead>
    		<tr>
    		<th>Id</th>
    		<th>Nom</th>
    		<th>Prénom</th>
    		<th>Email</th>
    		<th>Delete</th>
    		<th>Edit</th>
    		</tr>
    	</thead>
    	<tbody>
    		<c:forEach var="user" items="${users}">
    		<tr>
    			<td>${user.id}</td>
    			<td>${user.nom}</td>
    			<td>${user.prenom}</td>
    			<td>${user.email}</td>
    			<td><a href="/delete-user?id=${user.id}"><button class="btn btn-primary">Delete</button></a></td>
    			<td><a href="/edit-user?id=${user.id}"><button class="btn btn-primary">Edit</button></a></td>
    		</tr>
    		</c:forEach>
    	</tbody>
    	</table>
    </div>
  </div>

</main><!-- /.container -->

     

</body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</html>