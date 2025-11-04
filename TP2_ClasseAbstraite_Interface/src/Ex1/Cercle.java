package Ex1;

public class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Rayon : " + rayon);
        System.out.println("Surface : " + String.format("%.2f", calculerSurface()));
        System.out.println("Perimetre : " + String.format("%.2f", calculerPerimetre()));
        System.out.println();
    }
}
