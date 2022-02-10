package db_repo_pack;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import add_pack.TypePackage;
import add_pack.Universite;
import composant_pack.App_composite;

public class UniversiteRepository implements univ_interface_dependence {
	String cla="la classe est UniversiteRepository";
	@Override
public Universite GetById(int universityId) throws SQLException {
		
		//DBConnection BD= new DBConnection();
		Connection connect=DBConnection.getConn(); 
		Statement stmt = connect.createStatement();
		//System.out.println("LogBD : d�but recherche de id universit� dans la base de donn�e");
		App_composite.setMessage("LogBD : d�but recherche de id universit� dans la base de donn�e, "+cla);
		String sql = "select * from universite where id_universite="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();	
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new Universite (rs.getInt(1),rs.getString(2),p);
			
		//System.out.println("LogBD : universit� r�cup�r�e");
		App_composite.setMessage("LogBD : universit� r�cup�r�e, "+cla);
		//connect.close();
		return u;	
	
		
	}	
	
}
