<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br>
<center>
<form action="UploadServlet" method="post" enctype="multipart/form-data">
<table width="400px" align="center" border=2>
<tr>
<td align="center" colspan="2">Form details</td>
</tr>
<tr>
<td>First Name</td>
<td>
<input type="text" required="" name="firstname">
</td>
</tr>
<tr>
<td>Last Name</td>
<td>
<input type="text" required="" name="lastname">
</td>
</tr>
<tr>
<td>Select file</td>
<td>
<input type="file" required="" name="file">
</td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="submit"></td>
</tr>
</table>
</form>
<br><a href="file-list.jsp">View list</a>
</center>
</body>
</html>






</form>

</center>
</body>
</html>