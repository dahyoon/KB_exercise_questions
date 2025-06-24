<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>out 내장 객체 연습</title>
</head>
<body style="font-size: 20px">
<%
    String name = "안다윤";
    out.print("이것은 out 내장 객체로 출력: " + name + "<br>");
%>
이것은 expression tag로 출력: <%= name %>
</body>
</html>
