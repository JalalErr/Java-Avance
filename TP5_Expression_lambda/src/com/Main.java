package com;

import java.util.*;
import java.util.function.Predicate;

public class Main {
	
	public static void main(String[] args) {
		int a = 3, b = 4, n;
		
		//Exercice 1;
		System.out.println("\n Exercice 1");
		Calcul add = (z, w) -> z + w;
		Calcul mul = (z, w) -> z * w;
		
		n = add.executer(a, b);
		
		System.out.println("Resultat de l'additon : " + n);
		System.out.println("Resultat multiplication : " + mul.executer(a, b));
		
		n = add.executer(5, 6);
		System.out.println("Resultat de l'ddition: " + n);
		
		n = mul.executer(9, 2);
		System.out.println("Resultat de la multiplication : " + n);
		
		//Exercice 2.
		System.out.println("\n Exercice 2");
		n = 4;
		int tab[] = {5, 8, 13, 20};
		boolean r;
		
		Verfier teste = (nbr) -> nbr % 2 == 0;
		for ( int i : tab) {
			 r = teste.tester(i);
				if (r == true) 
					System.out.println(i +" est paire");
		}
		
		//Exercice 3.
		System.out.println("\n Exercice 3");
		String[] words = {"java", "lambda", "exercice"};
		
		Transformateur trans = (str) -> str.toUpperCase();
		Transformateur rev = (str) -> new StringBuilder(str).reverse().toString();
		
		for (String s : words) {
			System.out.println(trans.transformer(s));
			System.out.println(rev.transformer(s));
		}
		
		//Exercice 4.
		System.out.println("\n Exercice 4");
		List<String> chaine = Arrays.asList("Pomme", "Banane", "Orange", "Ananas");
		
		Trie order = (str, str2) -> str.compareToIgnoreCase(str2);
		chaine.sort(order::trie);
		System.out.println(chaine);
		
		chaine.sort((str, str2) -> Integer.compare(str.length(), str2.length()));
		System.out.println(chaine);
		
		//Exercice 5.
		System.out.println("\n Exercice 5");
		int f;
		Operation addition = (nb1, nb2) -> nb1 + nb2;
		Operation multiplication = (x, y) -> x * y;
		
		int cal = addition.calculer(5, 9);
		System.out.println("Resultat de l'addition : " + cal);
		
		cal = multiplication.calculer(6,  8);
		System.out.println("Resultat de la multiplication : " + cal);
		
		// Exercice 6
		System.out.println("\n Exercice 6");
		List<String> l1 = Arrays.asList("Ananas", "Banane", "Abricot", "Cerise");
		
		Filtre vr = (str) -> str.startsWith("A");
//		boolean rtn;
		
		for (String i : l1) {
			r = vr.verfier(i);
			if (r) 
				System.out.println(i);
		}
		
		//Exercice 7
		System.out.println("\n Exercice 7");
		
		List<Integer> numbers = Arrays.asList();
		double serie[] = {37, 2, 9 ,9, 10, 3, 12, 3, 22, 4};
		double rtn;
		double tmp;
		
		Calculateur div = (nbr1, nbr2) -> nbr1 / nbr2;
		Calculateur power = (nbr1, nbr2) -> Math.pow(nbr1, nbr2);
		
		for (int i = 0; i < serie.length; i++ ) {
			tmp = serie[i];
			
			rtn = power.effectuer(serie[i++],serie[i--]);

			System.out.println("resultat de la puissance : " + serie[i] + " ^ " + serie[++i] + " est : " + rtn);
			
		}
		System.out.println("\n");
		
		for (int i = 0; i < serie.length; i++ ) {
			tmp = serie[i];
			
			rtn = div.effectuer(serie[i++],serie[i--]);

			System.out.println("resultat de la division : " + serie[i] + " ^ " + serie[++i] + " est : " + rtn);
		}
		
		//Exercice 8
		int p = 0;
		int MAX = 0; 
		int nbrs[] = {12, 5, 8, 20};
	
		Compareur comp = (nbr1, nbr2) -> {
			if (nbr1 > nbr2) {
				return nbr1;
			}else {
				return nbr2;
			}
		};
		
		System.out.println("Le plus grand npmbre est : " + comp.comparer(3, 7));
		
			for(int i = 0; i < nbrs.length;  i++) {
				MAX =  comp.comparer(MAX, nbrs[i]);
			}
		System.out.println("Le plus grand npmbre est : " + MAX);

		//Exercice 9
		int nombres[] = {5, 12, 7, 18, 3};
		int SupNbr[] = {};
		boolean tmpr;
		
		Predicate<Integer> sup = (nb) -> nb > 10;
		
		System.out.println("\n Exercice 9");
		System.out.println("Test d'interface predicate : " + sup.test(20));
		System.out.println("Test d'interface predicate : " + sup.test(10));
	
		System.out.println("\n Les nombres plus grands que 10 : ");
		for(int i = 0; i < nombres.length;  i++) {
			if (sup.test(nombres[i]))
				System.out.println(nombres[i]);
		}
		
		//Exercice 10
		List<String> chaines = Arrays.asList("chat", "chien", "cheval");
        List<String> chaineTrie = new ArrayList<>(chaines);

		for (int i = 0; i < 3; i++) {
			
		}
		for (String i : chaines) {
	            String maj = i.toUpperCase();
	            System.out.print("La chaine en majuscule " + maj);
	        }
	        System.out.println();
	        
	        Collections.sort(chaineTrie, String::compareTo);
	        
	        System.out.print("La liste triee: ");
	        for (String i : chaineTrie) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
		    
		//Exercice 11
        List<String> chainee = Arrays.asList("kayak", "java", "radar", "lambda");

        VerifierPalindrome verifier = s -> {
            String nettoye = s.replaceAll("\\s+", "").toLowerCase();
            return nettoye.equals(new StringBuilder(nettoye).reverse().toString());
        };
        chainee.forEach(mot -> 
        	System.out.println(mot + " est un palindrome? " + verifier.estPalindrome(mot)));
     
		//Exercice 12
        int table[] = {3, 4, 9, 12, 3, 27};
        int s = 0;
        
        OperationTableau opr = (Table) ->{ for (int i = 0; i < table.lenhgt; i++) {
	        	s = s + Table[i];
	        }
        };
	}

}
