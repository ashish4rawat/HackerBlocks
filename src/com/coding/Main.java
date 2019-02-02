package com.coding;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String s= scanner.nextLine();

        if(s.charAt(0)>='a' && s.charAt(0)<='z'){
            System.out.println("lowercase");
        }
        else if(s.charAt(0)>='A' && s.charAt(0)<='Z'){
            System.out.println("UPPERCASE");
        }else {
            System.out.println("Invalid");
        }


    }
}
