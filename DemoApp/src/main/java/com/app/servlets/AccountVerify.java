package com.app.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.app.database.DatabaseConnection;
import com.app.util.JWTUtil;

/**
 * Servlet implementation class AccountVerify
 */
@WebServlet("/AccountVerify")
public class AccountVerify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountVerify() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String arg = request.getParameter("token");
		System.out.println("This is the token" + arg);
		String userEmail = JWTUtil.verifyJWT(arg);
		try {
			DatabaseConnection.verifyUser(userEmail);
			System.out.println("Account Verification Success");
		} catch (Exception e) {
			System.out.println("Account Verification Failed");
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
