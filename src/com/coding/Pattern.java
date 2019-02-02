package com.coding;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();


        int k = 0;
        for (int i = 0; i <n ; i++) {



            for (int j = 0; j < n-i-1; j++) {
                System.out.print("$");
            }

            for (int j = 0; j < i+1; j++) {
                System.out.print("#");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }




            
            System.out.println();
        }

        

    }
}
