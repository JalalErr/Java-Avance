package EX1;

public class Emprunteur {
    private String nom;
    private String prenom;
    private int idEmprunteur;

    public Emprunteur(String nom, String prenom, int idEmprunteur) {
        this.nom = nom;
        this.prenom = prenom;
        this.idEmprunteur = idEmprunteur;
    }

    public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getIdEmprunteur() {
		return idEmprunteur;
	}

	public void setIdEmprunteur(int idEmprunteur) {
		this.idEmprunteur = idEmprunteur;
	}

	public void afficherInfoEmprunteur() {
        System.out.println("Emprunteur : " + prenom + " " + nom + " | ID : " + idEmprunteur);
    }

    public void emprunterLivre(Livre livre) {
        if (livre.isDisponible()) {
            livre.emprunterLivre();
            System.out.println(prenom + " " + nom + " a emprunte le livre : " + livre.getTitre());
        } else {
            System.out.println("le livre " + livre.getTitre() + " est deja emprunte.");
        }
    }

    public void rendreLivre(Livre livre) {
        livre.rendreLivre();
        System.out.println(prenom + " " + nom + " a rendu le livre : " + livre.getTitre());
    }
}

