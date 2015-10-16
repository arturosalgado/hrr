package com.hrr3.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hrr3.authentication.AuthenticationServiceHRR3Impl;



import org.zkoss.zul.Messagebox;


import com.hrr3.services.AuthenticationService;

/**
 * Servlet implementation class SsrController
 */
@WebServlet("/ssrcontroller")
public class SsrController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SsrController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/ssr.jsp");
	view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String date1 = request.getParameter("date1");
		String date2 = request.getParameter("date2");
		
		AuthenticationService authService = new AuthenticationServiceHRR3Impl();
		if (authService.getUserData().getCurrentHotel() == null
				|| authService.getUserData().getCurrentHotel().getHotelId() == null
				|| authService.getUserData().getCurrentHotel().getHotelId() < 1) {
			System.out.println("No hotel selected");
			return;
		}
		
		System.out.print(date1);
		System.out.print(date2);
		request.setAttribute("date1", date1);
		request.setAttribute("date2", date2);
		
		request.getRequestDispatcher("WEB-INF/views/ssr.jsp").forward(request, response);
	}

}
