package com.coding;

class Node {
    int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
}
class gfg
{

    // This function should reverse linked list and return
    // head of the modified linked list.
    Node reverse(Node head)
    {
        // add code here

        reverseMy(head);

        Node node = head;
        while (node.next!=null){
            node = node.next;
        }
        return node;
    }

    private Node reverseMy(Node curNode) {

        if(curNode.next==null){
            return curNode;
        }

        Node n = reverseMy(curNode.next);
        n.next = curNode;
        return curNode;
    }
}