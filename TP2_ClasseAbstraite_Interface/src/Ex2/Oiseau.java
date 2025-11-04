package Ex2;

public class Oiseau extends Animal implements Volant {

    public Oiseau(String nom) {
        super(nom);
    }

    @Override
    public void voler() {
        System.out.println("Capacité : Je vole.");
    }
}
