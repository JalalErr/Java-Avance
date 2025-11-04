package Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListeCourses {
    private static class Article {
        String nom;
        int quantite;

        public Article(String nom, int quantite) {
            this.nom = nom;
            this.quantite = quantite;
        }

        @Override
        public String toString() {
            return nom + " (x" + quantite + ")";
        }
    }

    public static void main(String[] args) {
        List<Article> courses = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choix;

        do {
            System.out.println("	Liste des articles : ");
            System.out.println("1. Ajouter un article");
            System.out.println("2. Supprimer un article");
            System.out.println("3. Afficher la liste");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            sc.nextLine(); 

            switch (choix) {
                case 1 -> {
                    System.out.print("Nom de l'article : ");
                    String nom = sc.nextLine();
                    boolean existe = false;
                    for (Article a : courses) {
                        if (a.nom.equalsIgnoreCase(nom)) {
                            a.quantite++;
                            existe = true;
                            break;
                        }
                    }
                    if (!existe) courses.add(new Article(nom, 1));
                    System.out.println("Article ajoute !");
                }
                case 2 -> {
                    System.out.print("Nom de l'article a supprimer : ");
                    String nom = sc.nextLine();
                    courses.removeIf(a -> a.nom.equalsIgnoreCase(nom));
                    System.out.println("Article supprime (si existant).");
                }
                case 3 -> {  if (courses.isEmpty()) System.out.println("Liste vide.");
                else {
                    System.out.println("Liste de courses :");
                    for (Article a : courses)
                        System.out.println("- " + a);
                    }
                }
               
                default -> System.out.println("Choix invalide !");
            }

        } while (choix != 0);
        sc.close();
    }
}
