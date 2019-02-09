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

            System.out.println(getStatus(s));


        }

    }

    private static String getStatus(String s) {

        Stack<Character> stack = new Stack<>();

        for (int j = 0; j <s.length() ; j++) {

            char ch = s.charAt(j);

            if(ch=='{' || ch=='[' || ch=='(') {
                stack.push(ch);
            }
            else if(stack.size()>0){
                char ch1 = stack.pop();
                if(ch==']' && ch1!='[')
                    return "not balanced";
                if(ch=='}' && ch1!='{')
                    return "not balanced";
                if(ch==')' && ch1!='(')
                    return "not balanced";
            }
            else {
                return "not balanced";
            }

        }

        if(stack.isEmpty())
            return "balanced";
        else
            return "not balanced";



    }


}


