package Ex1;

public class TestFormes {
    public static void main(String[] args) {
        Forme cercle = new Cercle(5.0);
        Forme rectangle = new Rectangle(4.0, 3.0);

        cercle.afficher();
        rectangle.afficher();
    }
}
