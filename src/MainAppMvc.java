	import java.sql.SQLException;
public class MainAppMvc {




		public static void main(String[] args)  {	
			
			IDBConnection conn = DBConnection.getInstance();
			AfichMsgDTypes CompositeJ = new AfichMsgDTypes();
			
			Etudiant etudiant1 =new Etudiant(2, "Guendouziiiii", "wassila", "guennf@gmail.com","xxxx",1);
			Etudiant etudiant2 =new Etudiant(3, "Boudraa", "Assala", "assala@gmail.com","xxxx",2);
			ViewInscription v = new ViewInscription();
			IJournal jrnal1 = new AfichMsgEcran();
			IJournal jrnal2 = new AfichMsgDate();

			CompositeJ.add(jrnal1);
			CompositeJ.add(jrnal2);

			IEtudiantRepository etudRep = new EtudiantRepository(conn,CompositeJ);
			
			IUniversiteRepository univRep = new UniversiteRepository(conn,CompositeJ);
			
			EtudiantService serv = new EtudiantService(etudRep ,univRep,CompositeJ);

			try {
				serv.inscription(etudiant1, 1);

			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}

	}
}
