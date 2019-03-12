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


            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i <n ; i++) {
                A[i] = scanner.nextInt();
            }

            int k= scanner.nextInt();
            for (int i = 0; i <n ; i++) {
                A[i] = A[i] % k;

                if(map.containsKey(A[i])){
                    map.put(A[i],map.get(A[i])+1);
                }else {
                    map.put(A[i],1);
                }


            }


            System.out.println(take(A,map,k));












        }

    }

    private static boolean take(int[] A,HashMap<Integer, Integer> map,int k) {
        for (int key:map.keySet()) {



        }
        return true;
    }

}
