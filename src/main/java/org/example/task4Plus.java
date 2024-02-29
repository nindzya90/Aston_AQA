package org.example;
import java.util.Deque;
import java.util.LinkedList;




public class task4Plus {
    public static void main(String[] args) {
        String input = "[((())()(())]]";

        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            System.out.println(input);
            System.out.print("Current " + ch + ", Stack " + stack);

            Character last;
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                last = stack.pop();
                if (last != '(') {
                    System.err.println(" INVALID ");
                    return;
                }
            } else if (ch == ']') {
                last = stack.pop();

                if (last != '[') {
                    System.err.println(" INVALID ");
                    return;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("VALID");
        } else System.out.println("INVALID");
    }
}