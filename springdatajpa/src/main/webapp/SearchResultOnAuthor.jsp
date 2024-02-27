<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books details</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<br> <br>
		<h2 class="display-4">Books of Selected Author</h2>
		<hr>
		<table class="table table-bordered table-hover">
			<tr>
				<th>Book No.</th>
				<th>ISB No.</th>
				<th>Title</th>
				<th>Author</th>
				<th>Publisher</th>
				<th>Publication Year</th>
				<th>Genre</th>
				<th>Description</th>
				<th>Pages</th>
				<th>Price in Dollars($)</th>
				<th>Language</th>
			</tr>

			<c:forEach items="${blist}" var="b">
				<tr>
					<td>${b.bookid}</td>
					<td>${b.isbn}</td>
					<td>${b.title}</td>
					<td>${b.author}</td>
					<td>${b.publisher}</td>
					<td>${b.publicationyear}</td>
					<td>${b.genre}</td>
					<td>${b.description}</td>
					<td>${b.pages}</td>
					<td>${b.price}</td>
					<td>${b.language}</td>
				</tr>

			</c:forEach>



		</table>

		<br> <a href="#" onclick="goBack()">Back</a> 
		<br>
		<br>

	</div>
	
	<script>
        function goBack() {
            window.history.back();
        }
    </script>

</body>
</html>