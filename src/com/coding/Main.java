package com.coding;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here



        Scanner scanner = new Scanner(System.in);
        String T = scanner.nextLine();
        int t = Integer.parseInt(T);
        for (int h = 0; h <t ; h++) {

            int M= scanner.nextInt();
            int N= scanner.nextInt();

            int[][] A = new int[M][N];

            for (int i = 0; i <M ; i++) {
                for (int j = 0; j < N; j++) {
                    A[i][j] = scanner.nextInt();
                }
            }

            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int K = scanner.nextInt();

            int pre = A[x][y];
            
            replace(x,y,K,pre,A);

            for (int i = 0; i < M ; i++) {
                for (int j = 0; j <N ; j++) {
                    System.out.print(A[i][j]+" ");
                }
            }

            System.out.println();

        }

    }

    private static void replace(int x, int y, int k, int pre, int[][] A) {

        if( (x>=A.length || x<0) || (y>=A[0].length || y<0))
            return;

        if(A[x][y] != pre)
            return;

        A[x][y] = k;
        replace(x,y-1,k,pre,A);
        replace(x,y+1,k,pre,A);
        replace(x-1,y,k,pre,A);
        replace(x+1,y,k,pre,A);


    }


}


