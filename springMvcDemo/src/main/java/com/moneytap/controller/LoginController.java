package com.moneytap.controller;
import com.moneytap.util.Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response){
		String uname=request.getParameter("uname");
		String passwd=request.getParameter("passwd");
		
		boolean status=authenticateUser(uname,passwd,"company");
		ModelAndView mv=new ModelAndView();
		System.out.println(status);
		mv.setViewName("display.jsp");
		mv.addObject("status",status);
		if(status){
			
			mv.addObject("username",uname);
			
					
		}
		return mv;
		//return null;
	}
	public static boolean authenticateUser(String uname, String passwd, String database){
		try {
			Connection con=Util.connectDB(database);
			 Statement statement=con.createStatement();
            
            String query= "select * from employees where empname = '" + uname + "'and empid= '"+passwd+"'";
            System.out.println(query);
             ResultSet rs=statement.executeQuery(query);
            if(rs.next()){
            	return true;
            }
		} catch (ClassNotFoundException e) {
			 System.out.println("class Not Found Exception");
		} catch (SQLException e) {
			System.out.println("SQL Exception");
		}
		return false;
		
	}
	/*
	@RequestMapping("/login")
	public String login(){
		System.out.println("Inside Login ");
		return "display.jsp";
	}
	*/
}
