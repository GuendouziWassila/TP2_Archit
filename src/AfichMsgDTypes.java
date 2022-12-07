import java.util.List;
import java.util.ArrayList;

public class AfichMsgDTypes implements IJournal {
	private ArrayList<IJournal> jrnal = new ArrayList<IJournal>();
	 public void outPut_Msg(String message) {
			for(IJournal i : jrnal){
				i.outPut_Msg(message);
			}
		}
	 public void add(IJournal jrnals){
		  jrnal.add(jrnals);
		}
	 public void remove(IJournal jrnals){
		  jrnal.remove(jrnals);
		}
	
}
