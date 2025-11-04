package Ex2;

public class TestAnimaux {
    public static void main(String[] args) {
    	
        Poisson poisson = new Poisson("Poisson rouge");
        Oiseau oiseau = new Oiseau("Aigle");
        Canard canard = new Canard("Canard");

        poisson.afficherNom();
        poisson.nager();

        oiseau.afficherNom();
        oiseau.voler();

        canard.afficherNom();
        canard.nager();
        canard.voler();
    }
}
