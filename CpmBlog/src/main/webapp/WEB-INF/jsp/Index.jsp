<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Titulo llamado LOGIN</title>
<link href="/EstiloIndex.css" rel="stylesheet">
<link href="/webjars/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script src="/webjars/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="/webjars/jquey/3.2.1/js/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-offset-5 col-md-3">
				<div class="form-login">
					<h4>Vuelve Carlos por Navidad</h4>
					<form:form class="form" action="/login" modelAttribute="userLogin" method="POST">
						<form:input type="name" id="userName"
							class="form-control input-sm chat-input" placeholder="username"
							path="email" />
						</br>
						<form:input type="password" id="userPassword"
							class="form-control input-sm chat-input" placeholder="password"
							path="password" />
						</br>
						<div class="wrapper">
							<button type="submit" class="group-btn">
								login 
							</button>
					</form:form>
				</div>
			</div>

		</div>
	</div>
	</div>
</body>
</html>