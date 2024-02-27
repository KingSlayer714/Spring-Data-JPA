<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>homePage</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<div class="container">
<br><br>
<h2 class="display-4">Add New Book</h2>
<hr>
<a href="/">Home</a>
<br><br>
<form action="addbook" method="post">
        <table>
            <tr>
                <td>ISBN:</td>
                <td><input type="text" name="isbn"></td>
            </tr>
            <tr>
                <td>Title:</td>
                <td><input type="text" name="title"></td>
            </tr>
            <tr>
                <td>Author:</td>
                <td><input type="text" name="author"></td>
            </tr>
            <tr>
                <td>Publisher:</td>
                <td><input type="text" name="publisher"></td>
            </tr>
            <tr>
                <td>Publication Year:</td>
                <td><input type="number" name="publicationyear"></td>
            </tr>
            <tr>
                <td>Genre:</td>
                <td><input type="text" name="genre"></td>
            </tr>
            <tr>
                <td>Description:</td>
                <td><textarea name="description"></textarea></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><input type="number" name="price"></td>
            </tr>
            <tr>
                <td>Pages:</td>
                <td><input type="number" name="pages"></td>
            </tr>
            <tr>
                <td>Language:</td>
                <td><input type="text" name="language"></td>
            </tr>
            <tr>
            	<td></td>
            	<td><input type="submit" value="Add Book"></td>
            </tr>
        </table>
        
    </form>
</div>

</body>
</html>