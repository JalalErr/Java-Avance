package com;

import java.util.*;

public class Task1{

		 public static void main(String[] args) {	        
			 Thread t1 = new Thread(() -> {
	            for (int i = 0; i <= 20; i += 2) System.out.println("T1 pair: " + i);
	        }, "T1");
	        Thread t2 = new Thread(() -> {
	            for (int i = 1; i < 20; i += 2) System.out.println("T2 impair: " + i);
	        }, "T2");

	        t1.start();
	        t2.start();

	        try {
	            t1.join();
	            t2.join();
	        } catch (InterruptedException e) { e.printStackTrace(); }
	    }
}


