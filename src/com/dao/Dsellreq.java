package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pojo.ContactGetset;
import com.pojo.SellingReq;

public class Dsellreq {


		public static Connection getConnection()
		{
			Connection con=null;
			try {
				
				   Class.forName("com.mysql.cj.jdbc.Driver");  
			        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/boom","root","rootpassword");  
				
			} catch (Exception e) {System.out.println(e);}
			return con;
		}


	public static int save(SellingReq sr) 
    {
	  int status=0;
	  try {
        Connection con= getConnection();
	   PreparedStatement ps = con.prepareStatement("insert into sellrequest(fname,email,item,loct,phnno,subject) values(?,?,?,?,?,?)");  
       ps.setString(1,sr.getFname());  
       ps.setString(2,sr.getEmail());  
       ps.setString(3,sr.getItem());
       ps.setString(4, sr.getLoct());
       ps.setString(5, sr.getPhnno());
       ps.setString(6, sr.getSubject());
    
       status=ps.executeUpdate();  
   }
	  catch(Exception e){System.out.println(e);}  
   
	  return status;  
}
	  public static List<SellingReq> getAllRequest(){  
	        List<SellingReq> list=new ArrayList<SellingReq>();  
	          
	        try{  
	            Connection con=getConnection();  
	            PreparedStatement ps=con.prepareStatement("select * from sellrequest");  
	            ResultSet rs=ps.executeQuery();  
	            while(rs.next()){  
	              SellingReq sr = new SellingReq();
	              sr.setFname(rs.getString(1));
	              sr.setEmail(rs.getString(2));
	                sr.setItem(rs.getString(3));
	                sr.setLoct(rs.getString(4));
	                sr.setPhnno(rs.getString(5));
	                sr.setSubject(rs.getString(6));
	       
	                list.add(sr);  
	            }  
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return list;  
	    }
	 

}

	


