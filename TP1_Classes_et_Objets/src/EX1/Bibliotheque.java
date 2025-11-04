package EX1;

public class Bibliotheque {
	
    private Livre[] livres;
    private Emprunteur[] emprunteurs;
    private int indexLivre = 0;
    private int indexEmprunteur = 0;

    public Bibliotheque(int maxLivres, int maxEmprunteurs) {
        livres = new Livre[maxLivres];
        emprunteurs = new Emprunteur[maxEmprunteurs];
    }

    public Livre[] getLivres() {
		return livres;
	}

	public void setLivres(Livre[] livres) {
		this.livres = livres;
	}

	public Emprunteur[] getEmprunteurs() {
		return emprunteurs;
	}

	public void setEmprunteurs(Emprunteur[] emprunteurs) {
		this.emprunteurs = emprunteurs;
	}

	public int getIndexLivre() {
		return indexLivre;
	}

	public void setIndexLivre(int indexLivre) {
		this.indexLivre = indexLivre;
	}

	public int getIndexEmprunteur() {
		return indexEmprunteur;
	}

	public void setIndexEmprunteur(int indexEmprunteur) {
		this.indexEmprunteur = indexEmprunteur;
	}

	public void ajouterLivre(Livre livre) {
        if (indexLivre < livres.length) {
            livres[indexLivre++] = livre;
        } else {
            System.out.println("La bibliotheque est pleine (livres).");
        }
    }

    public void ajouterEmprunteur(Emprunteur emprunteur) {
        if (indexEmprunteur < emprunteurs.length) {
            emprunteurs[indexEmprunteur++] = emprunteur;
        } else {
            System.out.println("La bibliotheque est pleine (emprunteurs).");
        }
    }

    public void afficherLivres() {
        System.out.println("Liste des livres :");
        for (int i = 0; i < indexLivre; i++) {
            livres[i].afficherInfoLivre();
        }
    }

    public void afficherEmprunteurs() {
        System.out.println("Liste des emprunteurs :");
        for (int i = 0; i < indexEmprunteur; i++) {
            emprunteurs[i].afficherInfoEmprunteur();
        }
    }
}

