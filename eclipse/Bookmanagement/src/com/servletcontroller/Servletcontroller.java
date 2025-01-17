package com.servletcontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.book.Book;
import com.dao.DAOLayer;

/**
 * Servlet implementation class Servletcontroller
 */
@WebServlet("/Servletcontroller")
public class Servletcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String s=request.getParameter("bookdetails");
		    if(s==null) {
		    	s="viewall";
		    }
		    PrintWriter out=response.getWriter();
			DAOLayer dao=new DAOLayer();
			
	        if(s.equals("add")) {
	        	ArrayList<Book> ar=new ArrayList<>();
	      	  int bookid=Integer.parseInt(request.getParameter("bookid"));
	  		  String title=request.getParameter("title");
	  		  String author=request.getParameter("author");
	  		  int price=Integer.parseInt(request.getParameter("price"));
	      	  Book b = new Book(bookid,title,author,price);
	      	  String message=dao.insertData(b);
	      	  if(message.equals("success")){
	      		  ar.add(b);
	      		RequestDispatcher rd=request.getRequestDispatcher("jsps/success.jsp");
	      		request.setAttribute("list", ar);
	      		rd.forward(request, response);
	      	  }
	      	  else {
	      		RequestDispatcher rd=request.getRequestDispatcher("jsps/failure.jsp");
	      		rd.forward(request, response); 
	      	  }
	      }
	      if(s.equals("update")) {
	      	ArrayList<Book> ar=new ArrayList<>();
	      	  int bookid=Integer.parseInt(request.getParameter("bookid"));
	  		  String title=request.getParameter("title");
	  		  String author=request.getParameter("author");
	  		  int price=Integer.parseInt(request.getParameter("price"));
	  		  Book b = new Book(bookid,title,author,price);
	  		  String message=dao.updateData(b);
	  		  if(message.equals("success")){
	  			  ar.add(b);
	        		RequestDispatcher rd=request.getRequestDispatcher("jsps/success.jsp");
	          		request.setAttribute("list",ar);
	          		rd.forward(request, response);
	    	  }
	    	  else {
	        		RequestDispatcher rd=request.getRequestDispatcher("jsps/failure.jsp");
	          		rd.forward(request, response); 
	    	  }
	      }
	      if(s.equals("delete")) {
	      	ArrayList<Book> ar=new ArrayList<>();
	      	  int bookid=Integer.parseInt(request.getParameter("bookid"));
	      	  Book b=dao.viewData(bookid);
	      	  String message=dao.deleteData(bookid);
	      	  if(message.equals("success")){
	      		  ar.add(b);
	        		RequestDispatcher rd=request.getRequestDispatcher("jsps/success.jsp");
	          		request.setAttribute("list", ar);
	          		rd.forward(request, response);
	    	  }
	    	  else {
	        		RequestDispatcher rd=request.getRequestDispatcher("jsps/failure.jsp");
	          		rd.forward(request, response); 
	    	  }
	      }
	      if(s.equals("view")) { 
	    	ArrayList<Book> ar=new ArrayList<>();
	      	int bookid=Integer.parseInt(request.getParameter("bookid"));
	      	Book b=dao.viewData(bookid);
	      	ar.add(b);
	  		RequestDispatcher rd=request.getRequestDispatcher("jsps/success.jsp");
	  		request.setAttribute("list", ar);
	  		rd.forward(request, response);
	      }
	      if(s.equals("viewall")) {
	    	  ArrayList<Book> ar=new ArrayList<>();
	          ar=dao.viewAllData();
	    		RequestDispatcher rd=request.getRequestDispatcher("jsps/success.jsp");
	      		request.setAttribute("list", ar);
	      		rd.forward(request, response);
		}
	}

}
