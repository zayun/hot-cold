package ru.sbt.smoldyrev.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Отгадай число (1-100)");
        System.out.println("Чтобы выйти из игры, введи любой текст");
        Scanner scanner = new Scanner(System.in);
        int secret  = 1 + (int)(Math.random() * ((100 - 1) + 1));
        System.out.println(secret);
        int preUserVariant = 0;
        while (scanner.hasNextInt()) {
            int userVariant = scanner.nextInt();
            if (userVariant == secret) {
                System.out.println("WIN!");
                break;
            } else {
                System.out.println(Math.abs(secret - userVariant) > Math.abs(secret - preUserVariant) ? "cold" : "hot");
                preUserVariant = userVariant;
            }
        }
    }
}
