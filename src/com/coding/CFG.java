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


class TreeNode
{
    int data;
    TreeNode left, right;
    public TreeNode(int data)
    {
        this.data = data;
        left = right = null;
    }
}



class GfG{

    int maxDepth = -1;


    void rightView(TreeNode node) {
        //add code here.

        rightView(node,-1);

    }

    private void rightView(TreeNode node, int curDepth) {

        if(node==null) return;

        if(curDepth>maxDepth){
            System.out.print(node.data+" ");
            maxDepth = curDepth;
        }

        rightView(node.right,curDepth+1);
        rightView(node.left,curDepth+1);

    }
}


















