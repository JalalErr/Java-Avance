package Ex4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	long start = System.currentTimeMillis();
        Compteur c = new Compteur();
        FileWriter writer = new FileWriter("resultat_sans_sync.csv");
        int nThreads = 5;
        int perThread = 10000;
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < nThreads; i++) {
            Thread t = new Thread(() -> {
                for (int j = 0; j < perThread; j++) c.inc(writer);
            }, "T-" + i);
            threads.add(t);
            t.start();
        }

        for (Thread t : threads) {
            try { t.join(); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        System.out.println("Valeur finale: " + c.value);
        long end = System.currentTimeMillis();
        System.out.println("Temps d'exécution = " + (end - start) + " ms");

        writer.close();
        
    }
}
