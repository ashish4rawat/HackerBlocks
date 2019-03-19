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



            int[] A = new int[n];

            for (int i = 0; i < A.length; i++) {
                A[i] = scanner.nextInt();
            }

            int[] mem = new int[n];
            System.out.println(jumps(0,A,mem,0));


            System.out.println(Arrays.toString(mem));





        }



    }

    private static int jumps(int index, int[] A, int[] mem,int jump) {

        if(index>A.length){
            return -1;
        }

        if(index==A.length)
            return jump;

        if(A[index]==0){
            return -1;
        }

        if(mem[index]!=0)
            return mem[index];

        int min = Integer.MAX_VALUE;
        for (int i = 1; i <=A[i] ; i++) {
            int y = jumps(index+i,A,mem,jump+1);

            if(y==-1)
                continue;


            min = Math.min(y,min);
        }


        mem[index] = min;

        return min;

    }


}
