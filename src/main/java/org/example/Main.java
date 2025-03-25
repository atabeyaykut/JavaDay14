package org.example;


import java.util.Stack;

public class Main {
    public static void main(String[] args) {



    }

    public static boolean checkForPalindrome(String input) {
        if (input.isEmpty()) return true;

        String processed = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        String reversed = new StringBuilder(processed).reverse().toString();

        return processed.equals(reversed);
    }


    public static String convertDecimalToBinary(int num) {
        if (num == 0) return "0";

        Stack<Integer> stack = new Stack<>();
        while (num > 0) {
            stack.push(num % 2);
            num /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }
        return binary.toString();
    }
}