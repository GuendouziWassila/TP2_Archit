import java.util.List;
import java.util.ArrayList;

public class AffichageComposite implements IJournal{
	
	private List <IJournal> Liste = new ArrayList<IJournal>();

	
  public void ajouter(IJournal journal){
	  	 Liste.add(journal);
	}
  

  public void supprimer(IJournal journal){
	  	Liste.remove(journal);
	}
  
  
  @Override
  public void outPut_Msg(String message) {

		for(IJournal L : Liste){
			L.outPut_Msg(message);
		}
	}

}
