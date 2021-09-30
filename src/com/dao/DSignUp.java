package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import com.pojo.SignUpgetset;

import java.sql.*;



public class DSignUp {
	public static Connection getConnection()
	{
		Connection con=null;
		try {
			
			   Class.forName("com.mysql.cj.jdbc.Driver");  
		        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/boom","root","rootpassword");  
			
		} catch (Exception e) {System.out.println(e);}
		return con;
	}
	 public static int save(SignUpgetset signupgetset) 
	    {
		  int status=0;
		  try {
	        Connection con= getConnection();
		   PreparedStatement ps = con.prepareStatement("insert into signuptable1(email,psw,pswrepeat) values(?,?,?)");  
	       ps.setString(1,signupgetset.getEmail());  
	       ps.setString(2,signupgetset.getPsw());  
	       ps.setString(3,signupgetset.getPswrepeat());  
	    
	       status=ps.executeUpdate();  
	   }
		  catch(Exception e){System.out.println(e);}  
	   
		  return status;  
	}
}
