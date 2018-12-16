<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改商品信息</title>

</head>
<body>
	<!-- enctype="multipart/form-data" -->
	<form id="itemForm" action="${pageContext.request.contextPath }/items/updateOne" method="post">
		<%-- 提示: 根据id查询进行表单数据回显 + 隐藏域提交表单数据--%>
		
		<input type="hidden" name="id" value="${items.id}" />
		<center><h1>修改商品信息</h1></center>
		<table width="100%" border=1>
			<tr>
				<td>商品名称</td>
				<td><input type="text" name="name" value="${items.name}" /></td>
			</tr>
			<tr>
				<td>商品价格</td>
				<td><input type="text" name="price" value="${items.price}" /></td>
			</tr>

			<tr>
				<td>商品简介</td>
				<td><textarea rows="3" cols="30" name="detail">${items.detail} </textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="提交" /></td>
			</tr>
		</table>

	</form>
</body>

</html>