package com.coding;

import java.util.*;
import java.util.LinkedList;

public class Pattern {

    public static void main(String[] args) {
        // write your code here

        /*Scanner s  = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0){

            int n = s.nextInt();
            int[] A = new int[n];
            for (int i = 0; i <n ; i++) {
                A[i] = s.nextInt();
            }





        }
*/


        //printpa();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll( Arrays.asList(1,1,0));
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(0,0,1));

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll( Arrays.asList(1,0,1));

        list.add(list1);
        list.add(list2);
        list.add(list3);


        findIslands(list,0,0);


    }

    private static void printpa() {

        int n = 5,count=1,oldcount=0;

        for (int i = 1; i <= n; i++) {

            if(i%2==0) {
                count += i-1;
                oldcount = count;
            }else {
                count = oldcount+1;
            }


            for (int j = 0; j < i; j++) {

                if(i%2==0)
                    System.out.print(count--);
                else
                    System.out.print(count++);

                if(j!=i-1) System.out.print("*");
            }
            System.out.println();
        }



    }


    static int findIslands(ArrayList<ArrayList<Integer>> list, int N, int M)
    {

        // Your code here
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j <list.get(0).size() ; j++) {

                if(list.get(i).get(j)==1){
                    traverse(i,j,list);
                    ++count;
                }

            }
        }
        return count;


    }

    private static void traverse(int x, int y, ArrayList<ArrayList<Integer>> list) {

        list.get(x).set(y,0);
        for (int i = x-1; i <= x+1; i++) {
            for (int j = y-1; j <=y+1 ; j++) {
                if(i==x && j==y) continue;

                if( i>-1 && i<list.size() && j>-1 && j<list.get(0).size()  && list.get(i).get(j)==1){
                    traverse(i,j,list);
                }
            }
        }

    }

}

