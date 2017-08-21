<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/password.js"></script>
</head>
<body>
	<c:if test="${!empty allErrors}">
		<c:forEach items="${allErrors }" var="error">
			${error.defaultMessage}
		</c:forEach>
	</c:if>
	<form action="${pageContext.request.contextPath }/register"
		method="post">
		用户名：<input type="text" name="username"><br> 
		密码：<input type="password" name="password" id="pw"><br> 
		确认密码：<input type="password" name="password2" id="pw2"><br> 
		<input type="submit" value="注册" onclick="return check()">
	</form>
</body>
</html>