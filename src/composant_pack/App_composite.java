package composant_pack;


public class App_composite {
	
	public static void setMessage(String message) {
	  message_composite racine=new message_composite(); 
		racine.add(new message_date());
		racine.add(new message_fichier());
		racine.outPut_Msg(message);
	}

	

}
