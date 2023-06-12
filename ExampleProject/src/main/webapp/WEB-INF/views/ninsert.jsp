<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>공지사항 등록</h1>
	<form action="ninsert.do" method="post">
		제목 : <input type="text" size="80" name="title"><br>
		작성자 : <input type="text" name="writer" value="zxsi2003"><br>
		내용 : <textarea rows="10" cols="80" name="content"></textarea><br><br>
		<input type="submit" value="등록 하기">
	</form>
</body>
</html>