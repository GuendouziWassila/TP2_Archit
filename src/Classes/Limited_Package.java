
public class Limited_Package extends AbstractFactory {

	@Override
	public Package getPackage(TypePackage p) {
		if(p.equals(TypePackage.Standard)){
			return new Standard();
		}else if(p.equals(TypePackage.Premium)){
			return new Premuim();
		}
		return null;
	}

}
