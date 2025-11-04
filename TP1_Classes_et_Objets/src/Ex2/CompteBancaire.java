package Ex2;

public class CompteBancaire {
	
    private int numeroCompte;
    private String titulaire;
    private double solde;

    public CompteBancaire(int numeroCompte, String titulaire, double solde) {
        this.numeroCompte = numeroCompte;
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println(montant + " DH depose sur le compte de " + titulaire);
        }
    }

    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
            System.out.println(montant + " DH retirer du compte de " + titulaire);
        } else {
            System.out.println("Solde insuffisant !");
        }
    }

    public void afficherDetails() {
        System.out.println("Compte N :" + numeroCompte + " Titulaire : " + titulaire + " Solde : " + solde + " DH");
    }
}

