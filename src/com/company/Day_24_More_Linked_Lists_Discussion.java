package com.company;

import java.util.Scanner;

/**
 * A Node class is provided for you in the editor. A Node object
 * has an integer data field, data, and a Node instance pointer,
 * next, pointing to another node (i.e.: the next node in a list).
 * <p>
 * A removeDuplicates function is declared in your editor, which
 * takes a pointer to the head node of a linked list as a parameter.
 * Complete removeDuplicates so that it deletes any duplicate nodes
 * from the list and returns the head of the updated list.
 */
class Node_3_Discussion {
    int data;
    Node_3_Discussion next;

    Node_3_Discussion(int d) {
        data = d;
        next = null;
    }
}

public class Day_24_More_Linked_Lists_Discussion {

    public static Node_3_Discussion removeDuplicates(Node_3_Discussion head) {
        //Write your code here
        if (head == null || head.next == null)
            return head;

        if (head.data == head.next.data) {
            head.next = head.next.next;
            removeDuplicates(head);
        } else
            removeDuplicates(head.next);

        return head;
    }

    public static Node_3_Discussion insert(Node_3_Discussion head, int data) {
        Node_3_Discussion p = new Node_3_Discussion(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            Node_3_Discussion start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
        return head;
    }

    public static void display(Node_3_Discussion head) {
        Node_3_Discussion start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node_3_Discussion head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }
}
