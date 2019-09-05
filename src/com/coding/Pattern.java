package com.coding;

import java.util.*;
import java.util.LinkedList;

public class Pattern {

    public static void main(String[] args) {
        // write your code here

/*
        1
        6
        61 1 7 3 6 7*/
        Scanner s  = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0){

            int n = s.nextInt();
            int[] A = new int[n];
            for (int i = 0; i <n ; i++) {
                A[i] = s.nextInt();
            }


            int i=0,min=-1,max=-1,pro = 0;
            while (i<A.length-1){

                if(i+1<A.length && A[i]<A[i+1]){
                    min = A[i];
                    i++;
                }

                while (min!=-1 && i+1<A.length && A[i]<A[i+1]){
                    i++;
                }

                max = A[i];

                if(min!=-1 && max!=-1){
                    pro += max-min;
                    min=-1;max=-1;
                }

                i++;

            }

            System.out.println(pro);


        }

    }



}
