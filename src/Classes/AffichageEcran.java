package Classes;

import Interfaces.IJournal;

public class AffichageEcran implements IJournal {
    public AffichageEcran(){}
    @Override
    public void outPut_Msg(String message) {
        // TODO Auto-generated method stub
        System.out.println(message);
    }
}