<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         errorPage="errors/boardError.jsp"
         session="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Session Page Practise</title>
</head>
<body>
<center>
    <h1><font color="#ff1493"><%= request.getParameter("id").toString() %></font>님 환영합니다.</h1>
    <br/>
    <% HttpSession session = request.getSession(); %>
    세션 아이디: <%= session.getId() %>
</center>
</body>
</html>