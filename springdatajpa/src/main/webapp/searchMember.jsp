<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SearchMemberPage</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<div class="container">
<br>
<h2 class="display-4">Search Member</h2>
<hr>

<!-- Search member on member ID -->
<form action="searchByMemberName" method="post">
    <table>
        <tr>
            <td><input type="text" name="name" placeholder="Member Name" required></td>
        </tr>
    </table>
    <button type="submit">Search on MemberID</button>
</form>
<hr>
<!-- Search member on Joining_year -->
<form action="searchByJoinYear" method="post">
    <table>
        <tr>
            <td><input type="number" name="joinyear" placeholder="Joining Year" required></td>
        </tr>
    </table>
    <button type="submit">Search on Joining Year</button>
</form>

<br>
<a href="search">Search</a>
<br>
<a href="/">Home</a>
</div>

</body>
</html>