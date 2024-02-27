<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SearchBookPage</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<br>
		<h2 class="display-4">Search Book</h2>
		<hr>
		<!-- Search book on author -->
		<form action="searchByAuthor" method="post">
			<table>
				<tr>
					<td><input type="text" name="author" placeholder="Author"
						required></td>
				</tr>
			</table>
			<button type="submit">Search on Author</button>
		</form>
		<hr>
		<!-- Search book on genre -->
		<form action="searchByGenre" method="post">
			<table>
				<tr>
					<td><input type="text" name="genre" placeholder="Genre"
						required></td>
				</tr>
			</table>
			<button type="submit">Search on Genre</button>
		</form>
		<hr>
		<!-- Search book for price range -->
		<form action="searchByPriceRange" method="post">
			<table>
				<tr>
					<td><input type="number" name="minprice"
						placeholder="Min Price" step="0.01" required></td>
					<td><input type="number" name="maxprice"
						placeholder="Max Price" step="0.01" required></td>
				</tr>
			</table>
			<button type="submit">Search on price</button>
		</form>
		<hr>
		<!-- Search book on genre and language -->
		<form action="searchByGenreAndLanguage" method="post">
			<table>
				<tr>
					<td><input type="text" name="genre" placeholder="Genre"
						required></td>
					<td><input type="text" name="language" placeholder="Language"
						required></td>
				</tr>
			</table>
			<button type="submit">Search on Genre and Language</button>
		</form>
		<hr>
		<!-- Search book on pages less than the specified number -->
		<form action="searchByMaxPages" method="post">
			<table>
				<tr>
					<td><input type="number" name="maxpages"
						placeholder="Max Pages" required></td>
				</tr>
			</table>
			<button type="submit">Search on Pages</button>
		</form>
		<hr>
		<!-- Search book on publisher_year -->
		<form action="searchByPublisherYear" method="post">
			<table>
				<tr>
					<td><input type="number" name="publicationyear"
						placeholder="Publication Year" required></td>
				</tr>
			</table>
			<button type="submit">Search on Publication Year</button>
		</form>

		<br> 
			<a href="search">Search</a> 
			<br> 
			<a href="/">Home</a> <br>
		<br>
	</div>

</body>
</html>