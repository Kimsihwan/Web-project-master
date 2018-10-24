<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import = "java.util.*" %>

<%@ page import = "exActionTag.StudentVO" %>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>

<jsp:useBean id="item" scope="page" class="exActionTag.StudentVO"/>

<jsp:useBean id="dao" scope="page" class="exActionTag.StudentDAO"/>

<%

 request.setCharacterEncoding("UTF-8");

 List<StudentVO> items = new ArrayList<StudentVO>();

 items = dao.selectStudent();

%>

<body>

<%

 for(int i=0;i<items.size();i++) {

  item = items.get(i);

%>

  <%=item.getNo()%>

  <%=item.getName()%><BR>

 <%}%>

</body>

</html>