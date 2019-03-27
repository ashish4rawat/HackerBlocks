package com.coding;

import java.util.*;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here



        Scanner scanner = new Scanner(System.in);
        String T = scanner.nextLine();
        int t = Integer.parseInt(T);
        for (int h = 0; h <t ; h++) {





            int n = scanner.nextInt();

            int count = 0,a =1;
            while (n!=0){

                if( (n & a)  == 1 ){
                    break;
                }
                n = n>>1;
                count++;

            }

            if(n==0){
                System.out.println(0);
            }else {
                System.out.println(count+1);
            }



        }


    }

    private static boolean minEdit(int m, int n, String mStr, String nStr, int[][] mem) {
        return true;
    }


    public void DFS(int v, LinkedList<Integer> adj[], boolean visited[])
    {
        // add code here.


        System.out.println(adj[v].get(0));
        System.out.println(adj[v].get(1));


        System.out.print(v+" ");

        visited[v] = true;

        while (!adj[v].isEmpty()){
            if(!visited[adj[v].getFirst()])
            {
                DFS(adj[v].getFirst(),adj,visited);
                adj[v].removeFirst();
            }



        }

        LinkedList<Integer> edges = adj[v];
        if(edges != null) {
            for(Integer edge : edges) {
                if(!visited[edge]) {
                    DFS(edge, adj, visited);
                }
            }
        }





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


