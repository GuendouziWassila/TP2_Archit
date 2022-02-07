package Classes;

import Interfaces.IJournal;

public class AffichageEcran implements IJournal {
    String message;
    public AffichageEcran(String message){this.message = message;}
    @Override
    public void outPut_Msg(String message) {
        // TODO Auto-generated method stub
        System.out.println(message);
    }
}