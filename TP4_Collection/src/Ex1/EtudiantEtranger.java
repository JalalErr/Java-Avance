package Ex1;

import java.util.Date;

public class EtudiantEtranger extends Etudiant {
    private String nationalite;

    public EtudiantEtranger(String nom, String prenom, Date dateNaissance, String cne, String nationalite) {
        super(nom, prenom, dateNaissance, cne);
        this.nationalite = nationalite;
    }

    @Override
    public String description() {
        return "Etudiant etranger (" + nationalite + ")";
    }

    @Override
    public String toString() {
        return super.toString() + "Nationalite : " + nationalite + "\n";
    }
}
