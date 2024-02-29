package org.example;


import java.util.Scanner;

public class Task1
{
    public static void main( String[] args ){
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Введите любое число: ");
            int num = scan.nextInt();
            if (num >= 7) {
                System.out.println("Привет");
            }
        }
    }



}
