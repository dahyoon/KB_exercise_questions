<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         errorPage="errors/boardError.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Include Page Practise</title>
</head>
<body>
<%@ include file="layout/header.jsp"%>
<center>
    <h1><font color="#ff1493"><%= request.getParameter("id").toString() %></font>님 환영합니다.</h1>
    <br/>
    세션 아이디: <%= session.getId() %>
</center>
<%@ include file="layout/footer.jsp"%>
</body>
</html>