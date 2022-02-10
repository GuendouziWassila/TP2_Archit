package Repository;
import Packages.*;
import Packages.Package;

public abstract class AbstractFactory {
	
	public abstract Package getPackage(TypePackage typePackage);
}
