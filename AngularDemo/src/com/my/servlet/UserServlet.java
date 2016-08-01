package com.my.servlet;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Hashtable;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

@WebServlet(name="UserServlet" ,urlPatterns={"/Action.do"})
public class UserServlet extends HttpServlet {
	
	private static final long serialVersionUID = 3591607872095183484L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Writer data=resp.getWriter();
		//data.write("hiii Ashish");
		Hashtable<String, String> data1=new Hashtable<String, String>();
		data1.put("1", "Deepak");
		ArrayList<String>list=new ArrayList<String>();
		list.add("hiii");
		list.add("Deepak");
		JSONObject object=new JSONObject();
		try {
			object.put("Data", list);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resp.setContentType("application/json");
		data.write(object.toString());
		System.out.println( "Hiiiiiiiiiiiiiiiiiiiiiii");
		System.out.println("Kise ho ");
		
	}

}
