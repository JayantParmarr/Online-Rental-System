package com.collegegethome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DUserLogin;
import com.pojo.UserLogin;


@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	
 protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	                       
		           response.setContentType("text/html");
		           PrintWriter out =response.getWriter();
		           
		           String email = request.getParameter("email");
		           String psw = request.getParameter("psw");
		           
		           
		           UserLogin ul = new UserLogin();
		           ul.setEmail(email);
		           ul.setPsw(psw);
		          
		           
		         DUserLogin dul = new DUserLogin();
		        if( dul.validate(email, psw)){
		        	
		        	  RequestDispatcher rd=request.getRequestDispatcher("user2.jsp");  
		              rd.forward(request,response);  
		          }  
		          else{  
		              out.print("Sorry username or password is incorrect");  
		              RequestDispatcher rd=request.getRequestDispatcher("user.jsp");  
		              rd.include(request,response);  
		         
		      
		          }  
		                
		          out.close();  
		          }  
		
	}


