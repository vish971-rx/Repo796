package com.lti.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpServlet
 */
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String res1=request.getParameter("empName");
		int res2=Integer.parseInt(request.getParameter("empId"));
		out.println(res1);
		out.println(res2);
		InputStream is=getClass().getClassLoader().getResourceAsStream("config.properties");
		Properties prop =new Properties();
		prop.load(is);
		String driver=(String)prop.get("db.driver");
		String url=(String)prop.get("db.url");
		String user=(String)prop.get("db.user");
		String password=(String)prop.get("db.password");
		try {
        	Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("connection established..");
            PreparedStatement ps = con
                    .prepareStatement("insert into Employee values(?,?)");
 
            ps.setInt(1, res2);
            ps.setString(2, res1);
//            ps.setString(3, lname);
//           
//            ps.setString(4, dob);
//            ps.setString(5, city);
// 
            int i = ps.executeUpdate();
            if (i > 0)
                out.print("<br>"+"You have successfully registered the values...");
 con.close();
        } catch (Exception e2) {
            System.out.println(e2);
        }

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
