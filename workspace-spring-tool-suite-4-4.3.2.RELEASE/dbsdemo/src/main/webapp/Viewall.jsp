<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> welcome</h1>
<hr>
 <form action="displayAll">
<h2>
click here<br>
<input type="submit" name="submit" value="display all emp's">
</h2>
</form> 

<hr>

<form action="displayByID" method="post">
<h2>
enter emp id <input type="text" name="eid">
<input type="submit" name="submit" value="DISPLAY">
</h2></form>

<hr>

<form action="displayByDesign" method="post">
<h2>
enter designation <input type="text" name="design">
<input type="submit" name="submit" value="DISPLAY">
</h2>
</form>

<hr>

<form action="displayByAge" method="post">
<h2>
designation: <input type="text" name="designation"><br>
<input type="submit" name="submit" value="DISPLAY BY AGE">
</h2>
</form>

<hr>

<form action="insertstmt" method="post">
<h2>
ID: <input type="text" name="eid"><br>
Age: <input type="text" name="age"><br>
Design: <input type="text" name="designation"><br>
Ename: <input type="text" name="ename"><br>
<input type="submit" name="submit" value="Insert">
</h2>
</form>

<hr>

<form action="updatestmt" method="post">
<h2>
ID: <input type="text" name="eid"><br>
Age: <input type="text" name="age"><br>
Design: <input type="text" name="designation"><br>
Ename: <input type="text" name="ename"><br>
<input type="submit" name="submit" value="update">
</h2>
</form>

<hr>

<form action="deletestmt" method="post">
<h2>
ID: <input type="text" name="eid"><br>
<input type="submit" name="submit" value="delete">
</h2>
</form>

<hr>
<form action="collectdata" method="post">
<h2>
eid: <input type="text" name="eid"><br>
mgr: <input type="text" name="deptname"><br>
<input type="submit" name="submit" value="collect data">
</h2>
</form>
</body>
</html>