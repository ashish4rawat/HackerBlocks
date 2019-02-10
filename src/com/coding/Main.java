package com.coding;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        String T = scanner.nextLine();
        int t = Integer.parseInt(T);
        for (int h = 0; h <t ; h++) {

            String str = scanner.nextLine();
            for (int i = 0; i <str.length() ; i++) {
                char ch = str.charAt(i);


            }


        }

    }


    int atoi(String str)
    {
        int num = 0,digit=0,flag = 0;
        // Your code here
        for (int i = 0; i <str.length() ; i++) {


            char ch = str.charAt(i);

            if(i==0 && ch=='-'){
                flag=1;
                continue;
            }

            if(ch>='0' && ch<='9'){
                digit = ch-'0';

            }else {
                return -1;
            }

            num = num*10 +digit  ;

        }

        if(flag==1){
            return -num;
        }
        return num;
    }


}


