<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todo 목록 화면</title>
</head>
<body>
    <h1>Todo 목록 보기</h1>
    <div>
        ${todoList}
        <br>
        <a href="view">상세보기</a>
    </div>
    <div>
        <a href="create">새 Todo</a>
    </div>
</body>
</html>
