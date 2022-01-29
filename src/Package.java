import java.lang.ProcessBuilder.Redirect.Type;

public abstract class Package {
    int Bonus;
    public Package(){}
    public abstract void setBonus(int bonus);
    public abstract int getBonus();
}
