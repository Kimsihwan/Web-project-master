<!DOCTYPE=HTML>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<!-- Bootstrap -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="../../../resources/bootstrap-4.1.3-dist/css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
		<form method="post" action="/member/loginPost">
			<input type="text" name="id" size="50">
			<input type="password" name="pwd" size="50">
			<input type="submit">
		</form>
		<br><a href="/member/create">REGISTER</a>
	</body>
</html>