package JUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import DB.DBConnection;
import Journal.MessComposite;
import Repository.EtudiantRepository;
import Repository.InterfaceDBConnection;
import Repository.UniversiteRepository;
import Services.Etudiant;
import Services.EtudiantService;
import Services.InterfaceEtudeRep;
import Services.InterfaceEtudiant;
import Services.InterfaceUnivRep;

class JunitTestEtudiantService {
	MessComposite a;
	InterfaceDBConnection db;
	InterfaceEtudeRep StudRep;
	InterfaceUnivRep UnivRep;
	InterfaceEtudiant stud;
	EtudiantService serv;
	
	@BeforeEach
	public void init() throws SQLException {
		a = new MessComposite();
		db = DBConnection.getInstance();
		StudRep = new EtudiantRepository(db,a);
		UnivRep = new UniversiteRepository(db,a);
		serv =new EtudiantService(StudRep,UnivRep,a);
		stud = new Etudiant(1818, "Guendouziiiii", "wassila", "guen1818@gmail.com","xxxx", 2);
		
	}
	
	@Test
	void test() throws SQLException, IOException {
		boolean result = serv.inscription(stud);
		assertEquals(true, result);
	}

}
