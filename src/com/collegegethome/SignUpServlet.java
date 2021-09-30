package com.collegegethome;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.dao.*;
import com.pojo.*;

import javafx.scene.control.Alert;

@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		          
	    response.setContentType("text/html");
	    PrintWriter out= response.getWriter();
	    
	    String email = request.getParameter("email");
	    String psw = request.getParameter("psw");
	    String pswrepeat = request.getParameter("pswrepeat");
	      
	    
	    SignUpgetset signupgetset = new SignUpgetset();
	    signupgetset.setEmail(email);
	    signupgetset.setPsw(pswrepeat);
	    signupgetset.setPswrepeat(pswrepeat);
	    
	    
	    int status = DSignUp.save(signupgetset);
	    if(status>0){  
           // out.print("<p>Record saved successfully!</p>");  
	    	
            request.getRequestDispatcher("user.jsp").include(request, response);  
            
        }else{  
            out.println("Sorry! unable to save record");  
        }  
          
        out.close();  
     
	    
	   
	  
	    
	    
	    
	    
	    
	    
	    /* out.print("<html>");
	    out.print("<head>");
	    out.print("<body>");
	    out.print("<p>"+email+"</p>");
	    out.print("</body></head></html>"); */
		
	}

}
