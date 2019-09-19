package com.milnesium;
import java.util.Scanner;

public class CountingCharNos {

    public static void main(String[] args) {

        System.out.println("What is the input string?");
        Scanner scanner = new Scanner(System.in);
        String characters = scanner.nextLine();

        if (characters==null){
            System.out.println("Please insert an input");
        }

        else{
            System.out.println(characters+" has "+ characters.length()+" characters");
        }
    }
}
