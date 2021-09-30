package com.collegegethome;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Dsellreq;
import com.pojo.ContactGetset;
import com.pojo.SellingReq;

/**
 * Servlet implementation class ViewSellRequest
 */
@WebServlet("/ViewSellRequest")
public class ViewSellRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");  
         PrintWriter out=response.getWriter();  
         out.println("<h1>Sell request</h1>");  
         
         List<SellingReq> list=Dsellreq.getAllRequest();
         
         out.print("<table border='1' width='100%'");  
         out.print("<tr><th>Name</th><th>Email</th><th>Item</th><th>Location</th><th>Phone_no</th><th>Subject</th></tr>"); 
         for(SellingReq sr:list){  
        	  out.print("<tr><td>"+sr.getFname()+"</td><td>"+sr.getEmail()+"</td><td>"+sr.getItem()+"</td><td>"+sr.getLoct()+"</td><td>"+sr.getPhnno()+"</td><td>"+sr.getSubject()+"</td></tr>");  
             }  
             out.print("</table>");  
               
             out.close();  
         }  







         
	}


