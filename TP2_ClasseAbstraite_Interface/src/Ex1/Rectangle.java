package Ex1;

public class Rectangle extends Forme {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double calculerSurface() {
        return longueur * largeur;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * (longueur + largeur);
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Longueur : " + longueur);
        System.out.println("Largeur : " + largeur);
        System.out.println("Surface : " + String.format("%.2f", calculerSurface()));
        System.out.println("Perimetre : " + String.format("%.2f", calculerPerimetre()));
        System.out.println();
    }
}

