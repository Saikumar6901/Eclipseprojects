<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  import="com.bean.book.Book,com.dao.DAOLayer,javax.servlet.RequestDispatcher"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% int x=Integer.parseInt(request.getParameter("bookid"));
DAOLayer dao=new DAOLayer(); %>
<form method="post" action="../Servletcontroller">
 book id: <input type="number" name="bookid"  value=<%= x %> required><br></br>
 <% Book b= new DAOLayer().viewData(x); %>
 <%if(b.getAuthor()!=null && b.getTitle()!=null){ %>
 title: <input type="text" name="title" value=<%= b.getTitle() %> required><br></br>
 author: <input type="text" name="author" value=<%= b.getAuthor() %> required><br></br>
 price: <input type="number" name="price" value=<%= b.getPrice() %> required><br></br>
 <input type="hidden" name="bookdetails" value="update">
 <input type="submit" class="subbutton" value="submit"><br>
 <% } else {
	request.getRequestDispatcher("failure.jsp").forward(request,response);
	 }
%>
 
 </form>
</body>
</html>