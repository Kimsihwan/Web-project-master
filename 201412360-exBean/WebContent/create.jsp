 

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "exBean.StudentVO" %>
<%@ page import = "exBean.StudentDAO" %>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

</html>
<%
 request.setCharacterEncoding("UTF-8");
 StudentVO item = new StudentVO(); //사용자 객체 생성

 item.setNo(request.getParameter("no"));
 item.setName(request.getParameter("name"));
 StudentDAO dao = new StudentDAO(); //사용자 객체 생성
 dao.insertStudent(item);
%>