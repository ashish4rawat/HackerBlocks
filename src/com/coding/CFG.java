package com.coding;


import org.omg.CORBA.INTERNAL;

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
}

class Pair{
    int height,value;

    public Pair(int height, int value) {
        this.height = height;
        this.value = value;
    }
}

class GfG
{
    // Should print bottom view of tree with given root
    public void bottomView(Node node)
    {
        // Your code here

        HashMap<Integer,Pair> map = new HashMap<>();


        bottom(node,map,0,0);

        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        for (int key:map.keySet()) {
            min = Math.min(key,min);
            max = Math.max(key,max);
        }

        for (int i = min; i <=max ; i++) {
            System.out.print(map.get( i ).value+" ");
        }

    }

    private void bottom(Node node, HashMap<Integer, Pair> map,int dist,int height) {


        if(node==null)
            return;

        if(map.containsKey(dist)){

            Pair p = map.get(dist);

            if(p.height<=height){
                map.put(dist , new Pair(height,node.data));
            }

        }else {
            map.put(dist,new Pair(height,node.data));
        }


        bottom(node.left,map,dist-1,height+1);
        bottom(node.right,map,dist+1,height+1);

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
class GfGf
{


    boolean isIdentical(Node node1, Node node2)
    {
        //Your code here
        if(node1==null && node2==null){
            return true;
        }

        if(node1!=null && node2!=null && node1.data==node2.data)
            return isIdentical(node1.left,node2.left) && isIdentical(node1.right,node2.right);
        else
            return false;

    }




}

















