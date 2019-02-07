package com.coding;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int h = 0; h <T ; h++) {

            int n= scanner.nextInt();
            int k = scanner.nextInt();

            int[] a = new int[n];

            for (int i = 0; i <n ; i++) {
                a[i] = scanner.nextInt();
            }

            int[] mem = new int[a.length+1];
            mem[0] = a[0];
            int max = a[0];


            for (int i = 1; i < a.length; i++) {

                mem[i] = Math.max(mem[i-1]+a[i],a[i]);
                if(mem[i]>max){
                    max = mem[i];
                }

            }

            System.out.println(max);

        }

    }
}
