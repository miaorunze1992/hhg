<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="co.jp.netwisdom.dto.UserinfoAndHobbyDTO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<% UserinfoAndHobbyDTO dto = (UserinfoAndHobbyDTO)request.getAttribute("dto");%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>注册页面</title>
<style>
 .btn {
     background-color: lightskyblue;
    border: none;
    color: white;
    padding: 10px 14px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;

 }
 #btn2 {
  background-color: red;
 }
 



</style>
</head>

<%if(dto==null){%>
	<form action="register" method="get" style="color:white">
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
		<input type="submit" value="提交" class="btn"/>
		<input type="reset" value="重置" class="btn" id="btn2" />
	</form>
<%}else{%>

	<form action="update" method="get" style="color:white">
		<label for="username">姓名:</label>
		<input type="text" id="username" name="username" readonly value="<%=dto.getUsername() %>"/>
		<br>
		<label for="password">密码:</label>
		<input type="password" id="password" name="password" value="<%=dto.getPassword() %>" />
		<br>
		<input type="radio" id="sex1" name="sex" value="0" <%=dto.getSex().equals("0")?"checked":"" %>>
		<label for="sex1">男</label>
		<input type="radio" id="sex2" name="sex" value="1" <%=dto.getSex().equals("1")?"checked":"" %>>
		<label for="sex2">女</label>
		<br>
		<label for="major">专业</label>
		<select id="major" name="major">
			<option value="">-</option>
			<option value="0" <%=dto.getMajor().equals("0")?"selected":"" %>>计算机</option>
			<option value="1" <%=dto.getMajor().equals("1")?"selected":"" %>>英语</option>
			<option value="2" <%=dto.getMajor().equals("2")?"selected":"" %>>数学</option>
		</select>
		<br>
		<input type="checkbox" id="hobby1" name="hobby" value="0" <%=dto.getHobbyList().contains("0")?"checked":"" %> />
		<label for="hobby1">足球</label>
		<input type="checkbox" id="hobby2" name="hobby" value="1" <%=dto.getHobbyList().contains("1")?"checked":"" %>/>
		<label for="hobby2">篮球</label>
		<input type="checkbox" id="hobby3" name="hobby" value="2" <%=dto.getHobbyList().contains("2")?"checked":"" %>/>
		<label for="hobby3">网球</label>
		<br>
		<textarea name="intro"><%=dto.getIntro() %></textarea>
		<br>
		<input type="submit" value="更新" class="btn"/>
		<input type="reset" value="重置" class="btn" id="btn2" />
	</form>
	
<%} %>
<body style="background-image:url(images/background.jpg)">
	
</body>
</html>