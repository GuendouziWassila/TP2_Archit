public abstract class Element {
	
	
	
	
    public void element (String message){
          
          
          
              IJournal journal = getJournal();
              journal.outPut_Msg(message);
                  
              
              
          }
      
          
      
    public abstract IJournal getJournal();
      
  
  
  }