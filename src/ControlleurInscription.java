

	import java.awt.event.ActionEvent;

	public class ControlleurInscription {
			
		Etudiant E;
		EtudiantService ES;
		ViewInscription V;
		
			public ControlleurInscription(Etudiant E, EtudiantService ES , ViewInscription V) {
				
				this.E = E; 
				this.V = new ViewInscription();
				this.ES = ES ;
				
				
			}
			
			public void actionPerformed(ActionEvent e) {
				String matricule = V.getMatricule();
				String nom = V.getNom();
				String prenom = V.getPrenom();
				String email = V.getEmail();
				String password = V.getPwd();
				String ID_Univ = V.getId_universite();
				

			    ES.inscription(E, E.getId_universite());

			}
		}

