package com.coding;

import java.util.*;

public class Pattern {

    public static void main(String[] args) {
        // write your code here



        Scanner scanner = new Scanner(System.in);
        String T = scanner.nextLine();
        int t = Integer.parseInt(T);
        for (int h = 0; h <t ; h++) {

            int n= scanner.nextInt();

            int[][] mem = new int[n+1][3];
            System.out.println(ways(n,2,mem));



        }


    }

    private static int ways(int n, int prev, int[][] mem) {

        if(n==0)
            return 1;

        if(mem[n][prev] != 0)
            return  mem[n][prev];

        int sum = 0;
        if(prev!=1)
            sum+= ways(n-1,1,mem);

        sum+= ways(n-1,0,mem);


        mem[n][prev] = sum%1000000007;
        return mem[n][prev];

    }


}
