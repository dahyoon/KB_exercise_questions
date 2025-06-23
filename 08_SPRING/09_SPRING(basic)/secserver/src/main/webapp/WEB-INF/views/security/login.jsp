<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>로그인 화면</title>
</head>
<body>
<h1>LOGING</h1>
<form action="/security/login" name="f" method="POST">
  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
  <table>
    <tr>
      <td>User:</td>
      <td><input type="text" name="username" value=""></td>
    </tr>
    <tr>
      <td>Password:</td>
      <td><input type="password" name="password"></td>
    </tr>
    <tr>
      <td colspan="2"><input type="submit" name="submit" value="Login"></td>
    </tr>
  </table>
</form>
</body>
</html>
