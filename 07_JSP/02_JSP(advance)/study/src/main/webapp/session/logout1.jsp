<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%
  session.invalidate();
  response.sendRedirect("/session/loginForm.html");
%>