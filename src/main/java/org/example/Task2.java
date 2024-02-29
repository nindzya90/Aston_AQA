package org.example;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите ваше имя:");
            String name = scan.nextLine();

            if (name.equals("Вячеслав")) {
                System.out.println("Привет " + name);
            } else
                System.out.println("Нет такого имени");
        }
    }
}
