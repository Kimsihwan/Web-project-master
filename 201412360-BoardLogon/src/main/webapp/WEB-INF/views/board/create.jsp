<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="/board/createPost">
<input type="text" name="writer" size="20" value='${login.id}'>
<input type="text" name="title" size="20">
<input type="text" name="content" size="20">
<input type="submit">
</form>
</body>
</html>