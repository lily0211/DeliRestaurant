package com.delibanhmi.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.delibanhmi.daofactory.DaoFactory;
import com.delibanhmi.daoimpl.InscriptionDaoImpl;
import com.delibanhmi.daointerface.InscriptionDaoInterface;
import com.delibanhmi.model.User;
import com.delibanhmi.verification.InscriptionVerification;

/**
 * Servlet implementation class InscriptionControlleur
 */
@WebServlet("/InscriptionControlleur")
public class InscriptionControlleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DaoFactory daoFactory;
	private InscriptionDaoInterface inscriptionDaoInterface;
	

	public void init() {
		
			try {
				this.daoFactory=DaoFactory.getInstance();
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		this.inscriptionDaoInterface=daoFactory.getInscriptionInterface();
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("abc");
		User user=new User();
		System.out.println("xyz");
		InscriptionVerification inscriptionVerification=new InscriptionVerification();
		System.out.println("123");
		user=inscriptionVerification.verifierUser(request);
		request.setAttribute("user", user);
		System.out.println("567");
		request.setAttribute("inscriptionVerification", inscriptionVerification);
		System.out.println("123");
		try {
			inscriptionDaoInterface.ajouterUser(request);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("wxyfez");
		this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
	}

}
