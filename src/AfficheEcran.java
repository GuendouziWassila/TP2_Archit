package Class;
import Interface.IJournal;

public class AfficheEcran implements IJournal {

	@Override
	public void outPut_Msg(String message) {
		System.out.println(message);
	}
}