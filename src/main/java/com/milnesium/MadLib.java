package com.milnesium;

import java.util.Scanner;

public class MadLib {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a noun:");
        String noun = scanner.next();
        System.out.println("Enter a verb:");
        String  verb = scanner.next();
        System.out.println("Enter an adjective:");
        String adjective = scanner.next();
        System.out.println("Enter an adverb:");
        String adverb = scanner.next();
        System.out.println("Do you "+verb+" your "+ adjective +" "+noun+" "+adverb+"? That's hilarious!");
    }


}
