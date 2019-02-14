package com.coding;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,54);
        list.add(3,54);

        Scanner scanner = new Scanner(System.in);
        String T = scanner.nextLine();
        int t = Integer.parseInt(T);
        for (int h = 0; h <t ; h++) {

            String N = scanner.next();
            int n = Integer.parseInt(N);

            String[] strings = new String[n];


            int min = Integer.MAX_VALUE;
            for (int i = 0; i <n ; i++) {
                strings[i] = scanner.next();
                min = Math.min(min,strings[i].length());
            }


        }

    }







}


