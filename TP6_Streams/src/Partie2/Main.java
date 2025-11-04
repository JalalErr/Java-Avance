package Partie2;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

public class Main {


	    // P2-1 : 
	    public static List<String> p2_1(List<String> names) {
	        return names.stream()
	                    .filter(n -> n.startsWith("A"))
	                    .collect(toList());
	    }

	    // P2-2 :
	    public static List<String> p2_2(List<String> names) {
	        return names.stream()
	                    .map(String::toUpperCase)
	                    .collect(toList());
	    }

	    // P2-3 : 
	    public static Optional<String> p2_3(List<String> names) {
	        return names.stream()
	                    .filter(n -> n.length() > 5)
	                    .findFirst();
	    }

	    // P2-4 : 
	    public static Map<Integer, List<String>> p2_4(List<String> names) {
	        return names.stream()
	                    .collect(groupingBy(String::length));
	    }

	    // P2-5 :
	    public static String p2_5(List<String> names) {
	        return names.stream()
	                    .collect(joining(","));
	    }

	    // P2-6 :
	    public static List<Integer> p2_6(List<Integer> numbers) {
	        return numbers.stream()
	                      .filter(n -> n % 2 == 0)
	                      .collect(toList());
	    }

	    // P2-7 :
	    public static int p2_7(List<Integer> numbers) {
	        return numbers.stream()
	                      .reduce(0, Integer::sum);
	    }

	    // P2-8 :
	    public static Optional<Integer> p2_8(List<Integer> numbers) {
	        return numbers.stream().max(Integer::compareTo);
	    }

	    // P2-9 :
	    public static double p2_9(List<Integer> numbers) {
	        return numbers.stream()
	                      .filter(n -> n > 10)
	                      .mapToInt(Integer::intValue)
	                      .average()
	                      .orElse(0.0);
	    }

	    // P2-10 : 
	    public static Optional<Long> p2_10(List<Integer> numbers) {
	        return numbers.stream()
	                      .map(Integer::longValue)
	                      .reduce((a, b) -> a * b);
	    }

	    // P3 : 
	    public static List<String> p3(List<String> names, List<Integer> numbers) {
	        return IntStream.range(0, Math.min(names.size(), numbers.size()))
	                        .mapToObj(i -> names.get(i) + " - " + numbers.get(i))
	                        .collect(toList());
	    }

		public static void main(String[] args) {

	        List<String> names = Arrays.asList("Ahmed", "Brahim", "Chaimae", "Badr", "Said", "Amina");
	        List<Integer> numbers = Arrays.asList(3, 5, 7, 10, 15, 20, 25, 30, 35, 40);

	        System.out.println("Les noms qui commencent par A : " + p2_1(names));
	        System.out.println("Convertion en majusculer: " + p2_2(names));
	        System.out.println("Les noms au'on plus de 5 cara : " + p2_3(names).orElse("Aucun"));
	        System.out.println("groupement par longeur : " + p2_4(names));
	        System.out.println("concatenation des noms : " + p2_5(names));
	        System.out.println("Affiher les nombres paire: " + p2_6(numbers));
	        System.out.println("La sommes de tous les nombres: " + p2_7(numbers));
	        System.out.println("Le nombre MAx : " + p2_8(numbers).orElse(null));
	        System.out.println("La moyenne des nombres qu'on >10: " + p2_9(numbers));
	        System.out.println("Mutiplication des nombres : " + p2_10(Arrays.asList(3,5,7,10)).orElse(0L));

	        p3(names, numbers).forEach(System.out::println);
	    }

}
