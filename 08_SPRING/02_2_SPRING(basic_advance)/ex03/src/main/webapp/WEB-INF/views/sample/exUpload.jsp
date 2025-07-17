<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>파일 업로드 화면</title>
</head>
<body>
<form action="/sample/exUploadPost" method="post" enctype="multipart/form-data" accept-charset="UTF-8">
    <div>
        <input type="file" name="files"/>
    </div>
    <div>
        <input type="file" name="files"/>
    </div>
    <div>
        <input type="file" name="files"/>
    </div>
    <div>
        <input type="file" name="files"/>
    </div>
    <div>
        <input type="file" name="files"/>
    </div>
    <div>
        <input type="submit"/>
    </div>
</form>
</body>
</html>
