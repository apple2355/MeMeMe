<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MeMeMe Login</title>
</head>
<body>
<c:import url="../header.jsp" />
	<section>
	<h1>MeMeMe Login</h1>
		<form action="./login" method="post">
			<div class="login_form">
				<h3>ID:</h3>
				<input type="text" name="userid" placeholder="아이디를 입력하세요.">
				<h3>PW:</h3>
				<input type="password" name="pw" placeholder="비밀번호를 입력하세요.">
			</div>
			<c:if test="${error eq true}">
				<div id="loginFail">${error_msg}</div>
			</c:if>
			<button type="submit" id="login_bt">Login Go:D</button>
		</form>
	</section>
</body>
</html>