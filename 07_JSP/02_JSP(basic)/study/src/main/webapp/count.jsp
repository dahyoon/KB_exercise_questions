<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>application 내장 객체 연습</title>
</head>
<body>
<h1>방문자 수 설정 화면</h1>
<%! int count; %>
<%
    count++;
    application.setAttribute("countValue", count);
%>
현재 방문자 수: <%= count %>
</body>
</html>