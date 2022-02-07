package Affichages;

import java.util.ArrayList;
import java.util.List;

public class AffichageComposite implements IJournal {
    
    private List<IJournal> AffichageListes = new ArrayList<IJournal>();
    public AffichageComposite(){}
    public void addAffichage(IJournal affichageType){
        AffichageListes.add(affichageType);
    }
    public void removeAffichage(IJournal affichageType){
        AffichageListes.remove(affichageType);
    }
    @Override
    public void outPut_Msg(String message) {
        // TODO Auto-generated method stub
        for (IJournal affichageType : AffichageListes) {
            affichageType.outPut_Msg(message);
        }
    }
    
}
