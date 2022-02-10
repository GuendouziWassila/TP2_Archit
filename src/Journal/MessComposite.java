package Journal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Services.IJournal;

public class MessComposite implements IJournal {
	private List<IJournal> journals = new ArrayList<IJournal>();
	@Override
	public void outPut_Msg(String message) throws IOException {
		// TODO Auto-generated method stub
		DateMess s = new DateMess();
		String MessageAvecInfos =s.outPut_Msg1(message);
		for(IJournal i: journals) {
			i.outPut_Msg(MessageAvecInfos);
		}
	}
	 public void ajouter(IJournal journal){
			journals.add(journal);
		}
	

}
