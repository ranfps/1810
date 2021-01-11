package com.bw.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bw.entity.User;
import com.bw.service.UserService;
import com.bw.service.impl.UserServiceImpl;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/user")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService us = new UserServiceImpl();
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置字符集
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String path = request.getParameter("path");
		if("list".equals(path)) {
			list(request,response);
		}
	}
	//查询所有
	private void list(HttpServletRequest request, HttpServletResponse response) {
		List<User>list = us.findlist();
		for (User user : list) {
			System.out.println(user);
		}
	}

}
