package EX1;

public class Main {
	
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque(5, 3);

        Livre l1 = new Livre("1984", "George Orwell", 1949);
        Livre l2 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943);
        Livre l3 = new Livre("Les Misérables", "Victor Hugo", 1862);

        Emprunteur e1 = new Emprunteur("Dupont", "Alice", 1);
        Emprunteur e2 = new Emprunteur("Martin", "Paul", 2);

        bibliotheque.ajouterLivre(l1);
        bibliotheque.ajouterLivre(l2);
        bibliotheque.ajouterLivre(l3);

        bibliotheque.ajouterEmprunteur(e1);
        bibliotheque.ajouterEmprunteur(e2);

        e1.emprunterLivre(l1);
        e2.emprunterLivre(l1); 
        e1.rendreLivre(l1);
        e2.emprunterLivre(l1); 
        
        bibliotheque.afficherLivres();
        bibliotheque.afficherEmprunteurs();
    }
}

