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

            Stack<String> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i <s.length() ; i++) {
                char ch = s.charAt(i);
                if(ch=='.'){
                    stack.push(sb.toString());
                    stack.push(".");
                    sb = new StringBuilder();
                }else {
                    sb.append(ch);
                }


            }

            stack.push(sb.toString());

            while (!stack.isEmpty()){
                System.out.print(stack.pop());
            }
            System.out.println();

        }

    }




}


