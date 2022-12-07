public class Unlimited extends AbstractFactory  {
	@Override
	public Package getPackage(TypePackage nom) {
		if(nom.equals(TypePackage.illimité)){
			return new illimite();
		}
		return null;
	}

}