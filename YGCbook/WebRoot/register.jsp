<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>注册页面</title>
</head>
<body>
	<form action="register" method="get">
		<label for="username">姓名:</label>
		<input type="text" id="username" name="username" />
		<br>
		<label for="password">密码:</label>
		<input type="password" id="password" name="password" />
		<br>
		<input type="radio" id="sex1" name="sex" value="0">
		<label for="sex1">男</label>
		<input type="radio" id="sex2" name="sex" value="1">
		<label for="sex2">女</label>
		<br>
		<label for="major">专业</label>
		<select id="major" name="major">
			<option value="">-</option>
			<option value="0">计算机</option>
			<option value="1">英语</option>
			<option value="2">数学</option>
		</select>
		<br>
		<input type="checkbox" id="hobby1" name="hobby" value="0" />
		<label for="hobby1">足球</label>
		<input type="checkbox" id="hobby2" name="hobby" value="1" />
		<label for="hobby2">篮球</label>
		<input type="checkbox" id="hobby3" name="hobby" value="2" />
		<label for="hobby3">网球</label>
		<br>
		<textarea name="intro">abcd</textarea>
		<br>
		<input type="submit" value="提交" />
		<input type="reset" value="重置" />
	</form>
</body>
</html>