<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>로그인 화면</title>
</head>
<body>
  <h1>로그인 정보 세션 저장</h1>
<%
  String id = request.getParameter("userid");
  if (id == null) {
    response.sendRedirect("loginForm.html");
  } else {
    String pw = request.getParameter("password");
    session.setAttribute("userid", id);
    session.setAttribute("password", pw);
    out.print("안녕하세요, " + id + "<br>");
    out.print("<a href='loginInfo.jsp'>정보보기</a>");
  }
%>
</body>
</html>
