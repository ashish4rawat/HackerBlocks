package com.coding;


import java.util.ArrayList;

class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class GfG
{

    ArrayList<ArrayList> lists = new ArrayList<>();

    void leftView(Node root)
    {
        // Your code here
        ArrayList<ArrayList> lists = new ArrayList<>();

        leftView(root,0,lists);

        for (int i = 0; i <lists.size() ; i++) {
            System.out.print(lists.get(i).get(0)+" ");
        }

    }

    private void leftView(Node node, int level,  ArrayList<ArrayList> lists) {

        if(node==null){
            return;
        }

        if(lists.size()<level+1){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(node.data);
            lists.add(list);
        }else {
            lists.get(level).add(node.data);
        }

        leftView(node.left,level+1,lists);
        leftView(node.right,level+1,lists);

    }
}