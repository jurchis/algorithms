package com.milnesium;

import java.util.Scanner;

public class PrintingQuotes {

    public static void main(String[] args) {

        System.out.println("What is the quote");
        Scanner scanner = new Scanner(System.in);
        String quote = scanner.nextLine();
        System.out.println("Who said that?");
        String author = scanner.nextLine();
        System.out.println(author+" said \""+quote+"\"");
    }
}
