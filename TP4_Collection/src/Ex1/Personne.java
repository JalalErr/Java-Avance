package Ex1;

import java.util.Date;

public abstract class Personne {
	
    private String nom;
    private String prenom;
    private Date dateNaissance;

    public Personne(String nom, String prenom, Date dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    public abstract String description();

    @Override
    public String toString() {
        return "Nom : " + nom + ", Prenom : " + prenom + ", Date de naissance : " + dateNaissance;
    }
}
