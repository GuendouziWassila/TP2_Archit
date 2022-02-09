

public class ControleurInscription{
	
	public void InscriptionControle(){
		
	    IEtdSrv serv=new EtudiantService();
	    
		try {
			
			serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
