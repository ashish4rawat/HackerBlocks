package com.coding;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();


        int k = 0;
        for (int i = 0; i <n ; i++) {



            for (int j = 0; j < n/2-k; j++) {
                System.out.print("$");
            }

            for (int j = 0; j < 2*k+1; j++) {
                System.out.print("#");
            }




            if(i<n/2)
                k++;
            else
                k--;


            
            System.out.println();
        }

        

    }
}
