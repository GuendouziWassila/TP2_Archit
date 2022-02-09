
public abstract class Element {
	
	
	
	
  public void element (String message){
		
		
		
			Ijournal journal = getJournal();
			journal.outPut_Msg(message);
				
			
			
		}
	
		
	
  public abstract Ijournal getJournal();
	


}
