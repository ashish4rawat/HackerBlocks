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
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class GfG
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        if(node==null)
            return null;

        Node head = node;



        Node pre = null;
        Node cur = node,post;
        int count = k;
        while (cur!=null && count!=0){

            post = cur.next;
            cur.next = pre;
            pre = cur;
            cur = post;

            --count;
        }

        head.next = reverse(cur,k);
        return pre;

    }
}




















