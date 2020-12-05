package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
class Node_3 {
    int data;
    Node_3 next;

    Node_3(int d) {
        data = d;
        next = null;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}

public class Day_24_More_Linked_Lists {

    public static Node_3 removeDuplicates(Node_3 head) {
        //Write your code here
        if (head == null)
            return head;
        Set<Integer> list = new HashSet<>();
        list.add(head.data);
        Node_3 currentNode = head;
        while (currentNode.next != null) {
            int nextData = currentNode.next.data;
            if (list.contains(nextData))
                currentNode.next = currentNode.next.next;
            else {
                list.add(nextData);
                currentNode = currentNode.next;
            }
        }

        return head;

    }

    public static Node_3 insert(Node_3 head, int data) {
        Node_3 p = new Node_3(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            Node_3 start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
        return head;
    }

    public static void display(Node_3 head) {
        Node_3 start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node_3 head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }
}
