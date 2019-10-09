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
      <li class="nav-item ">
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
      <li class="nav-item">
        <a class="nav-link" href="/cheesecategorylist">List Cat & Cheese</a>
      </li>
      
    </ul>
    
  </div>
</nav>

<main role="main" class="container">

  <div class="starter-template">
    <h1>Welcome ${sessionScope.user.email}</h1>
  
  </div>

</main><!-- /.container -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
      <script>window.jQuery || document.write('<script src="/docs/4.3/assets/js/vendor/jquery-slim.min.js"><\/script>')</script><script src="/docs/4.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-xrRywqdh3PHs8keKZN+8zzc5TX0GRTLCcmivcbNJWm2rs5C8PRhcEn3czEjhAO9o" crossorigin="anonymous"></script>

</body>

</html>