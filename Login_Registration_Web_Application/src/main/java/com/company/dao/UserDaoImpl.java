package com.company.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.company.util.DatabaseConnection;
import com.company.util.User;

public class UserDaoImpl implements UserDao{
	
	@Override
	public  boolean addUser(User user) {
		String sql="INSERT INTO users (username,email,password)  VALUES(?,?,?)";
		try {
			Connection connection =DatabaseConnection.getConnection();
			PreparedStatement statement =connection.prepareStatement(sql);
			statement.setString(1,user.getName());
	      statement.setString(2, user.getEmail());
	      statement.setString(3, user.getPassword());
	      int resultAffected =statement.executeUpdate();
	      System.out.println("Data Inserted...");
	      return resultAffected>0;
		} catch (Exception e) {
			System.out.println("Data not inserted....");
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean isValidUser(String username,String password) {
		
		  String sql="SELECT * FROM users WHERE username=? AND password=?";
		  try {
			  Connection  connection = DatabaseConnection.getConnection();
			  PreparedStatement preparedStatement =connection.prepareStatement(sql);
			  preparedStatement.setString(1,username);
			  preparedStatement.setString(2, password);
			  ResultSet resultSet =preparedStatement.executeQuery();
			  System.out.println("Query started.....");
			  return resultSet.next();
			 
		  }catch(Exception e) {
			  e.printStackTrace();
		      return false;
		  }

	}

}
