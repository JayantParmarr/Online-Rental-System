package com.collegegethome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DAdminLogin;
import com.pojo.AdminLogin;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   response.setContentType("text/html");
           PrintWriter out =response.getWriter();
           
           String email = request.getParameter("email");
           String password = request.getParameter("password");
           
           
           AdminLogin al =new AdminLogin();
           al.setEmail(email);
           al.setPassword(password);
           
           
           DAdminLogin dal = new DAdminLogin();
           if( dal.validate(email, password)){
	        	
	        	  RequestDispatcher rd=request.getRequestDispatcher("admin2.jsp");  
	              rd.forward(request,response);  
	          }  
	          else{  
	              out.print("Sorry username or password is incorrect");  
	              RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");  
	              rd.include(request,response);  
	         
	      
	          }  
	                
	          out.close();  
	          }  
           
	}


