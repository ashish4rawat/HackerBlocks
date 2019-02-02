package com.coding;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();



        int x = (int) (Math.log10(a)/Math.log10(b));

        System.out.println(x);


    }
}
