package Class;
import java.util.List;
import java.util.ArrayList;
import Interface.IJournal;

public class AfficheComposite implements IJournal{

	private List <IJournal> List = new ArrayList<IJournal>();

	  @Override
	  public void outPut_Msg(String message) {
			for(IJournal Msg : List){
				Msg.outPut_Msg(message);
			}
		}

  public void ajouter(IJournal journal){
	  	 List.add(journal);
	}

  public void supprimer(IJournal journal){
	  	List.remove(journal);
	}

}