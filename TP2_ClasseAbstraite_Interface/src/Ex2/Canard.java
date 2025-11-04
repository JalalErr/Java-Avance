package Ex2;

public class Canard extends Animal implements Nageur, Volant {

    public Canard(String nom) {
        super(nom);
    }

    @Override
    public void nager() {
        System.out.print("Capacite : Je nage ");
    }

    @Override
    public void voler() {
        System.out.println("et je vole.");
    }
}

