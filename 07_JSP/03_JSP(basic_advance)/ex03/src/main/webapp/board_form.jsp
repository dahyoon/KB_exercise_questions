<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>게시물 작성 폼</title>
</head>
<body>
  <h1>getParameterNames 실습</h1>
  <form action="board" method="post">
    <input type="hidden" name="action" value="write">
    제목: <input type="text" name="title"><br>
    작성자: <input type="text" name="author"><br>
    내용: <textarea name="content" id="content" cols="30" rows="10"></textarea><br>
    <input type="submit" value="저장">
  </form>
</body>
</html>
