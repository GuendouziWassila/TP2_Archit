
public class ControleurInscription {
public void Inscription_Formulaire(){
		
	    InterfaceEtudiantService SRV=new EtudiantService();
	    
		try {
			
			SRV.inscription(3, "khaoula", "Cheridi", "khaoula@gmail.com","xxxx", 1);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
