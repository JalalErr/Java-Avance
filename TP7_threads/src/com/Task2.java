package com;

public class Task2{
    public static void main(String[] args) {
        Thread pairs = new Thread(() -> {
            for (int i = 0; i <= 20; i += 2) {
                System.out.println("Pair: " + i);
            }
        });

        Thread impairs = new Thread(() -> {
            for (int i = 1; i < 20; i += 2) {
                System.out.println("Impair: " + i);
            }
        });

        pairs.start();  
        try {
            pairs.join();  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        impairs.start();
    }
}
