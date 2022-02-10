package composant_pack;

import java.util.ArrayList;
import java.util.List;

public class message_composite extends message_composant {
	
	private List<message_composant> compasants= new ArrayList<message_composant>();
	@Override
	public void outPut_Msg (String message) {
		for(message_composant c: compasants) {
			c.outPut_Msg(message);
		}
	}
	
	public void add(message_composant c) {
		compasants.add(c);
	}

}
