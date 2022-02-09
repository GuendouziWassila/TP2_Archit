
public class App_composite {
	
	
	//static message_composant date= new message_date();
	//racine.add(new message_date());
	
	static void setMessage(String message) {
	  message_composite racine=new message_composite(); 
		racine.add(new message_date());
		racine.add(new message_fichier());
		racine.outPut_Msg(message);
	}
	//public void setMessage(String message) {
				
	//}
	

}
