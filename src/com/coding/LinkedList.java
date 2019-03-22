package com.coding;

import java.util.*;

public class LinkedList {

    public static void main(String[] args) {
        // write your code here



        Scanner scanner = new Scanner(System.in);
        String T = scanner.nextLine();
        int t = Integer.parseInt(T);
        for (int h = 0; h <t ; h++) {

            int n= scanner.nextInt();



            int[] A = new int[n];

            for (int i = 0; i < A.length; i++) {
                A[i] = scanner.nextInt();
            }
            int k = scanner.nextInt();

            int[][] mem = new int[A.length][k+1];


            System.out.println(ways(k,0,A,mem,""));





        }



    }

    private static int ways(int n, int i , int[] A,int[][] mem,String s) {

        if(n==0){
            //System.out.println(s);
            return 1;
        }

        if(i==A.length)
            return 0;

        if(mem[i][n]!=0)
            return mem[i][n];


        int sum = 0;
        if(A[i]<=n){
            sum += ways(n-A[i] ,i, A,mem,s+A[i]+", ");
        }

        sum += ways(n,i+1,A,mem,s);

        mem[i][n] = sum;
        return sum;
    }


}
