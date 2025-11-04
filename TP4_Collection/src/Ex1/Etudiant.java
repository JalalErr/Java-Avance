package Ex1;

import java.util.ArrayList;
import java.util.List;

public class Etudiant extends Personne {
	
    private String cne;
    private List<Double> notes;
    private List<Boolean> inscriptionsModules;

    public Etudiant(String nom, String prenom, java.util.Date dateNaissance, String cne) {
        super(nom, prenom, dateNaissance);
        this.cne = cne;

        notes = new ArrayList<>();
        inscriptionsModules = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            notes.add(0.0);
            inscriptionsModules.add(false);
        }
    }

    public void inscrireModule(int index) {
        if (index >= 0 && index < 6) {
            inscriptionsModules.set(index, true);
        }
    }

    public void ajouterNote(int index, double note) {
        if (index >= 0 && index < 6 && inscriptionsModules.get(index)) {
            notes.set(index, note);
        }
    }

    public double moyenne() {
        double somme = 0;
        int nb = 0;
        for (int i = 0; i < 6; i++) {
            if (inscriptionsModules.get(i)) {
                somme += notes.get(i);
                nb++;
            }
        }
        return nb > 0 ? somme / nb : 0;
    }

    public String mention() {
        if (!inscriptionsModules.contains(false)) {
            double m = moyenne();
            if (m >= 16) return "Très Bien";
            else if (m >= 14) return "Bien";
            else if (m >= 12) return "Assez Bien";
            else if (m >= 10) return "Passable";
            else return "Échec";
        }
        return "Mention non disponible (pas inscrit à tous les modules)";
    }

    @Override
    public String description() {
        return "Étudiant";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nCNE : ").append(cne);
        sb.append("\nModules et notes :\n");

        List<String> modules = GI_S1.getModules();
        
        for (int i = 0; i < 6; i++) {
            sb.append("  ").append(modules.get(i)).append(" - ");
            if (inscriptionsModules.get(i))
                sb.append("Inscrit, Note = ").append(notes.get(i)).append("\n");
            else
                sb.append("Non inscrit\n");
        }

        sb.append("Moyenne : ").append(String.format("%.2f", moyenne())).append("\n");
        sb.append("Mention : ").append(mention()).append("\n");
        return sb.toString();
    }
}
