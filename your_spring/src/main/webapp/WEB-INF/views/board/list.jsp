<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board</title>
</head>
<body>
<c:import url="../header.jsp" />
<table>
	<tr>
		<th>No.</th>
		<th>제목</th>
		<th>날짜</th>
		<th>조회수</th>
		<th>작성자</th>
	</tr>
	<tr>
	<c:choose>
		<c:when test="${not empty sessionScope.logined}">
			<td>${sessionScope.list.board_id }</td>
			<td>${sessionScope.list.title }</td>
			<td>${sessionScope.list.b_date }</td>
			<td>${sessionScope.list.b_count }</td>
			<td>${sessionScope.list.userid }</td>
		</c:when>
	</c:choose>
	</tr>
</table>
<div>
	<input type="text" id="searchBox">
	<input type="button" value="search">
</div>
	<ul>
		<li><input type="button" value="글쓰기"></li>
	</ul>
<div>
</div>
</body>
</html>