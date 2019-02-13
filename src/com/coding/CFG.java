package com.coding;

import java.util.HashSet;

class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

class GFG
{
    int intersectPoint(Node headA, Node headB)
    {
        // code here
        HashSet<Integer> set = new HashSet<>();

        while (headA!=null){
            set.add(headA.data);
            headA = headA.next;
        }
        while (headB!=null){
            if(set.contains(headB.data)){
                return headB.data;
            }

            headB = headB.next;
        }

        return -1;




    }

}