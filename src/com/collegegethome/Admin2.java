package com.collegegethome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Dadmincontact;
import com.pojo.ContactGetset;


@WebServlet("/Admin2")
public class Admin2 extends HttpServlet {


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                                
		  response.setContentType("text/html");
          PrintWriter out =response.getWriter();
          
          String email = request.getParameter("email");
          String name = request.getParameter("name");
          String issue = request.getParameter("issue");
          String subject = request.getParameter("subject");
          
          
          ContactGetset cg = new ContactGetset();
          cg.setEmail(email);
          cg.setName(name);
          cg.setIssue(issue);
          cg.setSubject(subject);
  		
          
          
          int status = Dadmincontact.save(cg);
  	    if(status>0){  
             out.print("<p>Record saved successfully!</p>");  
  	    	
              request.getRequestDispatcher("contact.html").include(request, response);  
              
          }else{  
              out.println("Sorry! unable to save record");  
          }  
            
          out.close();  
       
          
          
          
          
          
  		   		
		
	}

}
