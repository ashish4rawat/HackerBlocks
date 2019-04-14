package com.coding;

import javafx.scene.control.Alert;

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

            int co=0;

            int min=-1,max=-1;
            for (int i = 0; i < A.length; i++) {

                if(min==-1){
                    if(i+1<A.length && A[i]<A[i+1])
                        min=i;
                }else if(max==-1){
                    if( (i+1<A.length && A[i]>A[i+1]) || (i==A.length-1) ){
                        max=i;

                        System.out.print("("+ min+" "+max +") ");
                        min=-1;
                        max=-1;
                        ++co;
                    }
                }
            }
            if(co==0)
                System.out.print("No Profit");

            System.out.println();




        }


    }

    private static int search(int[] a, int l, int r,int x) {
        for (int i = 0; i <a.length ; i++) {
            if(i==l||i==r)
                continue;
            if(a[i]==x)
                return i;

        }
        return -1;
    }


    static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid-1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid+1, r, x);
        }

        // We reach here when element is not present
        //  in array
        return -1;
    }

    private static void swap(int i, int lastZero, int[] a) {
        int tem = a[i];
        a[i] = a[lastZero];
        a[lastZero] = tem;
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
