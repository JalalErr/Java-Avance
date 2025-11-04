package Ex3;

import java.util.List;

public class Ex3 {
 static boolean isPrime(int n) {
     if (n <= 1) return false;
     if (n <= 3) return true;
     if (n % 2 == 0) return n == 2;
     for (int i = 3; i * i <= n; i += 2)
         if (n % i == 0) return false;
     return true;
 }

 static class PrimeTask implements Runnable {
     int start, end;
     PrimeTask(int s, int e) { start = s; end = e; }
     public void run() {
         for (int i = start; i <= end; i++) {
             if (isPrime(i)) System.out.println(Thread.currentThread().getName() + " prime: " + i);
         }
     }
 }

 public static void main(String[] args) {
	 int n = 4;
     List<Thread> threads = List.of(
    		  new Thread(new PrimeTask(1, 20), "T1"),
    	      new Thread(new PrimeTask(25, 50), "T2"),
    	      new Thread(new PrimeTask(60, 70), "T3"),
    	      new Thread(new PrimeTask(75, 99), "T4")
    		 );
     
     for (int i = 0; i < 4; i++) {
    	 		threads.get(i).start();
     }
 }
}

