<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Member Page</title>
</head>
<body>
<h1>/security/Member page</h1>
<form action="/security/logout" method="post">
  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
  <input type="submit" value="로그아웃"/>
</form>
</body>
</html>