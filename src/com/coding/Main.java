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

            //for odd
            int max = 1;
            String global = s.charAt(0)+"";
            for (int i = 0; i < s.length() ; i++) {

                int low = i-1,high = i+1;
                String maximum = s.charAt(i)+"";

                while (low>=0 && high<s.length()){
                    if(s.charAt(low) ==  s.charAt(high)){
                        maximum = s.charAt(low) + maximum + s.charAt(high);
                        low--;
                        high++;
                    }else {
                        break;
                    }
                }

                if(maximum.length() > global.length()){
                    global =  maximum;
                }


                low = i;
                high=i+1;
                maximum = "";


                while (low>=0 && high<s.length()){
                    if(s.charAt(low) ==  s.charAt(high)){
                        maximum = s.charAt(low) + maximum + s.charAt(high);
                        low--;
                        high++;
                    }else {
                        break;
                    }
                }

                if(maximum.length() > global.length()){
                    global =  maximum;
                }

            }
            System.out.println(global);


        }

    }




}


