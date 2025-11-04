package Ex2;

public class Main {
    public static void main(String[] args) {
        Banque banque = new Banque();

        CompteBancaire c1 = new CompteBancaire(101, "Ali", 5000);
        CompteBancaire c2 = new CompteBancaire(102, "Sara", 3000);

        banque.ajouterCompte(c1);
        banque.ajouterCompte(c2);

        banque.afficherTousLesComptes();

        CompteBancaire compteRecherche = banque.rechercherCompteParNumero(101);
        if (compteRecherche != null) {
            compteRecherche.deposer(1500);
            compteRecherche.retirer(2000);
        }

        banque.afficherTousLesComptes();
    }
}

