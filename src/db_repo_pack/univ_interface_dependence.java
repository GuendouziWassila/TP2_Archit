package db_repo_pack;


import java.sql.SQLException;

import add_pack.Universite;


public interface univ_interface_dependence {
	Universite GetById(int universityId) throws SQLException;	
}


