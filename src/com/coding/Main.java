package com.coding;

import java.util.*;

public class Main {

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

            int[][] mem = new int[A.length][A.length];

            System.out.println(take(-1,0,A,0,mem));







        }


    }

    private static int take(int prev, int i, int[] A, int len,int[][] mem) {

        if(i==A.length){
            return len;
        }

        if(prev!=-1 && mem[prev][i]!=0){
            return mem[prev][i];
        }

        int x = 0;
        if(prev==-1 || A[i]>A[prev]){
            x = take(A[i],i+1,A,len+1,mem);
        }

        int y = take(prev,i+1,A,len,mem);


        mem[prev][i] = Math.max(x,y);
        return mem[prev][i];


    }


}


