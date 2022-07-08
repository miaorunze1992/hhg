<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="co.jp.netwisdom.dto.UserinfoAndHobbyDTO"%>
  <%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户查询</title>
<% List<UserinfoAndHobbyDTO> dtos = (List<UserinfoAndHobbyDTO>)request.getAttribute("dtos");%>
</head>
<body>
	<form action="search" method="get">
		<label for="username">姓名：</label>
		<input type="text" id="username" name="username" />
		<br>
		<label for="sex1">性别：</label>
		<input type="radio" id="sex1" name="sex" value="0" />男
		<input type="radio" id="sex1" name="sex" value="1" />女
		<br>
		<label for="major">专业：</label>
		<select id="major" name="major">
			<option value="">-</option>
			<option value="0">计算机</option>
			<option value="1">数学</option>
			<option value="2">英语</option>
		</select>
		<br>
		<input type="submit" value="提交" />
		<input type="reset" value="重置" />
	</form>
	<hr>
	<table border="1">
		<tr style="background-color:yellow">
			<th>姓名</th>
			<th>性别</th>
			<th>专业</th>
			<th>爱好</th>
			<th>简介</th>
		</tr>
		<% if(dtos!=null){ %>
			<% int i = 0;%>
			<% for(UserinfoAndHobbyDTO dto :dtos){%>
			<% i++;%>
			<tr style="background-color:<%= i%2==1?"grey":"green"%>">
				<td><a href="userInit?username=<%=dto.getUsername()%>"><%=dto.getUsername() %></a></td>
				<td><%=dto.getSex().replace("0", "男").replace("1", "女")%></td>
				<td><%=dto.getMajor().replace("0", "计算机").replace("1", "数学").replace("2", "英语") %></td>
				<td>
					<%=dto.getHobbyList().contains("0")?"足球":""%>
					<%=dto.getHobbyList().contains("1")?"篮球":""%>
					<%=dto.getHobbyList().contains("2")?"网球":""%>
				</td>
				<td><%=dto.getIntro() %></td>
			</tr>
			<%}%>
		<%} %>
	</table>
	
</body>
</html>