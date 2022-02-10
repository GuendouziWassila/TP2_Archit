package service_pack;

import java.sql.SQLException;

import add_pack.Etudiant;
import add_pack.TypePackage;
import add_pack.Universite;

public class verif_Pack {
	public void verif(Universite univ,Etudiant stud)throws SQLException	 {
	if (univ.getPack() == TypePackage.Standard)
    {
         stud.setNbLivreMensuel_Autorise(10);
    }
    else if (univ.getPack() == TypePackage.Premium)
    {
   	 stud.setNbLivreMensuel_Autorise(10*2);
    }

	}
}
