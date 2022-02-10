import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControleurInscription {
	private ViewInscription theview;
	private EtudiantService etudserv;
	public ControleurInscription(ViewInscription theview,EtudiantService etudserv) {

		this.theview=theview;
		this.etudserv=etudserv;
		
		this.theview.addInsertListener(new serviceListnner());}
		
		class serviceListnner implements ActionListener{

			public void actionPerformed(ActionEvent e) {
			int matricule,id_univ=0;
			String nom,prenom,email,pwd=null;
			try {
				matricule=theview.getMatricule();
				id_univ=theview.getId_univ();
				nom=theview.getNom();
				prenom=theview.getPrenom();
				email=theview.getEmail();
				pwd=theview.getPwd();
				etudserv.inscription(matricule, nom, prenom, email, pwd, id_univ);
				
			}catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
				
			}
			  
		}
	}

	

