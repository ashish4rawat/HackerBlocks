package com.coding;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        String T = scanner.nextLine();
        int t = Integer.parseInt(T);
        for (int h = 0; h <t ; h++) {

            String A = scanner.next();
            String B = scanner.next();


            String a = scanner.next();
            String b = scanner.next();

            int[][] mem = new int[a.length()+1][b.length()+1];
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < b.length(); j++) {

                    if(a.charAt(i) == b.charAt(j)){
                        mem[i+1][j+1]  =  mem[i][j] + 1;
                    }
                    if(mem[i+1][j+1] > max)
                        max = mem[i+1][j+1];

                }
            }

            System.out.println(max);

        }

    }


}


