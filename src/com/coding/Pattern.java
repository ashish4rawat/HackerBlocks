package com.coding;

import java.util.*;
import java.util.LinkedList;

public class Pattern {

    public static void main(String[] args) {
        // write your code here

        Scanner s  = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0){

            int x = s.nextInt();
            int[] A = new int[x];

            ArrayList<Integer> list = new ArrayList<>();
            HashMap<Integer,Integer> map = new HashMap<>();

            for (int i = 0; i <x ; i++) {
                int xfd = s.nextInt();
                list.add(xfd);
                if(map.containsKey(xfd)){
                    map.put( xfd,map.get(xfd)+1 );
                }else {
                    map.put(xfd,1);
                }

            }






            Collections.sort(list,new Comparator<Integer>(){
                public int compare(Integer o1,Integer o2){

                    int x = map.get(o2).compareTo(map.get(o1));
                    if(x!=0) return x;



                    return o1.compareTo(o2);
                }
            });

            for (int n:list){
                System.out.print(n+" ");
            }

            System.out.println();


        }








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


    static void dfs(int src, ArrayList<ArrayList<Integer>> list, boolean vis[])
    {
        // add your code here
        System.out.println(src);
        vis[src] = true;


        for (int i = 0; i < list.get(src).size(); i++) {

            int  x = list.get(src).get(i);
            if( !vis[x] )
                dfs(x,list,vis);

        }



    }


    static void bfs(int s, ArrayList<ArrayList<Integer>> list, boolean vis[], int nov)
    {
        // add your code here


    }



}

