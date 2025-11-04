package Ex1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import static java.util.stream.Collectors.*;

public class Main {


    // Ex1 :
    public static List<Integer> ex1(List<Integer> input) {
        return input.stream()
                    .filter(n -> n % 2 == 0)
                    .collect(toList());
    }

    // Ex2 : 
    public static List<String> ex2(List<String> names) {
        return names.stream()
                    .map(String::toUpperCase)
                    .collect(toList());
    }

    // Ex3 :
    public static Optional<Integer> ex3(List<Integer> numbers) {
        return numbers.stream().max(Integer::compareTo);
    }

    // Ex4 : 
    public static int ex4(List<Integer> numbers) {
        return numbers.stream()
                      .map(n -> n * n)
                      .reduce(0, Integer::sum);
    }

    // Ex5 : 
    public static List<String> ex5(List<String> strings) {
        return strings.stream()
                      .filter(s -> s.length() > 3)
                      .collect(toList());
    }

    // Ex6 :
    public static String ex6(List<String> strings) {
        return strings.stream()
                      .collect(joining(","));
    }

    // Ex7 : 
    public static Optional<String> ex7(List<String> strings) {
        return strings.stream()
                      .filter(s -> s.startsWith("A"))
                      .findFirst();
    }

    // Ex8 : 
    public static long ex8(List<Integer> numbers, int seuil) {
        return numbers.stream()
                      .filter(n -> n > seuil)
                      .count();
    }

    // Ex9 : 
    public static Map<Integer, List<String>> ex9(List<String> strings) {
        return strings.stream()
                      .collect(groupingBy(String::length));
    }

    // Ex10 :
    public static List<Integer> ex10(List<Integer> numbers) {
        return numbers.stream()
                      .map(n -> n * 2)
                      .collect(toList());
    }

    // Ex11 : 
    public static List<String> ex11(String phrase) {
        return Arrays.stream(phrase.split("\\s+"))
                     .map(String::trim)
                     .filter(s -> !s.isEmpty())
                     .distinct()
                     .sorted()
                     .collect(toList());
    }

    // Ex12 :
    public static List<Integer> ex12() {
        return IntStream.rangeClosed(1, 10)
                        .boxed()
                        .collect(toList());
    }

    // Ex13 : 
    public static List<String> ex13(List<String> strings) {
        return strings.stream()
                      .sorted()
                      .collect(toList());
    }

    // Ex14 :
    public static long ex14(List<String> words, char letter) {
        return words.stream()
                    .flatMapToInt(String::chars)
                    .filter(c -> c == letter)
                    .count();
    }

    // Ex15 : 
    public static Optional<Integer> ex15(List<Integer> numbers) {
        return numbers.stream()
                      .reduce((a, b) -> a * b);
    }

   

    public static void main(String[] args) {

        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> noms = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> chaines = Arrays.asList("hi", "hello", "hey", "world");
        List<Integer> valeurs = Arrays.asList(10, 20, 30, 40);

        System.out.println("=== Partie 1 ===");
        System.out.println("Ex1 pairs: " + ex1(nombres));
        System.out.println("Ex2 majuscules: " + ex2(noms));
        System.out.println("Ex3 max: " + ex3(nombres).orElse(null));
        System.out.println("Ex4 somme des carrés: " + ex4(nombres));
        System.out.println("Ex5 longueur>3: " + ex5(chaines));
        System.out.println("Ex6 concat: " + ex6(noms));
        System.out.println("Ex7 start A: " + ex7(noms).orElse("Aucune"));
        System.out.println("Ex8 count >25: " + ex8(valeurs, 25));
        System.out.println("Ex9 groupByLength: " + ex9(Arrays.asList("a","bb","ccc","dd","eeee")));
        System.out.println("Ex10 doubles: " + ex10(IntStream.rangeClosed(1,6).boxed().collect(toList())));
        System.out.println("Ex11 mots uniques triés: " + ex11("hello world hello streams"));
        System.out.println("Ex12 1..10: " + ex12());
        System.out.println("Ex13 tri: " + ex13(Arrays.asList("banana","apple","cherry")));
        System.out.println("Ex14 occurrences 'e': " + ex14(Arrays.asList("hello","world","streams"), 'e'));
        System.out.println("Ex15 produit: " + ex15(Arrays.asList(1,2,3,4)).orElse(0));

        
    }
}
