package Abstract;
import Class.Ilimit�;
import Class.Premium;
import Class.Standard;
import Class.Package;
import Class.TypePackage;
public abstract class AbstractFactory {
	public abstract Package getPackage(TypePackage TPackage);
}