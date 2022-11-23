import java.sql.*;
public class MainApp {
	public static void main(String[] args) {
	
		
		EtudiantService serv=new EtudiantService();
		serv.setEtudRep(new EtudiantRepository());
		serv.setUnivRep(new UniversiteRepository());
		serv.setJournal(new MultiJourn());
		MultiJourn jTemp = (MultiJourn)serv.getJournal();
		jTemp.addJournal(new ScreenJourn());
		jTemp.addJournal(new FileJourn());
		jTemp.addJournal(new ScreenDetailJourn());
		serv.setJournal(jTemp);

		int matricule = 2;
		String email = "guen@gmail.com";

		try {
			

			if (!serv.getStudRep().Exists(matricule,serv.getJournal()) && !serv.getStudRep().Exists(email, serv.getJournal()))
		    {
				serv.inscription(matricule, "Guendouziiiii", "wassila", email,"xxxx", 1);
		    }

		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
}