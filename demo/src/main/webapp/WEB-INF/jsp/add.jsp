<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org"/>
<head>
<meta charset="ISO-8859-1"/>
<title>Insert title here</title>
</head>
<body>
<form method="post" th:object="${cheese}">
<div class="form-group">
	<label th:for="nom">nom</label>
	<input class="form-control" th:field="*{nom}"/>
	<span th:errors="*{nom}" class="error"></span>
</div>
<div class="form-group">
	<label th:for="description">Description</label>
	<input class="form-control" th:field="*{description}"/>
	<span th:errors="*{description}" class="error"></span>
</div>
<div class="form-group">
	<label th:for="type">Type</label>
	<select name="categoryId">
		<option th:each="category : ${categories}"
		th:text="${category.nom}"
		th:value="${category.id}"></option>	
	</select>
</div>

<input type="submit" value="add cheese"/>


</form>
</body>
</html>