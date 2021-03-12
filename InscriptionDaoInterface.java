package com.delibanhmi.daointerface;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public interface InscriptionDaoInterface {
public void ajouterUser(HttpServletRequest request) throws SQLException;
public void trouverUser();
}
