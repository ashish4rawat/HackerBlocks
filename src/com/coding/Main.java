package com.coding;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        String T = scanner.nextLine();
        int t = Integer.parseInt(T);
        for (int h = 0; h <t ; h++) {

            String s = scanner.nextLine();
            int[] hash = new int[256];



            for (int i = 0; i <s.length() ; i++) {
                hash[s.charAt(i)] = -1;
            }

            for (int i = 0; i < s.length() ; i++) {

                if(hash[s.charAt(i)]==-1){
                    System.out.print(s.charAt(i));
                    hash[s.charAt(i)] = i;
                }

            }

            System.out.println();


        }


    }


}


