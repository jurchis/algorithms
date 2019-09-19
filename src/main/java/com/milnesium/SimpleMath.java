package com.milnesium;

import java.util.Scanner;

public class SimpleMath {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the first number?");
        int first = scanner.nextInt();
        System.out.println("What is the second number?");
        int second = scanner.nextInt();


        System.out.println(first+"+"+second+"="+(first+second));
        System.out.println(first+"-"+second+"="+(first-second));
        System.out.println(first+"/"+second+"="+(first/second));
        System.out.println(first+"*"+second+"="+(first*second));

        System.out.println("\n"+first+"+"+second+"="+(first+second)+"\n"+
                first+"-"+second+"="+(first-second)+"\n"+
                first+"/"+second+"="+(first/second)+"\n"+
                first+"*"+second+"="+(first*second));
    }
}
