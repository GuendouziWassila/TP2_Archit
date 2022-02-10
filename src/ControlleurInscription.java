import java.awt.event.ActionEvent;
import java.sql.SQLException;

public class ControlleurInscription {
		
	Etudiant etudiant;
	EtudiantService EtudSev;
	ViewInscription View;
	
		public ControlleurInscription(Etudiant etudiant, EtudiantService EtudSev , ViewInscription View) {
			
			this.etudiant = etudiant; 
			this.View = new ViewInscription();
			this.EtudSev = EtudSev ;
			
			
		}
		
		public void actionPerformed(ActionEvent e) throws SQLException {
			

			
			String matricule = View.Get_Mat();
			String nom = View.Get_Nom();
			String prenom = View.Get_Prenom();
			String email = View.Get_email();
			String password = View.Get_pwd();
			String ID_Univ = View.Get_id_univ();
			
			int id=Integer.parseInt(ID_Univ);
			

			EtudSev.inscription(etudiant, id);

		}
	}


