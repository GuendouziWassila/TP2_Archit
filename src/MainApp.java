import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Etudiant etudiant0 =new Etudiant(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx",1);
        IEtudiantRepository ETUDUNIVR = new EtudiantRepository();
    	IUniversiteRepository UnivRep = new UniversiteRepository();
    	
		EtudiantService serv=new EtudiantService(ETUDUNIVR ,UnivRep);
		try {
			serv.inscription(etudiant0, 1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
