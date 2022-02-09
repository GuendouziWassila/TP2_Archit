public class Standard implements IPackage{

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
        return 10;
    }

    @Override
    public int getNbrLivreBonus() {
        return 5;
    }
}
