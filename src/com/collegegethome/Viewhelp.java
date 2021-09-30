package com.collegegethome;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Dadmincontact;
import com.pojo.ContactGetset;

/**
 * Servlet implementation class Viewhelp
 */
@WebServlet("/Viewhelp")
public class Viewhelp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		                                response.setContentType("text/html");  
                                         PrintWriter out=response.getWriter();  
                                         out.println("<h1>help</h1>");  
                                         
	
                                         List<ContactGetset> list=Dadmincontact.getAllHelp();  
                                         
                                         out.print("<table border='1' width='100%'");  
                                         out.print("<tr><th>Email</th><th>Name</th><th>Issue</th><th>Subject</th></tr>"); 
                                         for(ContactGetset cg:list){  
                                        	  out.print("<tr><td>"+cg.getEmail()+"</td><td>"+cg.getName()+"</td><td>"+cg.getIssue()+"</td><td>"+cg.getSubject()+"</td><td></tr>");  
                                             }  
                                             out.print("</table>");  
                                               
                                             out.close();  
                                         }  
	
	
	
	}


