package com.jee.Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CollectData extends HttpServlet 
{
	private Connection con;
	private PreparedStatement pstmt;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String name = encrypt(req.getParameter("name"));
		String email = encrypt(req.getParameter("email"));
		String mobile = encrypt(req.getParameter("mobile"));
		String address = encrypt(req.getParameter("address"));
		String city = encrypt(req.getParameter("city"));
		String password = encrypt(req.getParameter("password"));
		
//		StringBuffer sb = new StringBuffer();
//		
//		for(int i=0;i<name.length();i++)
//		{
//			sb.append((char)(name.charAt(i)+2));	
//		}
//		System.out.println();
//		StringBuffer encryptName = encrypt(name);
//		StringBuffer encryptEmail = encrypt(email);
//		
//		resp.getWriter().println("Encrypted Data\n"+encryptName +"    "+ encryptEmail+"\n\n");
//		
//		StringBuffer decryptName = decrypt(encryptName);
//		StringBuffer decryptEmail = decrypt(encryptEmail);
//		
//		resp.getWriter().println("Decrypted Data\n"+decryptName +"    "+ decryptEmail+"\n\n");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","Haasan@21");
			
			String sql = "INSERT INTO CUSTOMER(username,email,mobile,address,city,password) VALUES(?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1,name);
			pstmt.setString(2,email);
			pstmt.setString(3,mobile);
			pstmt.setString(4,address);
			pstmt.setString(5,city);
			pstmt.setString(6,password);
			
			if(pstmt.executeUpdate()==1)
			{
				resp.sendRedirect("success.jsp");
			}
			else
			{
				resp.sendRedirect("failure.jsp");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	String encrypt(String str)
	{
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<str.length();i++)
		{
			sb.append((char)(str.charAt(i)+2));	
		}
		return sb.toString();
	}
	
	String decrypt(StringBuffer str)
	{
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<str.length();i++)
		{
			sb.append((char)(str.charAt(i)-2));	
		}
		return sb.toString();
	}
}
