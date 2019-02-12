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
    public Node newHead = null;
    Node reverse(Node head)
    {
        // add code here

        reverseMy(head);



        return newHead;
    }

    private Node reverseMy(Node curNode) {

        if(curNode.next==null){
            newHead = curNode;
            return curNode;
        }

        Node n = reverseMy(curNode.next);
        n.next = curNode;
        curNode.next = null;

        return curNode;
    }

}