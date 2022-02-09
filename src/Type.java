public class Type extends AbstractFactory{

	@Override
	public Package getPackage(TypePackage typePackage) {
		
		if(typePackage.equals(TypePackage.Standard)){
			return new Standard(null);
		}else if(typePackage.equals(TypePackage.Premium)){
			return new Premium(null);
		}
			return new Ilimité(null);
	}
}