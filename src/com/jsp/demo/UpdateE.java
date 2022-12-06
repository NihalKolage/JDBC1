package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateE {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root";
		
		String sql="UPDATE PRODUCCT SET BRAND='PANTLOONS' WHERE Id=1";
		 Connection connection=null;
		  
	     try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection= DriverManager.getConnection(url, username, password);
			
			Statement statement=connection.createStatement();
			
			int a=statement.executeUpdate(sql);
			if(a>0) {
			System.out.println("uupdate ho gaya");
			}else {
				System.out.println("Not Updated");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			connection.close();
		}
	}

}
