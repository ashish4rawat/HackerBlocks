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
            int A[] = new int[n];
            for (int i = 0; i <n ; i++) {
                A[i] = scanner.nextInt();
            }


            int x = findMin(0,A.length,A);
            System.out.println(A[x]);

        }


    }

    public static int findMin(int l,int r,int[] A){

        if(A[l]<=A[r-1] )
            return l;
        else {
            int mid = (l+r)/2;
            int a = findMin(l,mid,A);
            int b = findMin(mid,r,A);
            if(A[a]<A[b])
                return a;
            else
                return b;

        }

    }

    private static boolean isPrime(int n) {

        for (int i = 2; i*i <= n; i++) {
            if(n%i==0)
                return false;
        }
        return true;
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
