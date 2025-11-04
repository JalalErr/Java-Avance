package Ex2;

public class Poisson extends Animal implements Nageur {

    public Poisson(String nom) {
        super(nom);
    }

    @Override
    public void nager() {
        System.out.println("Capacité : Je nage.");
    }
}
