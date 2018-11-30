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
		<form method="post">
			<input type="text" name="writer" size="20" value="${boardVO.writer}">
			<input type="text" name="title" size="20" value="${boardVO.title}">
			<input type="text" name="content" size="20" value="${boardVO.content}">
			<input type="submit">
		</form>
	</body>
</html>