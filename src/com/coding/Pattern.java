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
            System.out.println(jumps(0,A,mem));


            System.out.println(Arrays.toString(mem));





        }



    }


    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    void mirror(Node node)
    {
        // Your code here

        if(node==null)
            return;


        Node temp = node.left;
        node.left = node.right;
        node.right  =temp;

        mirror(node.left);
        mirror(node.right);

    }

    private static int jumps(int index, int[] A, int[] mem) {



        if(index==A.length-1)
            return 0;

        if(index>=A.length)
            return -1;

        if(A[index]==0){
            return -1;
        }

        if(mem[index]!=0)
            return mem[index];

        int min = Integer.MAX_VALUE,max = -1;
        for (int i = 1; i <=A[index] ; i++) {

            int y = 1+ jumps(index+i,A,mem);

            max = Math.max(max,y);
            if(y==0)
                continue;

            min = Math.min(y,min);;



        }

        if(max==0){
            mem[index] = -1;
            return -1;
        }else {
            mem[index] = min;
            return min;
        }



    }


}
