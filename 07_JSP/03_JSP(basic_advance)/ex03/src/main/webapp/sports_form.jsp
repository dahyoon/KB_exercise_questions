<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>입력 폼: 체크박스, 라디오버튼</title>
</head>
<body>
<h1>getParameterValues 실습</h1>
<form action="sports" method="post">
    <fieldset>
        <legend>좋아하는 운동 및 성별</legend>
        <ul style="list-style: none">
            <li>
                <label for="baseball">야구</label>
                <input type="checkbox" id="baseball" name="sports" value="야구">
                <%-- 서버로 sports=야구 전송--%>
                <lablel for="soccer">축구</lablel>
                <input type="checkbox" id="soccer" name="sports" value="축구">
                <%-- 서버로 sports=축구 전송--%>
                <label for="basketball">농구</label>
                <input type="checkbox" id="basketball" name="sports" value="농구">
                <%-- 서버로 sports=농구 전송--%>
            </li>
            <li>
                <label for="male">남</label>
                <input type="radio" id="male" name="sex" value="남자">
                <%-- 서버로 sex=남자 전송--%>
                <label for="female">여자</label>
                <%-- 서버로 sex=여자 전송--%>
                <input type="radio" id="female" name="sex" value="여자" checked>
            </li>
            <li>
                <input type="submit" value="전송">
            </li>
        </ul>
    </fieldset>
</form>
</body>
</html>