package com.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        while(t-->0)
        {

            int n=Integer.parseInt(br.readLine());
            String str[]=br.readLine().trim().split(" ");
            int A[]=new int[n];


            for (int i = 0; i <n ; i++) {
                A[i] = Integer.parseInt(str[i]);
            }

            Arrays.sort(A);
            int l = 0,r = A.length-1;

            int minSum = Integer.MAX_VALUE;
            while (l<r){
                int sum = A[l] + A[r];

                if( Math.abs(sum) < Math.abs(minSum) ){
                    minSum = sum;
                }

                if( sum<0){
                    l++;
                }else {
                    r++;
                }

            }





            System.out.println(minSum);


        }






    }




}


