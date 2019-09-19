package com.milnesium;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SayingHello {

    public static void main(String[] args) {

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, "+name+ ", nice to meet you!");
    }
}
