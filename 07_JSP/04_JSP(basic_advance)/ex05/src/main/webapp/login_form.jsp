<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>로그인 폼</title>
</head>
<body>
    <form action="/login" method="post">
        <fieldset>
            <legend>로그인 폼</legend>
            <ul style="list-style: none">
                <li>
                    <label for="userid">아이디</label>
                    <input type="text" id="userid" name="userid">
                </li>
                <li>
                    <label for="passwd">비밀번호</label>
                    <input type="password" id="passwd" name="passwd">
                </li>
                <li><input type="submit" value="전송 "></li>
            </ul>
        </fieldset>
    </form>
</body>
</html>