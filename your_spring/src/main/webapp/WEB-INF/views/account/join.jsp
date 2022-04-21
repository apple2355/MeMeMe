<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MeMeMe Join</title>
</head>
<body>
<c:import url="../header.jsp" />
	<h1>MeMeMe Join</h1>
		<form action="./join" method="post">
		<h3>ID</h3>
		<div>
			<input type="text" name="userid">
		</div>
		<div id="id_error">아이디 중복확인 창</div>
		<h3>PW</h3>
		<div>
			<input type="password" name="pw">
		</div>
		<div id="pw_error">비밀번호 확인 메시지</div>
		<button type="submit">Join Go :D</button>
		</form>
</body>
</html>