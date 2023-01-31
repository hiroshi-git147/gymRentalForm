<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "model.Gym"  %>
<%
	Gym g = (Gym) request.getAttribute("gym");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>体育館の利用料金</h1>
	<p><%= g.getName() %> ご利用</p>
	<p>ご利用地域：<%= g.getArea() %></p>
	<p>基本使用料（2時間） 2000円<br>
	<p>夜間照明（1000円）：<span class = "used">不使用</span></p>
	<p>ネット（300円）：<span class = "used">不使用</span></p>
	<p>ボール X 10個（400円）：<span class = "used">不使用</span></p>

	<h2>合計金額：<%= g.getTotal() %></h2>

	<a href = "/ex-gym/GymServlet">戻る</a>

</body>
</html>