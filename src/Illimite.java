public class Illimite implements IPackage{

    private int bonus;

    @Override
    public void SetNbLivreAutorise(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void SetNbLivrebonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getNbrLivreAutorise() {
        return 0;
    }

    @Override
    public int getNbrLivreBonus() {
        return 0;
    }
}
