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
    int data;
    Node left, right, nextRight;
    Node(int item)
    {
        data = item;
        left = right = nextRight = null;

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

















