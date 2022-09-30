package com.question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;



public class Demo {

	public static void main(String[] args) {
		
		
		//FOR INSERTION INTO STUDENTS
		
		
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		String url="jdbc:mysql://localhost:3306/evaluation4";
//		
//		
//		try(Connection conn=DriverManager.getConnection(url,"root", "root")){
//			
//			Statement st=conn.createStatement();
//			int x=st.executeUpdate("insert into student values(14,'Suresh','Bihar','6210959988');");
//			if(x>0)
//			System.out.println("Inserted");
//			else
//				System.out.println("not inserted");
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
		
		
		
		
		
//		// for insertion into course
//		
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		String url="jdbc:mysql://localhost:3306/evaluation4";
//		
//		
//		try(Connection conn=DriverManager.getConnection(url,"root", "root")){
//			
//			Statement st=conn.createStatement();
//			int x=st.executeUpdate("insert into Course values(105,'Angular',45000,'6');");
//			if(x>0)
//			System.out.println("Inserted");
//			else
//				System.out.println("not inserted");
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
		
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the roll" );
//		int roll=sc.nextInt();
//		
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		String url="jdbc:mysql://localhost:3306/evaluation4";
//		
//		
//		try(Connection conn=DriverManager.getConnection(url,"root", "root")){
//			
//			PreparedStatement ps=conn.prepareStatement("select s.roll,s.name,s.address,c.cname,c.fee from student s INNER JOIN Course c INNER JOIN Student_Course sc ON s.roll=sc.roll AND c.cid=sc.cid where s.roll=?");
//			ps.setInt(1, roll);
//			ResultSet rs=ps.executeQuery();
//			
//			while(rs.next()) {
//				
//				
//				int r=rs.getInt("roll");
//				String s=rs.getString("name");
//				String s2=rs.getString("address");
//				String s3=rs.getString("cname");
//				int fee=rs.getInt("fee");
//				
//				
//				System.out.println("name is:"+s);
//				System.out.println("roll is "+r);
//				System.out.println("Course is "+s3);
//				System.out.println("Addres is "+s2);
//				System.out.println("Fee is "+fee);
//				
//				
//				System.out.println("======================");
//			
//				
//			}
//			
//		}
//		catch(Exception e)
//		{
//			System.out.println("No record Found");
//		}
		
		
		
		
		
		//Taking course name
		
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the course Name" );
		String courseName=sc.next();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/evaluation4";
		
		
		try(Connection conn=DriverManager.getConnection(url,"root", "root")){
			
			PreparedStatement ps=conn.prepareStatement("select s.roll,s.name,s.address,c.cname,c.fee from student s INNER JOIN Course c INNER JOIN Student_Course sc ON s.roll=sc.roll AND c.cid=sc.cid where c.cname=?");
			ps.setString(1, courseName);
			int flag=0;
			ResultSet rs=ps.executeQuery();
			
			
			while(rs.next()) {
				
				flag=1;
				int r=rs.getInt("roll");
				String s=rs.getString("name");
				String s2=rs.getString("address");
				String s3=rs.getString("cname");
				int fee=rs.getInt("fee");
				
				
				System.out.println("name is:"+s);
				System.out.println("roll is "+r);
				System.out.println("Course is "+s3);
				System.out.println("Addres is "+s2);
				System.out.println("Fee is "+fee);
				
				
				System.out.println("======================");
			
				
			}
			if(flag==0)
				System.out.println("No record found");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		

	}

}
