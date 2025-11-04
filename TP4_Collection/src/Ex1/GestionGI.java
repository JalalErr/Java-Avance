package Ex1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestionGI {
    public static void main(String[] args) {
    	
        List<Personne> personnes = new ArrayList<>();

        Etudiant e1 = new Etudiant("Ali", "Bennani", new Date(), "CNE001");
        EtudiantEtranger e2 = new EtudiantEtranger("Sara", "Nasiri", new Date(), "CNE002", "Espagnole");
        Etudiant e3 = new Etudiant("Youssef", "Youssef", new Date(), "CNE003");
        Etudiant e4 = new Etudiant("Imane", "Imane", new Date(), "CNE004");
        Personne prof = new Personne("Mohamed", "Amine", new Date()) {
        	
            @Override
            public String description() {
                return "Professeur";
            }
        };

        personnes.add(e1);
        personnes.add(e2);
        personnes.add(e3);
        personnes.add(e4);
        personnes.add(prof);

        for (int i = 0; i < 6; i++) {
            e1.inscrireModule(i);
            e2.inscrireModule(i);
        }
        e3.inscrireModule(0);
        e3.inscrireModule(1);
        e4.inscrireModule(1);
        e4.inscrireModule(2);
        e4.inscrireModule(4);

        double[] notes1 = {14, 13, 15, 12, 16, 14};
        double[] notes2 = {10, 11, 9, 12, 10, 13};
        double[] notes3 = {15, 12, 0, 0, 0, 0};
        double[] notes4 = {0, 10, 9, 0, 14, 0};

        for (int i = 0; i < 6; i++) {
            e1.ajouterNote(i, notes1[i]);
            e2.ajouterNote(i, notes2[i]);
            e3.ajouterNote(i, notes3[i]);
            e4.ajouterNote(i, notes4[i]);
        }

        for (Personne p : personnes) {
            System.out.println("=== " + p.description() + " ===");
            System.out.println(p.toString());
        }
    }
}
