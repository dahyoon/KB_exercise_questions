<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>로그인 정보 조회 화면</title>
</head>
<body>
<h1>로그인 정보 보기</h1>
<%
    String id = (String) session.getAttribute("userid");
    if (id == null) {
        response.sendRedirect("loginForm.html");
    } else {
        String pw = (String) session.getAttribute("password");
        out.print("사용자 아이디값: " + id + "<br>");
        out.print("사용자 비밀번호값: " + pw + "<br>");
        out.print("<a href='logout1.jsp'>로그아웃 > 로그인 화면으로</a><br>");
        out.print("<a href='logout2.jsp'>로그아웃 > 로그아웃 안내 화면으로</a>");
    }
%>
</body>
</html>
