package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginController() {
        super();
    }
	User login(String username, String password) {
		if(username.equals("erra") && password.equals("pwd")) {
			return new User(username,password,"user");
			
		}else if(username.equals("izzati") && password.equals("pwd")) {
			return new User(username,password,"user");
		}
		return null;
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read client inputs sent by the client form
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String path = "";
		HttpSession session=request.getSession();
		
		//perform auth (leveraged to a seperate method)
		User user = login(username,password);
		if(user!= null) {
			user.setIsAuthenticated(true);
			path = "RecipeList/recipeList.jsp";
			session.setAttribute("user",user);

		}else {
			path ="Login/login_error.jsp";
		}
//		RequestDispatcher dispatch = request.getRequestDispatcher(path);
//		dispatch.forward(request, response);
		response.sendRedirect(path);
	}


}
