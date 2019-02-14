package com.coding;


import java.util.ArrayList;
import java.util.HashMap;



// Java Program to print Bottom View of Binary Tree
import java.util.LinkedList;
import java.util.Queue;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.HashMap;
import java.io.*;
import java.util.*;

// Tree node class
class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references

    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}


class BottomView
{
    // driver function to test the above functions
    public static void main(String args[])
    {

        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //Node root=null;
        while (t > 0)
        {
            HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
            int n = sc.nextInt();
            Node root=null;
            while (n > 0)
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr = sc.next().charAt(0);
                //  cout << n1 << " " << n2 << " " << (char)lr << endl;
                Node parent = m.get(n1);
                if (parent == null)
                {
                    parent = new Node(n1);
                    m.put(n1, parent);
                    if (root == null)
                        root = parent;
                }
                Node child = new Node(n2);
                if (lr == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                m.put(n2, child);
                n--;
            }

            GfG g = new GfG();

            //g.leftView(root);
            g.bottomView(root);

            System.out.println();
            t--;
        }
    }
}



/*
class Node {
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}*/
class GfG
{
    // Should print bottom view of tree with given root
    public void bottomView(Node root)
    {
        // Your code here

        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        bottomView(root,0,map);


        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        for (int a:map.keySet()) {
            if(a<min)
                min = a;
            if(a>max)
                max = a;
        }

        for (int i = min; i <=max ; i++) {
            int size = map.get(i).size();
            System.out.print(map.get(i).get(size-1 ) +" ");
        }

    }

    private void bottomView(Node node, int level, HashMap<Integer, ArrayList<Integer>> map) {

        if(node==null){
            return;
        }

        if(map.containsKey(level)){
            map.get(level).add(node.data);
        }else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(node.data);
            map.put(level,list);
        }


        bottomView(node.left,level-1,map);
        bottomView(node.right,level+1,map);

    }

}