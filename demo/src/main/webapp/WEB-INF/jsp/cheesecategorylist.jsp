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
<title>List Cat & Cheese</title>
</head>
<body class="container">
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
      <li class="nav-item">
        <a class="nav-link" href="/show-employee">List Employee</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="/cheesecategorylist">List Cat & Cheese</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="/show-customer">List Customer</a>
      </li>
      
    </ul>
    
  </div>
</nav>

<main role="main" class="container">
<div class="container text-center">
    <h1>New Cat & Cheese</h1>
    <hr>
    <form class="form-horizontal" method="POST" action="save-cheese">
    	<input type="hidden" name="id" value="${cheese.id}"/>
    	<div class="form-group">
    		<label class="control-label">Nom</label>
    		
    			<input type="text" class="form-control" name="nom" value="${cheese.nom}" required/> 
    		
    	</div>
    	<div class="form-group">
    		<label class="control-label">Description</label>
    		
    			<input type="text" class="form-control" name="description" value="${cheese.description}" required/> 
    		
    	</div>
    		<div class="form-group">

    		<select multiple="multiple" name="Category" style="width:150px;font-color:black">
				    <c:forEach items="${categories}" var="category">
				      <option value="${category.id}" text="${category.title}">${category.title}</option>
				  </c:forEach>
				</select>
    		
    			
    		
    	</div>
    		
    	<div class="form-group">
    		
    			<input type="submit" class="btn btn-primary"  value="Register"/> 
</div>
    </form>
  </div>
  <div class="container text-center" id="tasksDiv">
    <h1>List Cat & Cheese</h1>
    <hr>
<div class="table-responsive">
    	<table class="table table-stripped table-bordered">
    	<thead>
    		<tr>
    		<th>Id</th>
    		<th>Nom</th>
    		<th>Description</th>
    		<th>Category</th>
    		</tr>
    	</thead>
    
    		<c:forEach var="cheese" items="${cheeses}">
    		<tr>
    		<td>${cheese.id}</td>
    			<td>${cheese.nom}</td>
    			<td>${cheese.description}</td>
    			<td>${cheese.category.title}</td>
				
    		</tr>
    		</c:forEach>
    	
    	</table>

</div>
</div>

</main><!-- /.container -->

</body>
</html>