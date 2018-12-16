<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
<title>查询商品列表</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js"></script>
</head>
<body>
	<form id="jvForm" action="${pageContext.request.contextPath }/items/queryItems" method="post">
	<center><h1>商品列表</h1></center>
	<table width="100%" border=1>
		<tr>
			<td><input type="checkbox" onclick="checkBox('ids',this.checked)"/></td>
			<td>商品名称</td>
			<td>商品价格</td>
			<td>商品描述</td>
			<td>操作</td>
		</tr>
		
		<%-- 提示: 使用jstl标签 + el表达式进行遍历取值--%>
		<c:forEach items="${list}" var="item">
			<tr>
				<td><input type="checkbox" name="ids" value="${item.id }"></td>
				<td>${item.name }</td>
				<td>${item.price }</td>
				<td>${item.detail }</td>
				<td>
					<a href="${pageContext.request.contextPath }/items/jumpUpdate?id=${item.id}">修改</a>
					<a href="deleteOneById?id=${item.id}">删除</a>
				</td>
			</tr>
		</c:forEach>
		<a href="jumpInsert">添加</a>
	</table>
	</form>
</body>
</html>