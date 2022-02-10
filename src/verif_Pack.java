import java.sql.SQLException;

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
