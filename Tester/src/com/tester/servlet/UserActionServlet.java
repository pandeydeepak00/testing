package com.tester.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(name="UserAction",urlPatterns={"/UserAction.do"})
public class UserActionServlet extends HttpServlet {
	private HttpServletRequest req;
	private HttpServletResponse resp;
	private HttpSession session;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String action=req.getParameter("action");
		session=req.getSession();
		if(action!=null&&action.equals("Login")){
			this.req=req;
			this.resp=resp;
			login();
		}
	}
	private void login() throws IOException{
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		if(email!=null&&(!email.equals(""))&&password!=null&&(!password.equals(""))){
			if (session.getAttribute("validUser") != null && session.getAttribute("validUser").equals("true")) {
				resp.sendRedirect("status.jsp");
			} else if (email != null && email.equalsIgnoreCase("Deepak") && password.equalsIgnoreCase("Deepak")) {
				session.setAttribute("validUser", "true");
				resp.sendRedirect("Home.jsp");
			}else{
				session.setAttribute("ERROR", "Please Enter Valid Email or Password");
				resp.sendRedirect("index.jsp");
			}

		}

	}
}
