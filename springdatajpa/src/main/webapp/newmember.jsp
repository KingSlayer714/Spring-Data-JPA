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
<h2 class="display-4">Add New Member</h2>
<hr>
<a href="/">Home</a>
<br><br>
<form action="addmember" method="post">
        <table>
            <tr>
                <td><label>Name:</label></td>
                <td><input type="text" id="name" name="name" required></td>
            </tr>
            <tr>
                <td><label>Gender:</label></td>
                <td><input type="text" id="gender" name="gender" maxlength="10" required></td>
            </tr>
            <tr>
                <td><label>Age:</label></td>
                <td><input type="number" id="age" name="age" required></td>
            </tr>
            <tr>
                <td><label>Mobile:</label></td>
                <td><input type="text" id="mobile" name="mobile" pattern="[0-9]{10}" required></td>
            </tr>
            <tr>
                <td><label>Join Year:</label></td>
                <td><input type="number" name="joinyear" required></td>
            </tr>
            <tr>
            	<td></td>
            	<td><input type="submit" value="Submit"></td>
            </tr>
        </table>
        
    </form>
</div>

</body>
</html>