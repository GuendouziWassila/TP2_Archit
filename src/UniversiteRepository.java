import Affichages.IJournal;
import DataBase.DBConnection;
import Packages.TypePackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversiteRepository implements InterfaceUniversiteRepository{

	private IJournal AffichageListes;
	private Connection connect;
	private Statement stmt;

	public UniversiteRepository(IJournal AffichageListes){
		 this.AffichageListes = AffichageListes;
		try {
			this.connect = DBConnection.getConn();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	@Override
	public InterfaceUniversite GetById(int universityId) throws SQLException {
		System.out.println("LogBD : début recherche de id université dans la base de donnée");
		Statement stmt = connect.createStatement();
		String sql = "select * from universite where id_universite="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();	
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new Universite (rs.getInt(1),rs.getString(2),p);
			
		System.out.println("LogBD : université récupérée");
		
		connect.close();
		return u;	
	
		
	}	
	
}
