<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>include 액션 태그 연습</title>
</head>
<body>
    <h1>inlude 액션 태그 실습</h1>
    JSP의 include 및 param 액션 태그를 사용하여 현재 시간을 구하는 예제입니다.<br>
    다음 줄에 삽입됩니다.<br>
    <jsp:include page="header2.jsp" flush="true">
        <jsp:param name="nickName" value="Pearl"/>
    </jsp:include>
</body>
</html>