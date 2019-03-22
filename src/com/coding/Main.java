package com.coding;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here



        Scanner scanner = new Scanner(System.in);
        String T = scanner.nextLine();
        int t = Integer.parseInt(T);
        for (int h = 0; h <t ; h++) {


            int m= scanner.nextInt();



            int n = scanner.nextInt();

            String mStr = scanner.nextLine();
            String nStr = scanner.nextLine();

            int[][] mem = new int[m+1][n+1];
            System.out.println(minEdit(m,n,mStr,nStr,mem));


        }


    }

    private static int minEdit(int m, int n, String mStr, String nStr, int[][] mem) {



    }

    private static int minSum(int i, int sum, int k, int[] A, int[][] mem) {

        if(i==A.length){

            //System.out.println(sum);
            return Math.abs(2*sum-k);
        }


        if(mem[i][sum]!=0)
            return mem[i][sum];

        int min = Math.min( minSum(i+1,sum+A[i] , k ,A,mem) ,
                         minSum(i+1,sum , k ,A,mem) );

        mem[i][sum] = min;

        return mem[i][sum];


    }

    private static int ways(int n, int[] mem) {
        if(n==0){
            return 1;
        }

        if(mem[n]!=0)
            return mem[n];

        int sum = 0;
        for (int i = 1; i <4 ; i++) {
            if(n-i>=0)
                sum += ways(n-i,mem);
        }

        mem[n] = sum;
        return sum;
    }


    public static int maxHeight(int height[], int width[], int length[], int n)
    {
        // your code here

        System.out.println("Heigh : "+Arrays.toString(height));

        int[] mem = new int[n];
        for (int i = 0; i < n; i++) {
            mem[i]  = 1;
        }


        int max = -1;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < i; j++) {

                if(check(length[i],width[i],length[j],width[j])){
                    mem[i] =  Math.max(mem[i],height[i]+mem[j]);
                }

            }

            max = Math.max(mem[i],max);
        }

        return max;

    }

    private static boolean check(int l, int w, int a, int b) {

        if( (l<a && w<b )|| ( l<b && w<a))
            return true;

        return false;
    }


}


