<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>Redirect 결과</title>
</head>
    <body>
        username 값: <%= request.getAttribute("username") %><br>
        useraddress 값: <%= request.getAttribute("useraddress") %><br>
        <%-- 값들이 null일 것: RequestRedirectServlet.java에서 설정한 username 값이 redirect한 ResponseRedirectServlet.java에서 값을 받아오지 못하기 때문 --%>
    </body>
</html>
