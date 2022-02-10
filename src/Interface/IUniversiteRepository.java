package Interface;
import Class.*;

import Interface.IEtudiant;

import java.sql.SQLException;

public interface IUniversiteRepository {

    Universite GetById(int universityId) throws SQLException;

    IEtudiant setPack(IEtudiant stud, Universite univ);
}
