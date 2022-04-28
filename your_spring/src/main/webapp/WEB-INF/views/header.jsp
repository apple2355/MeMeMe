<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${path }/resources/css/header.css">
<script src="//code.jquery.com/jquery-3.6.0.min.js"></script>
<title>MeMeMe :)</title>
</head>
<body>
<header>

	<div class="logo">
		<a href="/">MeMeMe</a>
	</div>
	<div class="widget">
		<c:choose>
			<c:when test="${not empty sessionScope.logined }">
				<div class="widgetL">${account.userid}님 어서오세요 :)</div>
				<div class="widgetR">
					<ul>
						<li><a href="./info">mypage</a></li>
						<li><a href=./logout>logout</a></li>
					</ul>
				</div>
			</c:when>
			<c:otherwise>
				<div class="widgetR">
					<ul>
						<li><a href="./login">login</a></li>
						<li><a href="./join">join</a></li>
					</ul>
				</div>
			</c:otherwise>
		</c:choose>
	</div>
</header>
</body>
</html>