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


            int l = 0,r = 0;
            int sum = a[l] ;
            int flaf = 0;



            while (l<a.length && r<a.length  ){
                if(sum<k && r+1<a.length){
                    sum+= a[r+1];
                    r++;
                }else if(sum>k ){
                    sum-= a[l];
                    l++;
                }else if(sum==k){
                    System.out.println(String.valueOf(l+1)+" "+String.valueOf(r+1));
                    flaf = 1;
                    break;
                }else {
                    break;
                }
            }

            for (int i = 0; i <a.length ; i++) {
                if(a[i]==k){
                    System.out.println(String.valueOf(i+1)+" "+String.valueOf(i+1));
                    flaf=1;
                }
            }

            if(flaf==0)
                System.out.println(-1);


        }

    }
}
