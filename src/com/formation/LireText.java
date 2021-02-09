package com.formation;

import java.util.Scanner;
import java.util.StringTokenizer;

public class LireText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir une phrase: ");
        String phrase = scanner.nextLine();

        StringTokenizer str = new StringTokenizer(phrase);
        System.out.println(str.countTokens());

    }
}
