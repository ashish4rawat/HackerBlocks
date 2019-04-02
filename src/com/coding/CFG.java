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


class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
class GfG
{

    public static Node construcTree(int A[], int n)
    {

        Node root =null;
        //Your code here



        HashMap<Integer,Node> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            Node node = new Node(i);
            map.put(i,node);

            if(A[i]==-1){
                root=node;
            }
        }

        for (int i = 1; i < A.length; i++) {


            add(map.get(A[i]),map.get(i));



        }

        return root;

    }

    private static void add(Node node, Node child) {
        if(node.left==null)
            node.left = child;
        else
            node.right = child;


    }

}



















