package Ex1;

public abstract class Forme {

    public abstract double calculerSurface();
    public abstract double calculerPerimetre();

    public void afficher() {
        System.out.println("Forme : " + this.getClass().getSimpleName());
    }
}
