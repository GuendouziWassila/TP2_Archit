
public class Unlimited_Package extends AbstractFactory  {
	@Override
	public Package getPackage(TypePackage nom) {
		if(nom.equals(TypePackage.Illimité)){
			return new Illimité();
		}
		return null;
	}

}
