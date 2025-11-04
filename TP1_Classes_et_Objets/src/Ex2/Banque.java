package Ex2;

import java.util.ArrayList;

public class Banque {
	
    private ArrayList<CompteBancaire> comptes = new ArrayList<>();

    public void ajouterCompte(CompteBancaire compte) {
        comptes.add(compte);
    }

    public CompteBancaire rechercherCompteParNumero(int numeroCompte) {
        for (CompteBancaire i : comptes) {
            if (i.getNumeroCompte() == numeroCompte) {
                return i;
            }
        }
        return null;
    }

    public void afficherTousLesComptes() {
        System.out.println(" Liste des comptes bancaires :");
        for (CompteBancaire i : comptes) {
            i.afficherDetails();
        }
    }
}

