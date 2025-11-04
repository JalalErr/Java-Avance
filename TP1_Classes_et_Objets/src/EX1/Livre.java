package EX1;

public class Livre {
	
    private String titre;
    private String auteur;
    private int anneePublication;
    private boolean disponible;

    public Livre(String titre, String auteur, int anneePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
        this.disponible = true;
    }

    public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getAnneePublication() {
		return anneePublication;
	}

	public void setAnneePublication(int anneePublication) {
		this.anneePublication = anneePublication;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public void afficherInfoLivre() {
        System.out.println("Titre : " + titre + " l'auteur : " + auteur +
                " annee : " + anneePublication +
                " disponible : " + (disponible ? "Oui" : "Non"));
    }

    public void emprunterLivre() {
        if (disponible) {
            disponible = false;
            System.out.println("Le livre " + titre + " a ete emprunte.");
        } else {
            System.out.println("Le livre " + titre + " n'est pas disponible.");
        }
    }

    public void rendreLivre() {
        disponible = true;
        System.out.println("Le livre " + titre + " a ete rendu.");
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getTitre() {
        return titre;
    }
    
    public String setTitre() {
        return titre;
    }
}
