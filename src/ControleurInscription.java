import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

public class ControleurInscription {
	private ViewInscription theView;
	private InterfaceEtudiant Etudiant;
	private EtudiantService EService;
	
	public ControleurInscription(ViewInscription theView,EtudiantService EService) {
		this.theView = theView;
		this.EService = EService;
	
		this.theView.addConfirmationListener(new ConfirmListener());
		this.theView.addAnlListener(new AnlListener());
	}
	
	class ConfirmListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				if(theView.champs_validation()) {
					int matricule = theView.getMat();
					String nom = theView.getNom();
					String prenom = theView.getPrenom();
					String email = theView.getMail();
					String password = theView.getPassword();
					int ID_Univ = theView.getUniv();
					
					Etudiant = new Etudiant(matricule,nom,prenom,email,password,ID_Univ);
					
					try {
						if(EService.inscription(Etudiant)) {
							theView.displayMessage("Etudiant ajouté avec succés !");
							theView.Rénistialisation();
						}else {
							theView.displayErrorMessage("Il y a un problème Matricule ou Email existe déja !");
						}
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					}
					
				
	}
	}
	class AnlListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try {
			theView.Rénistialisation();
			}catch (Exception e2) {
				theView.displayErrorMessage("reset not work");
			}
		}
	}

}