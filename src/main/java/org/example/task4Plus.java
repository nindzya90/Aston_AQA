package org.example;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


public class task4Plus {
    public static void main(String[] args) {
        //String input = "[((())()(())]]";
        while (true) {
            System.out.print("Введите скобки для проверки: ");
            Scanner scan = new Scanner(System.in);
            String val = scan.nextLine();


            Deque<Character> stack = new LinkedList<>();

            for (int i = 0; i < val.length(); i++) {
                char ch = val.charAt(i);

                System.out.println(val);
                System.out.print("Current " + ch + ", Stack " + stack);

                Character last;
                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')') {
                    last = stack.pop();
                    if (last != '(') {
                        System.err.println("INVALID");
                        return;
                    }
                } else if (ch == ']') {
                    last = stack.pop();

                    if (last != '[') {
                        System.err.println("INVALID");
                        return;
                    }
                }
            }
            if (stack.isEmpty()) {
                System.out.println("VALID");
            } else
                System.out.println("INVALID");
        }
    }
}