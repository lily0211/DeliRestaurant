package com.delibanhmi.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.delibanhmi.daofactory.DaoFactory;
import com.delibanhmi.daointerface.InscriptionDaoInterface;

public class InscriptionDaoImpl implements InscriptionDaoInterface {

	DaoFactory daoFactory;
	public InscriptionDaoImpl(DaoFactory daoFactory) {
		this.daoFactory=daoFactory;
	}
	
	public void ajouterUser(HttpServletRequest request) throws SQLException{
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		String resultat=null;
		String query="INSERT INTO user (email, password, name, address, telephone) VALUES (?,?,?,?,?)";
	
		try {
			connection=daoFactory.getConnection();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		try {
			preparedStatement=connection.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		preparedStatement.setString(1, request.getParameter("email"));
		preparedStatement.setString(2, request.getParameter("password"));
		preparedStatement.setString(3, request.getParameter("name"));
		preparedStatement.setString(4, request.getParameter("address"));
		preparedStatement.setString(5, request.getParameter("telephone"));
		
		int reussi=preparedStatement.executeUpdate();
	
	if(reussi!=0) {
		resultat="felicitation, vous avez reussi";
	} else {
		resultat="votre mail est déjà existant, veuillez rentrer un autre mail";
	}
	}
	public void trouverUser() {
		// TODO Auto-generated method stub
		
	}


}
