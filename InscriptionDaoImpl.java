package com.delibanhmi.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.delibanhmi.daofactory.DaoFactory;
import com.delibanhmi.daointerface.InscriptionDaoInterface;
import com.delibanhmi.model.User;
import com.delibanhmi.verification.InscriptionVerification;

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
		User user=new User();
		InscriptionVerification inscriptionVerification = new InscriptionVerification();
		user=inscriptionVerification.verifierUser(request);
		preparedStatement.setString(1, user.getEmail());
		preparedStatement.setString(2, user.getPassword());
		preparedStatement.setString(3, user.getName());
		preparedStatement.setString(4, user.getAddress());
		preparedStatement.setString(5, user.getTelephone());
		
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
