/**
 * 
 */
package com.day1.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 98591
 * 
 * 
 * SpringBoot整合Servlet方式二
 */
public class SecondServle extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("-----------------------SecondServlet----------------------------");
	}
	
}
