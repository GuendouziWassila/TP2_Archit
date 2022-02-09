/* cette modification nous offre de multiples façons de déplacer le code étroitement couplé entre les composants logiciels, */
/*ce qui rend les conceptions logicielles plus compréhensibles, flexibles et maintenables.*/
/*donc on a implemente une interface IEtdRep pour la class EtudiantRepository 

import java.sql.SQLException;

public interface InterEtudRep{

	boolean Exists(int matricule) throws SQLException;

	boolean Exists(String email) throws SQLException;

	
	void add(EtudiantFactory stud) throws SQLException;
	

}
