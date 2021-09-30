package com.collegegethome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Dsellreq;
import com.pojo.SellingReq;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
                     response.setContentType("text/html");
                     PrintWriter out =response.getWriter();

                     
                     String fname = request.getParameter("fname");
                     
                      String email = request.getParameter("email");
        
                     String item = request.getParameter("item");
         
                     String phnno= request.getParameter("phnno");
                     
                     String loct= request.getParameter("loc");

                     String subject= request.getParameter("subject");
	
	
	SellingReq sr = new SellingReq();
	     sr.setFname(fname);
	     sr.setEmail(email);
	     sr.setItem(item);
	     sr.setLoct(loct);
	     sr.setPhnno(phnno);
	     sr.setSubject(subject);
	     
	     
	     int status = Dsellreq.save(sr);
	  	    if(status>0){  
	             out.print("<p>Record saved successfully!</p>");  
	  	    	
	              request.getRequestDispatcher("user2.jsp").include(request, response);  
	              
	          }else{  
	              out.println("Sorry! unable to save record");  
	          }  
	            
	          out.close();  
	     
	  
	
	
	}

}
