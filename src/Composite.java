import java.util.ArrayList;
import java.util.List;

public abstract class Affiche_Composite implements IJournal{
	
	private List <IJournal> composants = new ArrayList <IJournal>();

	@Override
	public void outPut_Msg(String message) {
		for (IJournal c : composants) {
			c.outPut_Msg(message);
		}
	}
	public void Ajout_Composant (IJournal c)
	{
		composants.add(c);
	}

}
