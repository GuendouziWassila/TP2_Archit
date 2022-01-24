
public class AffichageEcran implements IJournal{
    String message;
    public AffichageEcran(){}
    @Override
    public void outPut_Msg(String message) {
        // TODO Auto-generated method stub
        System.out.println(message);
    }
}