package Interface;
import Class.*;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IEtudiantService {

    boolean inscription (IEtudiant stud) throws SQLException;

    ArrayList<Etudiant> GetEtudiantParUniversitye();

    ArrayList<Etudiant> GetEtudiatparLivreEmprunte();

    void giveBonus(IEtudiant Stud) throws SQLException;
}
