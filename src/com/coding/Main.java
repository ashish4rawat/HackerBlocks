package com.coding;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        String T = scanner.nextLine();
        int t = Integer.parseInt(T);
        for (int h = 0; h <t ; h++) {

            String N = scanner.next();
            int n = Integer.parseInt(N);

            String[] strings = new String[n];

            for (int i = 0; i <n ; i++) {
                strings[i] = scanner.next();
            }




        }

    }

    private static int check(String str, String pattern) {

        if(pattern.length()>str.length())
            return -1;

        int sum = 0;
        int cursum = 0;
        for (int i = 0; i <pattern.length() ; i++) {

            sum += pattern.charAt(i);
            cursum += str.charAt(i);

        }

        for (int i = pattern.length()-1; i <str.length() ; i++) {

            if(cursum==sum){

                String prev = str.substring(i-pattern.length()+1 , i+1);
                if(prev.equals(pattern))
                    return i - pattern.length() + 1;

            }

            if(i+1<str.length())
                cursum += str.charAt(i+1);

            cursum -= str.charAt(i-pattern.length()+1);


        }


        return -1;
    }




}


