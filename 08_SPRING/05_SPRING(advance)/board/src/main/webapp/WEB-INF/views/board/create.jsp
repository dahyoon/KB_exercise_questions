<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<%@ include file="../layout/header.jsp" %>
<h1 class="page-header my-4">
    <i class="far fa-edit"></i>
    새 글쓰기
</h1>
<div>
    <form method="post" enctype="multipart/form-data">
        <div>
            <label>제목</label>
            <input class="form-control" name="title">
        </div>
        <div>
            <label>작성자</label>
            <input class="form-control" name="writer">
        </div>
        <div>
            <label>첨부파일</label>
            <input type="file" class="form-control-file boarder" multiple name="files">
        </div>
        <div>
            <label>내용</label>
            <textarea class="form-control" name="content" cols="1" rows="10"></textarea>
        </div>
        <div class="mt-4">
            <button class="btn btn-primary" type="submit">
                <i class="fas fa-check"></i>
                확인
            </button>
            <button class="btn btn-primary" type="reset">
                <i class="fas fa-undo"></i>
                취소
            </button>
            <a href="list" class="btn btn-primary">
                <i class="fas fa-list"></i>
                목록
            </a>
        </div>
    </form>
</div>

<%@ include file="../layout/footer.jsp"%>