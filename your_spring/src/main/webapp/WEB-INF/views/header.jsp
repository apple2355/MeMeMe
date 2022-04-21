<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MeMeMe :)</title>
</head>
<body>
<a href="/">Logo</a>
<c:choose>
	<c:when test="${not empty sessionScope.logined }">
		<div>${account.userid}님 어서오세요 :)</div>
		<div>
			<ul>
				<li><a href="./info">mypage</a></li>
				<li><a href=./logout>logout</a></li>
			</ul>
		</div>
	</c:when>
	<c:otherwise>
		<div>
			<ul>
				<li><a href="./login">login</a></li>
				<li><a href="./join">join</a></li>
			</ul>
		</div>
	</c:otherwise>
</c:choose>
</body>
</html>