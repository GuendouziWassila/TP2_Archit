package tp2pack;
public class ControleurInscription {
	
	public void InscriptionControle(){
		
	IEtudService serv = new EtudiantService();
    
	try {
	
		serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
	
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
}

	
}
