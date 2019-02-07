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

            int low = 0 , mid = 0 , high = n-1;

            while (mid<high){

                if(a[mid]==0){
                    swap(mid,low,a);
                    low++;
                    mid++;
                }else if(a[mid]==1){
                    mid++;
                }else if(a[mid]==2){
                    swap(mid,high,a);
                    high--;
                }

            }

            for (int i = 0; i <n ; i++) {
                System.out.print(a[i]+" ");
            }

        }

    }

    private static void swap(int x, int y, int[] a) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
