<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Members details</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<br>
		<br>
		<h2 class="display-4">Member</h2>
		<hr>
		<table class="table table-bordered table-hover">
			<tr>
				<th>Member Id</th>
				<th>Member Name</th>
				<th>Gender</th>
				<th>Age</th>
				<th>Mobile</th>
				<th>Join Year</th>
			</tr>

			<c:forEach items="${mlist}" var="m">
				<tr>
					<td>${m.memberid}</td>
					<td>${m.name}</td>
					<td>${m.gender}</td>
					<td>${m.age}</td>
					<td>${m.mobile}</td>
					<td>${m.joinyear}</td>
				</tr>

			</c:forEach>



		</table>		
		<br> <a href="#" onclick="goBack()">Back</a> <br><br>

	</div>
	<script>
        function goBack() {
            window.history.back();
        }
    </script>

</body>
</html>