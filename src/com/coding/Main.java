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

            int[] a = new int[n];

            for (int i = 0; i <n ; i++) {
                a[i] = scanner.nextInt();
            }

            int[]  mem = new int[n];
            System.out.println(maxSum(0,a,mem,0));


        }

    }

    private static int maxSum(int i, int[] a, int[] mem, int max) {

        if(i==a.length){
            return 0;
        }


        if(mem[i]!=0){
            return mem[i];
        }


        int accept=0,reject;
        if(a[i]>max){
            accept = a[i]+maxSum(i+1,a,mem,a[i]);
        }
        reject = maxSum(i+1,a,mem,max);

        mem[i] = Math.max(accept,reject);

        return mem[i];
    }


}
