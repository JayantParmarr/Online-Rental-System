package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.pojo.UserLogin;


public class DUserLogin {
	public static Connection getConnection()
	{
		Connection con=null;
		try {
			
			   Class.forName("com.mysql.cj.jdbc.Driver");  
		        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/boom","root","rootpassword");  
			
		} catch (Exception e) {System.out.println(e);}
		return con;
	}
	public static boolean validate(String email,String psw){  
		
		boolean status=false; 
	   try {
	        Connection con= getConnection();
		   PreparedStatement ps = con.prepareStatement("select * from signuptable1 where email=? and psw=?");  
          ps.setString(1,email );
          ps.setString(2,psw);  
      
           ResultSet rs=ps.executeQuery();  
           status=rs.next(); 
	      
	   }
		  catch(Exception e){System.out.println(e);}  
	   
		  return status;  
	}

	   
	}


