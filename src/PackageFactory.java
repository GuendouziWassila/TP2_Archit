public class PackageFactory implements IAbstractFactory{

    @Override
    public IPackage getPackage(IUniversite univ) {
        if (univ.getPack() == TypePackage.Standard) {
            return new Standard();
        } else if (univ.getPack() == TypePackage.Premium) {
            return new Premium();
        }
        return new Illimite();
    }
}
