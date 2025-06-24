<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         errorPage="errors/boardError.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Error Page Practise</title>
</head>
<body>
<center>
<h1><font color="#ff1493"><%= request.getParameter("id").toString() %></font>님 환영합니다.</h1>
<br/>
</center>
</body>
</html>