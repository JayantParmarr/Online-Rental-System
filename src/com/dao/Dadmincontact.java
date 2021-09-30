package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pojo.ContactGetset;

public class Dadmincontact {

	public static Connection getConnection()
	{
		Connection con=null;
		try {
			
			   Class.forName("com.mysql.cj.jdbc.Driver");  
		        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/boom","root","rootpassword");  
			
		} catch (Exception e) {System.out.println(e);}
		return con;
	}
	 public static int save(ContactGetset cg) 
	    {
		  int status=0;
		  try {
	        Connection con= getConnection();
		   PreparedStatement ps = con.prepareStatement("insert into contactus(email,name,issue,subject) values(?,?,?,?)");  
	       ps.setString(1,cg.getEmail());  
	       ps.setString(2,cg.getName());  
	       ps.setString(3,cg.getIssue());
	       ps.setString(4, cg.getSubject());
	    
	       status=ps.executeUpdate();  
	   }
		  catch(Exception e){System.out.println(e);}  
	   
		  return status;  
	}
	   public static List<ContactGetset> getAllHelp(){  
	        List<ContactGetset> list=new ArrayList<ContactGetset>();  
	          
	        try{  
	            Connection con=getConnection();  
	            PreparedStatement ps=con.prepareStatement("select * from contactus");  
	            ResultSet rs=ps.executeQuery();  
	            while(rs.next()){  
	                ContactGetset cg=new ContactGetset();  
	                cg.setEmail(rs.getString(1));
	               cg.setName(rs.getString(2));
	               cg.setIssue(rs.getString(3));
	               cg.setSubject(rs.getString(4));
	       
	                list.add(cg);  
	            }  
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return list;  
	    }
	 

}

	

