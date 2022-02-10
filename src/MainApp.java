import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		IEtudService serv = new EtudiantService();
		
		try {
			serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
		
			DisplayEcran  ecran = new DisplayEcran();
			DisplayComposite ecran_aff = new DisplayComposite();
			ecran_aff.addComposant(ecran);
			
			DisplayFiles fichier = new DisplayFiles();
			DisplayComposite fichier_aff = new DisplayComposite();
			fichier_aff.addComposant(fichier);

			DisplayDate dat = new DisplayDate();
			DisplayComposite date_aff = new DisplayComposite();
			date_aff.addComposant(dat);
			
			DisplayComposite comp = new DisplayComposite();
			comp.addComposant(ecran_aff);
			comp.addComposant(fichier_aff);
			comp.addComposant(date_aff);
			comp.outPut_Msg("test message");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
