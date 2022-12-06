import java.sql.SQLException;

public class Verify {
      public boolean verify(int mat, String email) {
    

    IEtudiantRep StudRep= new EtudiantRepository();
    if(email == null || email.length() == 0)
	    {
	    	return false;
	    }
	    
	    try {
            if (StudRep.Exists(mat))
            {
                return false;
            }
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
	    
		try {
            if (StudRep.Exists(email))
            {
                return false;
            }
        } catch (SQLException e) {
        
            e.printStackTrace();
        }
        return true;
    }
}
