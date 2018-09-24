package ru.innopolis;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(() -> {
                Integer[] arr = new Integer[500];
                while (true) {
                    arr = new Integer[100];
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
        }
        scanner.nextLine();
        System.exit(0);
    }
}