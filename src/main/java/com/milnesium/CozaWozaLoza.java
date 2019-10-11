package com.milnesium;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static com.milnesium.CozaLozaWoza.printCozaLozaWoza;

class CozaLozaWoza {

    public static void main(String[] args) {
        printCozaLozaWoza();
    }

    public static void printCozaLozaWoza() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the start number:");
        int start = scanner.nextInt();
        System.out.println("Please enter the end number:");
        int end = scanner.nextInt();
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza");
            } else if (i % 3 == 0) {
                System.out.print("Coza");
            } else if (i % 5 == 0) {
                System.out.print("Loza");
            } else if (i % 7 == 0) {
                System.out.print("Woza");
            } else {
                System.out.print(i);
            }

            if (i % 11 != 0) {
                System.out.print(" ");
            }
            if (i % 11 == 0) {
                System.out.println();
            }
        }
    }
}