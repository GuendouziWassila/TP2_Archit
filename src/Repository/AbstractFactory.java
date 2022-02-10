package Repository;

import packages.Package;
import packages.TypePackage;

public abstract class AbstractFactory {
	public abstract Package getPackage(TypePackage typePackage);
}
